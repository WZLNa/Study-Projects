#饮品信息
def all_goods():
    goods={'可乐':2.5,'红茶':3}
    return goods

#显示饮品信息
def show_goods():
    for x,y in all_goods().items():
        print(x,':',str(y)+'元')  #必须转为str，因为int不能和str拼接

#计算总额：可乐：5个，5*2.5+红茶：3个，3*3
def total(goods_dict):
    count=0
    for name,num in goods_dict.items():
        #all_goods()[name]:价格
        total_money=all_goods()[name]*num
        count+=total_money
    print(f"您购买了：{goods_dict}，总价为：{count}")

goods_dict={}  # 可乐：5个，红茶：3个，饮品名字：数量

goods_total_name={  # 商品库存
    "可乐":20,
    "红茶":15
}

print('饮品售卖机')
show_goods()  # 显示商品信息
print("商品库存：")
for x,y in goods_total_name.items():
    print(x,':',str(y)+'个')

#循环
while True:
    goods_name=input("请输入商品名字：")
    if goods_name=='q':
        break
    if goods_name in all_goods():
        goods_num=input("请输入商品数量：")
        if goods_num.isdigit():
            goods_num=int(goods_num)  # 转换为整数
            if goods_name in goods_total_name and goods_num <= goods_total_name[goods_name]:
                goods_total_name[goods_name]=goods_total_name[goods_name] - goods_num
                print(goods_name,"现在的库存：",goods_total_name[goods_name])
                # 更新购物车数量（累加而不是覆盖）
                if goods_name in goods_dict:
                    goods_dict[goods_name] += goods_num
                else:
                    goods_dict[goods_name] = goods_num
            else:
                print("这个商品现在库存不足")
        else:
            print('不合法')
    else:
        print('请输入正确名字')

total(goods_dict)  # name:num
