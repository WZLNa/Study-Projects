# print("欢迎来到儿童游乐场，儿童免费，成人收费")
# age=int(input("请输入您的年龄："))
#
# if age>=18:
#     print("您已成年，游玩需要补票10元")
# else:
#     print("祝您游玩愉快！")
#
#
# print("判断奇偶性")
# n=int(input("请输入n的值:"))
# if n%2==0:
#     print("是偶数")
# else:
#     print("是奇数")
#
# num1=float(input("请输入整数1"))
# num2=float(input("请输入整数2"))
# if num1 % 1 != 0:
#     print("第一个数不是整数！")
# elif num2 % 1 != 0:
#     print("第二个数不是整数！")
# else:
#     if num1>num2:
#      print(f"最大的数是：{num1}")
#     else:
#         print(f'最大的数是:{num2}')

# age=int(input("请输入:"))
# if age>=18:
#     print("成年了")
# elif age>=10:
#     print("青少年")
# elif age>=3:
#     print("幼儿园")
# else :
#     print("婴幼儿")

w=int(input("请输入0-6的整数:"))
if w==0:
    print("Sunday")
elif w==1:
    print("Monday")
elif w==2:
    print("Tuesday")
elif w==3:
    print("Wednesday")
elif w==4:
    print("Thursday")
elif w==5:
    print("Friday")
elif w==6:
    print("Saturday")
else:
    print("输入错误")
