# for i in range (1,101):
#     if i%3==0 and i%5==0:
#         print(i)
#         break

# sum=0
# while True:
#     number=int(input("请输入一个整数："))
#     if number==0:
#         break
#     sum+=number
# print(sum)


# num=int(input("请输入一个正整数:"))
# m=2
#
# while m<num:
#     if num%m==0:
#         break
#     m+=1
# if m==num:
#     print("素数")
# else:
#     print("不是素数")
#


# for i in range(20):
#     if i%2==0:
#         print(i)
#     elif i%7==0:
#         continue
# count=0
# for i in range(1,3):
#     print(i,'班级成绩')
#     for j in range(1,4):
#         print(j,'成绩')
#         score=int(print('请输入;'))

# oushu=0
# current=0
#
# for i in range(1,51):
#     if i%2!=0:
#         continue
#     oushu+=i
#     current=i
#     if oushu > 200:
#         break
# print(f"最终的和{oushu}")
# print(f'停止时的数字{current}')

current=0
for one in range(0,101):
    for five in range(0,21):
        for ten in range (0,11):
            if one+five*5+ten*10==100:
                current+=1
                print(f"{one}个一元，{five}个5元，{ten}个十元")
print(f"共有{current}种兑换方法")