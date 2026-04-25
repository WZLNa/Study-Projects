import datetime
import random

sp1="酸菜方便面"
sp2="牛肉干"
sp3="卫生纸"
sp4="篮球"
danhao=random.randint(100000000000000000,399999999999999999)
Price1=5
Price2=105
Price3=12
Price4=161
sl1=input("请输入酸菜方便面的数量：")
sl2=input("请输入牛肉干的数量：")
sl3=input("请输入卫生纸的数量：")
sl4=input("请输入篮球的数量：")
zfje1=input("请输入实收金额：")
ysje=(int(sl1)*Price1+int(sl2)*Price2+int(sl3)*Price3+int(sl4)*Price4)


print("********************************")
print("单号:",danhao) #单号随机生成 #或者print("订单编号：{}{}".format(datetime.datetime.now().strftime("%Y%m%d"),random.randint(100000,200000)))
print(datetime.datetime.now().strftime("%Y-%m-%d %H:%M:%S")) #获取系统当前日期
print("********************************")
print("商品名：",sp1,"数量：",sl1)
print("商品名：",sp2,"数量：",sl2)
print("商品名：",sp3, "数量：",sl3)
print("商品名：",sp4,"数量：",sl4)
print("********************************")
print("{:<8} {:<6} {:<6} {:<8}".format("名称", "数量", "单价", "金额"))
print("{:<8} {:<6} {:<8} {:<8}".format(sp1, sl1, Price1, int(sl1)*Price1))
print("{:<9} {:<6} {:<7} {:<8}".format(sp2, sl2, Price2, int(sl2)*Price2))
print("{:<9} {:<6} {:<7} {:<8}".format(sp3, sl3, Price3, int(sl3)*Price3))
print("{:<10} {:<6} {:<7} {:<8}".format(sp4, sl4, Price4, int(sl4)*Price4))
print("********************************")
print("应收：{0:>23.2f}".format(ysje))
print("实收：{0:>23.2f}".format(float(zfje1)))
print("找零：{0:>23.2f}".format(float(zfje1)-ysje))
print("********************************")
print("{0:^24}".format("感谢您的惠顾，欢迎下次再来!"))
