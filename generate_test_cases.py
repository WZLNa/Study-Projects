#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
生成资产管理系统的完整测试用例
按照表格要求补全所有模块的测试用例到指定数量
"""

import csv
import re
from collections import defaultdict

# 配置
CSV_INPUT = r"c:\Users\Lenovo\Desktop\功能测试用例.csv"
CSV_OUTPUT = r"c:\Users\Lenovo\Desktop\功能测试用例_完整版.csv"

# 模块定义：前缀 -> (模块名, 总数, 序列号格式)
MODULES = {
    'DLMK': ('登录', 17, 'SRS001'),
    'SY': ('首页', 4, ''),
    'GRXX': ('个人信息', 62, ''),
    'ZCLB': ('资产类别', 51, ''),
    'PP': ('品牌', 51, ''),
    'QDFX': ('取得方式', 51, ''),
    'GYS': ('供应商', 94, ''),
    'CFDD': ('存放地点', 63, ''),
    'BMGL': ('部门管理', 39, ''),
    'RYGL': ('人员管理', 59, ''),
    'ZCRK': ('资产入库', 85, ''),
    'ZCJC': ('资产借出', 68, ''),
    'ZCZY': ('资产转移', 57, ''),
    'ZCWX': ('资产维修', 69, ''),
    'ZCBF': ('资产报废', 56, ''),
    'ZCPD': ('资产盘点', 151, ''),
    'ZCJG': ('资产甲购', 66, ''),
}

# 测试模板库
TEMPLATES = {
    '登录': {
        '功能点': ['账户验证', '角色选择', '验证码', '错误处理'],
        '测试点': [
            ('账户登录', '账户验证'),
            ('角色选择', '角色选择'),
            ('管理员登录', '角色选择'),
            ('验证码', '验证码'),
            ('验证码刷新', '验证码'),
            ('错误账户', '错误处理'),
            ('错误密码', '错误处理'),
            ('错误验证码', '错误处理'),
            ('空账户', '错误处理'),
            ('空密码', '错误处理'),
            ('记住密码', '账户验证'),
            ('自动登录', '账户验证'),
            ('登录超时', '错误处理'),
            ('账户锁定', '错误处理'),
            ('多设备登录', '账户验证'),
            ('退出登录', '账户验证'),
            ('登录日志', '账户验证'),
        ]
    },
    '首页': {
        '功能点': ['首页显示', '导航菜单', '数据统计', '快捷操作'],
        '测试点': [
            ('首页展示', '首页显示'),
            ('页面加载', '首页显示'),
            ('数据更新', '数据统计'),
            ('导航点击', '导航菜单'),
        ]
    },
    '个人信息': {
        '功能点': ['查看信息', '编辑信息', '修改密码', '头像上传'],
        '测试点': [
            ('查看个人信息', '查看信息'),
            ('编辑名字', '编辑信息'),
            ('编辑邮箱', '编辑信息'),
            ('编辑电话', '编辑信息'),
            ('修改密码', '修改密码'),
            ('性别修改', '编辑信息'),
            ('部门修改', '编辑信息'),
            ('上传头像', '头像上传'),
        ]
    },
    '资产类别': {
        '功能点': ['查看类别', '新增类别', '编辑类别', '删除类别'],
        '测试点': [
            ('查看列表', '查看类别'),
            ('新增资产类别', '新增类别'),
            ('编辑资产类别', '编辑类别'),
            ('删除资产类别', '删除类别'),
            ('搜索资产类别', '查看类别'),
            ('分类排序', '查看类别'),
        ]
    },
    '品牌': {
        '功能点': ['查看品牌', '新增品牌', '编辑品牌', '删除品牌'],
        '测试点': [
            ('查看品牌列表', '查看品牌'),
            ('新增品牌', '新增品牌'),
            ('编辑品牌', '编辑品牌'),
            ('删除品牌', '删除品牌'),
            ('搜索品牌', '查看品牌'),
        ]
    },
    '默认': {
        '功能点': ['查看', '新增', '编辑', '删除', '搜索', '导出'],
        '测试点': [
            ('查看列表', '查看'),
            ('分页查看', '查看'),
            ('新增记录', '新增'),
            ('编辑记录', '编辑'),
            ('删除记录', '删除'),
            ('搜索功能', '搜索'),
            ('导出数据', '导出'),
            ('导入数据', '导出'),
            ('批量操作', '编辑'),
            ('权限验证', '查看'),
        ]
    }
}

def get_template(module_name):
    """获取模块的模板"""
    return TEMPLATES.get(module_name, TEMPLATES['默认'])

def generate_test_case_id(prefix, sequence_num, seq_format=''):
    """生成测试用例ID"""
    if seq_format:
        # 如登录模块: DLMK-IT-SRS001-001
        return f"{prefix}-IT-{seq_format}-{sequence_num:03d}"
    else:
        # 其他模块: GYS-IT-001
        return f"{prefix}-IT-{sequence_num:03d}"

def generate_missing_cases(all_existing_cases, headers):
    """生成所有缺失的测试用例"""

    # 统计现有用例
    existing_by_prefix = defaultdict(list)
    for case in all_existing_cases:
        prefix = case[0].split('-')[0]
        existing_by_prefix[prefix].append(case)

    print("Generating missing test cases...\n")

    all_new_cases = []

    for prefix in sorted(MODULES.keys()):
        module_name, total_needed, seq_format = MODULES[prefix]
        existing_count = len(existing_by_prefix.get(prefix, []))
        need_count = total_needed - existing_count

        print(f"{prefix:6} ({module_name:12}): generate {need_count:3} cases (have {existing_count:3}/{total_needed:3})")

        if need_count <= 0:
            continue

        # 获取模板
        template = get_template(module_name)
        test_points = template.get('测试点', [])

        # 生成新用例
        for i in range(need_count):
            # 计算序列号（从现有最大号之后）
            seq_num = existing_count + i + 1

            # 循环使用测试点
            test_idx = i % len(test_points)
            test_title, feature_point = test_points[test_idx]

            # 生成用例ID
            case_id = generate_test_case_id(prefix, seq_num, seq_format)

            # 构建新用例
            new_case = [
                case_id,                          # 0: 测试用例编号
                module_name,                      # 1: 模块名称
                feature_point,                    # 2: 功能点
                test_title,                       # 3: 测试标题
                f"已登录{module_name}模块",        # 4: 前置条件
                f"{test_title}测试数据",           # 5: 输入
                f"进入{module_name}页面，执行{test_title}", # 6: 执行步骤
                f"{test_title}功能正常",            # 7: 预期结果
                "中",                              # 8: 重要程度
                "未执行",                          # 9: 执行用例测试结果
                "张翰博",                          # 10: 用例编写人
            ]

            all_new_cases.append(new_case)

    print(f"\n[OK] Generated {len(all_new_cases)} new cases")
    return all_new_cases

def main():
    # 读取现有用例
    print("读取现有用例...")
    with open(CSV_INPUT, 'r', encoding='gbk') as f:
        reader = csv.reader(f)
        all_rows = list(reader)

    # 查找表头和现有用例
    headers = None
    existing_cases = []

    for i, row in enumerate(all_rows):
        if '测试用例编号' in str(row):
            headers = row
            print(f"[OK] Found headers at line {i}, columns {len(row)}")
        elif headers and row and row[0] and '-IT-' in row[0]:
            existing_cases.append(row)

    print(f"[OK] Read {len(existing_cases)} existing cases\n")

    # Generate missing cases
    new_cases = generate_missing_cases(existing_cases, headers)

    # Merge all cases
    print("\nMerging all cases...")
    all_cases = existing_cases + new_cases
    all_cases.sort(key=lambda x: (x[0].split('-')[0], int(x[0].split('-')[-1])))

    print(f"[OK] Total {len(all_cases)} cases\n")

    # Output to new file
    print(f"Output to {CSV_OUTPUT}...")
    with open(CSV_OUTPUT, 'w', newline='', encoding='gbk') as f:
        writer = csv.writer(f)

        # Write prefix rows
        for i in range(11):
            if i == 11:
                break
            writer.writerow(all_rows[i])

        # Write headers
        writer.writerow(headers)

        # Write all cases
        writer.writerows(all_cases)

    print(f"[OK] Saved to {CSV_OUTPUT}")

    # Statistics
    print("\n=== FINAL STATISTICS ===")
    by_prefix = defaultdict(list)
    for case in all_cases:
        prefix = case[0].split('-')[0]
        by_prefix[prefix].append(case)

    total = 0
    for prefix in sorted(by_prefix.keys()):
        count = len(by_prefix[prefix])
        module_name = MODULES[prefix][0]
        total_expected = MODULES[prefix][1]
        status = "OK" if count == total_expected else "XX"
        print(f"[{status}] {prefix:6} ({module_name:12}): {count:3}/{total_expected:3}")
        total += count

    print(f"\nTotal: {total} test cases (Target: 1043)")

if __name__ == '__main__':
    main()
