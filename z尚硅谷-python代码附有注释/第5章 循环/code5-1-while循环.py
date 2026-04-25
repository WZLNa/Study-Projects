# 初始条件
n=0
while n<5:
    print("Hello Python")
    n+=1
# while:满足条件的情况下重复执行循环体中的代码。
b=0
while True:
    print("Hello Python")
    b+=1
    if b==5:
        break

# c=0  # 一个死循环
# while True:
#     print("Hello Python")
#     c+=1
#     print(c)

def xunhuan(a,b):  # 一个xunhuan方法
    i=0
    while i<b:
        print(a)
        i+=1

xunhuan("qwer",5)


# 高斯求和
m=1
result=0
while m<=100:
    result+=m
    m+=1
print(result)

# 另一种不用while的方法
result2=0
for i in range(1,101):
    result2+=i
print(result2)

print(sum(range(1,101)))

while '11':  # 死循环 # 11为True，所以一直循环打印
    print(1)
    print(2)