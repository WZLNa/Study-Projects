import datetime
import random

sp1=("酸菜牛肉面")
price1=2
sl=float(input("请输入商品数量："))
print("****************************")
print("订单编号：{}{}".format(datetime.datetime.now().strftime("%Y%m%d"),random.randint(100000,200000)))
print(datetime.datetime.now().strftime("%Y-%m-%d %H:%M:%S"))
print("****************************")
print("商品名:{:}".format(sp1))
print('商品数量:{}'.format(sl))
print(f'总金额：{sl*price1}')
print("****************************")
print("{:^24}".format("感谢您的惠顾！"))