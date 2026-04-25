def max1(a,b):
    if a > b:
        print("最大的是",a)
    elif a == b :
        print("这两个数相等")
    else:
        print("最大的是",b)

def min1(a,b):
    if a < b:
        print(f"最小的是{a}")
    elif a == b:
        print("这两个数相等")
    else:
        print(f"最小的是{b}")

def max2(a,b,c):
    if a >= b and a >= c:
        print(f"最大的是{a}")
    elif b >= a and b >= c:
        print(f"最大的是{b}")
    else:
        print(f"最大的是{c}")

def min2(a,b,c):
    if a <= b and a <= c:
        print(f"最小的是{a}")
    elif b <= a and b <= c:
        print(f"最小的是{b}")
    else:
        print(f"最小的是{c}")

def max3(*args):
    max_value = args[0]
    for num in args:
        if num > max_value:
            max_value = num
    print(f"最大的是{max_value}")

def min3(*args):
    min_value = args[0]
    for num in args:
        if num < min_value:
            min_value = num  # 临时的min_value
    print(f"最小的是{min_value}")