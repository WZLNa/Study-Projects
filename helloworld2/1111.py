sum=0
for i in range (1,6):
     print(i)
     sum+=i
print(sum)
#

print(not True or False) # False，因为 not True 为 False，False or False 仍为 False

print(1,2,3,4,5,sep="#") # sep：分隔符
#
print(" abc ".strip())  # .strip(): 字符串方法，用于移除字符串两端的空白字符
#
a=3
print(a*a-2)
#
print(type(input()))
#
b=[1,2,3,4,5,6.3,"ddd"] # 列表包含整数、浮点数和字符串
print(type(b))  # 输出类型，结果为 <class 'list'>

for i in range(1,10): #留前舍尾
    print(i)
#
p=1;p="hello"
print(p)


#鸡兔同笼
h=int(input("请输入总头数："))
f=int(input('请输入总脚数：'))
