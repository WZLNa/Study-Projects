year=int(input("请输入一个年份:"))

if year>=1582:
    if year % 4 ==0 and year % 100 !=0:
        print(f"{year}是闰年")
    elif year % 400 ==0:
        print(f"{year}是闰年并且是世纪闰年")
    else:
        print(f"{year}不是闰年")
else:
    print("不能小于1582")