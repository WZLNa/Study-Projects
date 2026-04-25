name=input("请输入你的姓名：")
try:
    age1=int(input("请输入你的年龄："))
    if 0<=age1<=120:
        age=age1
    else:
        print("请输入一个合理的年龄")
        exit(1)
except ValueError:
    print("请输入一个整数")
    exit(1)
    
print("你好，",name,"！恭喜你今年",age,"岁了。")

