s1="hello"
s3='''
hello
world'''
print(s3)

s4="It's a hat"
print(s4)

s5='1234\'\"6666'  # \ 转义字符,转换引号的用法，从表示字符串的开始和结束功能转换为普通字符
print(s5)

#字符串拼接
print("--------字符串的拼接----------")
s6=s1+s4
print(s6)

n=5
s7=str(n)+s6  # 字符串和数字不能直接相加

# 字符串的乘法
print("--------字符串的乘法----------")
print(s1 * 2)
print('*' * 20)
print(3 * 'happy')