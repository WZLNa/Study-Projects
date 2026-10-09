#float-->int
s1=2.23
print(int(s1))

#布尔bool-->整数int
s2,s3=True,False  #True不能为true
print(int(s2))
print(int(s3)) # True转换为1，False转换为0

#布尔bool-->字符串str
print(str(s2))
print(str(s3))

#布尔bool-->浮点数float
print(float(s2))
print(float(s3))

# str-->bool
b1='12345fff'
b2='' 
print(bool(b1)) # 有内容输出True
print(bool(b2)) # 空字符串输出False

'''
# 一个简单的将输入的字符串（转换为整型int）转换为布尔值的程序，输入1或者0输出True或者False，其他数字输出错误提示
for i in range(3):
    try:
        d1=int(input("请输入1或者0或者其他数字:"))
        print(bool(d1))
    except ValueError:
        print("输入错误,请输入一个数字！")
'''
# 进制的转换
s='10'
print(int(s,2))

s=='1a'
print(int(s,16))

print(id(s))