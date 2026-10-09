# 阶乘
n = int(input("请输入一个整数:"))
result=1
for i in range(n+1):  # 从0到n
    if i>0:  # 阶乘不能乘0
        result*=i
print(result)

print("*"*20)

# 阶乘和
result2 = 0
for n in range(1,5):
    result = 1
    for i in range(1,n+1):
        result = result * i
    print(result)
    result2 += result
print(result2)
