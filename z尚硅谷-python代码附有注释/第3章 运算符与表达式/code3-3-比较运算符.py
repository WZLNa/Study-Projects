print(3 != 3)  # 判断不相等  # 输出：False
print(3 == 2)  # 判断相等  # 输出：False
print(3 >= 2)  # 判断大于等于  # 输出：True
print(3 <= 3)  # 判断小于等于  # 输出：True

print(3.0 == 3)  # 判断相等  # 输出：True
print(True == False)  # 判断相等  # 输出：False
print('hello' < 'hell')  # 字符串的比较运算：每个字符的ascii码值 # 输出：True
print(1<2<3)  # 链式比较运算 # 输出：True
print(1<2 and 2<3)  # 逻辑与运算 # 输出：True
print('y'<'x'==False)  # 链式比较运算 # 输出：False
print('y'<'x' and 'x'==False)  # 逻辑与运算 # 输出：False



a = 'hello'=='hi'
print(a)

a=str(a)
print(type(a))


print(ord('h')) # 查询字符的ascii码值

print(chr(65)) # 查询ascii码的字符

print('123'+'asd',end='')
print('zxc')

print(0.1+0.2)