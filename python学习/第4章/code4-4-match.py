## 单纯的匹配，没有加入校验功能
# match:匹配
a=int(input("请输入a:"))
match a:
    case 1:
        print("你输入a是1")
    case 2:
        print("你输入的a是2")
    case str(3):
        print("你输入的a是str3")
    case "asd":
        print("你输入的a是asd")
    case _:
        print("你输入的a不是12str3asd")


try:
    b = int(input("请输入b:"))
    match b:
        case 1:
            print("你输入的b是1")
        case 2:
            print("你输入的b是2")
        case _:
            print("你输入的b数字不是1也不是2")
except ValueError:
    print("请给b输入一个数字！！")



## 加入了try校验
try:
    age=int(input("请输入age:"))
    if 0<=age<=120:
      print("age在0-120之间")
except ValueError:
    print("请给age输入一个数字!")




## 适用于多输入的try校验
try:
    agee=int(input("请输入agee:"))
    print("agee输入正确")
    if 0<=agee<=120:
      print("agee在0-120之间")
    agee2=int(input("请输入agee2"))
    print("agee2输入正确")
    if 0<=agee2<=120:
        print("agee2在0-120之间")
except ValueError:
    print("请输入一个数字!")





## 加入的isdigit校验
age2=input("请输入age2")  # int要写在后面，不然加的isdigit将失效
if age2.isdigit():
    age2=int(age2)
    if 0<=age2<=120:
        print("age2在0-120之间")
    else:
        print("age2不在0-120之间！")
else:
    print("请给age2输入一个数字！！")





## 适用于多重输入的isdigit校验
ag1=input("请输入ag1:")
ag2=input("请输入ag2:")
if ag1.isdigit() and ag2.isdigit():
    ag1=int(ag1)
    ag2=int(ag2)
    if 0<=ag1+ag2<=120:
        print("ag1+ag2在0-120之间!")
    else :
        print("ag1+ag2不在0-120之间！")
else:
    if ag1.isdigit() == False and ag2.isdigit() == False:  # 必须放前面，因为if型判断语句只要有一个执行了后面的就不执行了
        print("只能输入数字！")
    elif ag1.isdigit() == False:  # 两个同为elif同时判断
        print("ag1必须输入数字！")
    elif not ag2.isdigit():
        print("ag2必须输入数字!")
