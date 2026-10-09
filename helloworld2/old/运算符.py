print(2+2)
print(2*2)

t=30
print(t+3)

c=40
print(c+10)

x=12+4*((8**2)-20)//6
print(x) #41

############################################################
# +:加法运算符，返回两个操作数的和
print("加法运算符")
print(2+2) #4
print(2+3) #5
print(2+4) #6
print(2+5) #7

# -:减法运算符，返回第一个操作数减去第二个操作数的差
print("减法运算符")
print(2-2) #0
print(2-3) #-1
print(2-4) #-2
print(2-5) #-3

# *:乘法运算符，返回两个操作数的积
print("乘法运算符")
print(2*2) #4
print(2*3) #6
print(2*4) #8
print(2*5) #10

# /:除法运算符，返回第一个操作数除以第二个操作数的商
print("除法运算符")
print(10/2) #5.0
print(10/3) #3.3333333333333335
print(10/4) #2.5
print(10/5) #2.0
############################################################


############################################################
# %:取余运算符，返回两个操作数相除的余数
print("取余运算符")
print(10%2) #0
print(10%3) #1
print(10%4) #2
print(10%5) #0

# **:幂运算符，返回第一个操作数的第二个操作数次幂
print("幂运算符")
print(2**2) #4
print(2**3) #8
print(2**4) #16

# //:整除运算符，返回两个操作数相除的整数部分
print("整除运算符")
print(10//2) #5
print(10//3) #3
print(10//4) #2
print(10//5) #2
############################################################

############################################################
# 比较运算符
print("比较运算符")
print(2==2) #True
print(2==3) #False
print(2!=2) #False
print(2!=3) #True
print(2>2) #False
print(2>3) #False
print(2<2) #False
print(2<3) #True
print(2>=2) #True
print(2>=3) #False
print(2<=2) #True
print(2<=3) #True

# 逻辑运算符
print("逻辑运算符")
print(True and True) #True
print(True and False) #False
print(False and True) #False
print(False and False) #False

print(True or True) #True
print(True or False) #True
print(False or True) #True
print(False or False) #False

print(not True) #False
print(not False) #True

# 成员运算符
print("成员运算符")
print("a" in "abc") #True
print("a" not in "abc") #False
print(1 in [1,2,3]) #True
print(1 not in [1,2,3]) #False
print(1 in (1,2,3)) #True
print(1 not in (1,2,3)) #False
print("a" in {"a":1,"b":2}) #True
print("a" not in {"a":1,"b":2}) #False

# 位运算符
print("位运算符")
print(2&2) #2
print(2&3) #2
print(2|2) #2
print(2|3) #3
print(~2) #-3
print(2^2) #0
print(2^3) #1
print(2<<2) #8
print(2>>2) #0

# 运算符优先级
print("运算符优先级")
print(2+3*4) #14
print((2+3)*4) #20
############################################################

print(4<=5<=2) #False
print(1<=2<=3) #True

#求偶数奇数
print("求偶数奇数")
num=20                            #int(input("请输入一个整数：")) #int()：将输入的字符串转换为整数类型
if num%2==0: #判断余数是否为0
    print(num,"是偶数")
else:
    print(num,"是奇数")

# =:赋值
io=10
print(io)
# +=：io+=5 ----> io=io+5

io+=5
print(io)

io**=5 # **:幂运算符，返回第一个操作数的第二个操作数次幂
print(io)

a1=5
b1=5

print(a1-5 or b1-3)
print(a1<6 or b1+3)
print(not a1)