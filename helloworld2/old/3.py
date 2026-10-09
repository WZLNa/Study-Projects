
s = "123456789"
print("s---",s)
print("s[0:2]---",s[0:2])
print("s[0:]---",s[0:])
print('s[3:6]---',s[3:6])
print(s[3:6])
print(s[0:3:6])
print(s[::6])
print(s[3:])


h=3
print(str(h) in s) #False
print("1" in s) #True
print("1" not in s) #False

score=0
print ("score=",score)
score=score+10
print ("score=",score)
score=score+10
print ("score=",score)
score=score-5
print ("score=",score)


text = "dpjofpeodow"
print(text.split("o"))

text2="fodwi"
text3=text2.split("d")
print(text3)

text4="i love you"
text5=text4.replace("love","hate")
print(text5)

text8="i hate u"
print(text8.replace("hate","love"),"成都味",len(text8.replace("hate","love")))

text10="   i    love u  "
print("左边去掉空格",text10.lstrip(),"长度为",len(text10.lstrip()))
print("左右都去掉空格",text10.strip(),"长度为",len(text10.strip()))
print("右边去掉空格",text10.rstrip(),"长度为",len(text10.rstrip()))

aa="{} love you".format("i")
print(aa)


bb="i {} you".format("hate")
print(bb.replace("hate","love"))

score1=90
score2=score1+10
print("第一次分数",score1,"长度为",len(str(score1)))


awalist=["i","hate","u",80]
awalist2=["i","love","u",90]
print(awalist,awalist2)

awalist3={"我":"hate","你":"u"}
print(awalist3)

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

