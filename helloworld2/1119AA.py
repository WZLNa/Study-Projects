#默认值参数：函数定义
def fun(a,b=1,c=2):
    print(a,b,c)

fun(0)#0 1 2
fun(7,8) # 7 8 2
fun(7,8,9)  # 7 8 9



def vfunc(a,**b):  # **b表示接收任意多个关键字参数,并将其转换为字典
    print(a,b)

vfunc(1,x=2,y=3,z=4) #1 {'x': 2, 'y': 3, 'z': 4}
vfunc(1) #1 {}
# vfunc(1,2,3,4,5)  # 错误,因为vfunc只接收一个位置参数a,和任意多个关键字参数**b


print("*"*30)

def func(x = [],y = [6,7]):
    x.append(77)   # append:在列表末尾添加一个元素
    y.append(99)
    return (x + y)  # 返回x和y合并后的列表
# a,b = [1,2],[3,4]
a=[1,2]
b=[3,4]
t = func(x = a)
t = func(y = b)
print(func(t))

print("*"*30)




# *c:接收任意多个位置参数,并将其转换为元组 (**是转换为字典)
def fun2(a,b,*c):
    print(a,b,c)

fun2(1,2,3,4,5) #1 2 (3, 4, 5)
fun2(1,2,3,4,5,6,7)



def max1(*args):
    if not args:  # 处理没有传入参数的情况
        return None
    print(args)
    m = args[0]
    for i in range(len(args)):
        if m < args[i]:
            m = args[i]
    return m  # 正确放置在这里


print(len("12343232"))



goods_list={"可乐","薯片"}
while True:
    goods_name=input("请输入商品名字:")
    if goods_name not in goods_list:
        print("商品不在goods_list里！")
        break
    else:
        try:
              goods_num=int(input("请输入商品数量"))
        except ValueError:
              print("只能输入数字！")
