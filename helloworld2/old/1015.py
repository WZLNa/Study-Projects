# kg=float(input("请输入你的体重(单位：kg)："))
# tall=float(input("请输入你的身高(单位:m)："))
#
# BMI=(kg/(tall**2))

# if BMI<18.5:
#     print(f"您的BMI值为：{BMI:.2f}，体型为偏瘦")
# elif BMI<=25 and BMI >=18.5:
#     print(f"您的BMI值为：{BMI:.2f}，体型为正常")
# elif BMI<=30 and BMI >25:
#     print(f"您的BMI值为：{BMI:.2f}，体型为过重")
# else:
#     print(f"您的BMI值为：{BMI:.2f}，体型为肥胖")

# if (BMI)<18.5:
#     print(f"您的BMI值为：{BMI:.2f}，体型为偏瘦")
# elif BMI<=25 and BMI >=18.5:
#     print(f"您的BMI值为：{BMI:.2f}，体型为正常")
# elif BMI<=30 and BMI >25:
#     print(f"您的BMI值为：{BMI:.2f}，体型为过重")
# else:
#     print(f"您的BMI值为：{BMI:.2f}，体型为肥胖")
#
# m=float(input("请输入学生的成绩："))
#
# if 0<=m<=59:
#     print("您的等级为：E！")
# elif 60<=m<=69:
#     print("您的等级为：D！")
# elif 70<=m<=79:
#     print("您的等级为：C！")
# elif 80<=m<=89:
#     print("您的等级为：B！")
# elif 90<=m<=100:
#     print("您的等级为：A！")
# else :
#     print("您输入的分数不合法，请检查后输入！")
# import math
#
# time=float(input("输入停车时间（单位：分钟）："))
# if time<30:
#     print("您停车免费")
# elif 30<=time<=60:
#     print("收费5元")
# else:
#     print(f"您的费用为：{math.ceil((time-60)/5)*2.5+5}元") # 超出60分钟的部分，每5分钟收费2.5元 使用 math.ceil() 向上取整（不足5分钟按5分钟计算）
#
# print(111,end="+")
# print(222)

# money=float(input("请输入行李金额："))
# u=int(input("请输入行李重量："))
# if u>0:
#     print("开始计算")
#     if u<20:
#         print("您的行李重量小于20kg，不收取额外费用")
#     elif u<=30:
#         print(f"您的行李重量在20kg至30kg之间，额外收取20元，您的行李金额为：{money+20}元")
#     else:
#         print("您的行李重量大于30kg，额外收取50元")

# #计算器
# number1=float(input("请输入第一个数："))
# ysf=input("请输入运算符：")
# number2=float(input("请输入第二个数："))
#
#
# if ysf=="+":
#     print(f"{number1}{ysf}{number2}的结果为：{number1+number2}")
# elif ysf=="-":
#     print(f"{number1}{ysf}{number2}的结果为：{number1-number2}")
# elif ysf=="*":
#     print(f"{number1}{ysf}{number2}的结果为：{number1*number2}")
# elif ysf=="/":
#     print(f"{number1}{ysf}{number2}的结果为：{number1/number2}")
# else:
#     print("您输入的运算符有误，请检查后输入！")

# 登录系统
# account=input("请输入用户名：")
# password=input("请输入密码：")
#
# accdatabase=['admin','user']
# pwddatabase={
#     'admin':'zxc',
#     'user':'123456'
# }
#
# if account in accdatabase:
#     if password==pwddatabase[account]:
#         print(f'用户名：{account}，欢迎登录！')
#     else:
#         print("请检查您输入的密码。")
# else :
#     print("用户名不存在！")
#
# #计算个人所得税
# sr=float(input("请输入月收入："))
#
# if sr<=5000:
#     print(f"您的月收入为：{sr}，不需要缴纳个人所得税！")
# elif sr<=8000:
#     print(f"您的月收入为：{sr}，需要缴纳：{(sr-5000)*0.03}元的个人所得税！")
# elif sr<=17000:
#     print(f"您的月收入为：{sr}，需要缴纳：{(sr-8000)*0.1}元的个人所得税！")
# elif sr<=30000:
#     print(f"您的月收入为：{sr}，需要缴纳:{(sr-17000)*0.2}元的个人所得税！")
# else:
#     print(f'您的月收入为：{sr}，需要缴纳：{(sr-30000)*0.3}元的个人所得税！')
'''
#1+2+3+...+100 =5050
n=1
i=0

while n<=100:
    i=i+n
    n=n+1
print(i)
'''

# n=1
# jishu=0
# oushu=0
#
# while n<=100:
#     if n %2==1:
#         jishu+=n
#     else:oushu+=n
#     n+=1
# print("奇数和 1+3+5+...+99 =", jishu)
# print("偶数和 2+4+6+...+100 =", oushu)

# print("计算阶乘")
# n=int(input("请输入n:"))
#
# if 0<=n<=100:
#     i=1
#     o=1
#
#     while1

print("百元买百鸡的解法")
for x in range(0,21):
    for y in range(0,34):
        z=100-x-y
        if z % 3 ==0 and x*5+y*3+z//3==100:
            print(f"得出结果：一种解法为：公鸡的数量为{x}，母鸡的数量为{y}，小鸡的数量为{z}")