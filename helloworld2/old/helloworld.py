import random

hl = "helloworld"
hl = "helloworld2"
a=random.randint(1,10)
b=random.randint(1,10)

print(hl)
# 输出helloworld2

# 下方注释测试
## 单引号
'''
print("hello world!2")
'''
## 双引号
"""
print("hello world!3")
"""

if a>b:
    print("a>b")
    print(type(a),"a为",a)
    print(f"{type(a)}a为{a}")
else:
    print("a<b")
    print(b)
    print(type(hl))
    print(f"{type(hl)}hl为{hl}")
