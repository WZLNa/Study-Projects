# for i in range(4,1,-1):     

#     for j in range(1,i):         

#         print("#",end=',')

for i in range (0,5):
    if i == 3:
        exit
    print(i)
    
list=[1,2,3,4,5]

count =1  

while count < 11:

     print ("hello world！")

     count +=1 

print ("Good bye!")

for i in range(3):
    if i == 1:
        break
    print(i)

print(10//4)

def asd(a,b,c):
    return a+b+c
print(asd(1,2,3))


def get_name_age():
    name = "Alice"
    age = 25
    return name, age  # 返回多个值

# 接收返回值
result = get_name_age()
print(result)        # 输出：('Alice', 25)
print(type(result))  # 输出：<class 'tuple'>

# 解包接收
name, age = get_name_age()
print(name)          # 输出：Alice
print(age)           # 输出：25

print("******************************************")
# 阿基米德米粒问题
total = 0
grains = 1

for i in range(64):
    total = total + grains
    grains = grains * 2

print(f"国王需要支付: {total} 粒米")

print("******************************************")
# 打印九九乘法表
for i in range(1, 10):
    for j in range(1, i + 1):
        product = i * j
        print(f"{j}×{i}={product:>2d}", end="  ")
    print()