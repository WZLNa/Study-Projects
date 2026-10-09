# print(bool(input('请输入:')))

weather = '下雨'
if weather != '下雨':
    print('带伞出门')


if bool(input('请输入')):
    print('你输入了东西')
else:
    print('你什么都没输入')

for i in range(20):
    if i==10:
        continue
    elif i==15:
        break
    print(i) #应在这里才能跳过10，打印不出15

for i in range(20):
    print(i) #因为在上面，逐行执行，所以15可以被打印出来，10也没有被跳过
    if i==10:
        continue
    elif i==15:
        break
