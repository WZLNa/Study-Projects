name = "张三"
score = 85.678

# 原始方法（%格式化）
print('学生姓名：%s,分数：%.2f'%(name,score))

# format方法
print('学生姓名：{},分数：{:.2f}'.format(name, score))

# f-string方法（推荐）
print(f'学生姓名：{name},分数：{score:.2f}')

# 输出结果都是：
# 学生姓名：张三,分数：85.68


m=12
print("|%d|"%m)
print("|%4d|"%m)
print("|%.2f|"%m)
print(f"|{m:d}|")
print(f"|{123:4d}|")
print(f"|{m:.2f}|")
print("|" + str(m).rjust(4) + "|")  # |  42|