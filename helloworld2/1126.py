# 递归函数
n=int(7)

def hq(n):

    if n == 1:

        return 0

    elif n == 2:

        return 1

    else:
        return hq(n-1) + hq(n-2)

result = hq(n)
print(result)

print("**************************************************")

# 局部变量
e=12
print(e)  # 全局变量可以在函数内部调用,也可以在外部调用

def func1():
    a = 10  
    print(a)  # 从内部调用局部变量
func1()  # 从外部调用局部变量
# print(a)  # NameError报错，外部无法调用局部变量


# global声明全局变量
by = 3
def func2():
    global by  # 使用global声明为全局变量
    by = 2
func2()
print("by=：",by)


# 如果你不使用 global 关键字，Python 会在函数内部创建一个新的局部变量，而不会影响到全局变量。例如：
y = 5

def try_modify():
    y = 15
    print(f"内部:{y}")
try_modify()
print(f"外部：{y}")

print("**************************************************")
test=[1,4,6,7,3,5,54]
test.sort()
print(test)


medal=[
    {'中国':{'金牌':9,'银牌':4,'铜牌':2,'总数':15}},
    {'美国':{'金牌':6,'银牌':6,'铜牌':3,'总数':15}},
]
#num:金/银/铜/总数
def ran(num):
    medal.sort(key=lambda x:list(x.values())[0][num],reverse=True)#reverse=True降序
    i=1
    #键-值:items
    for country in medal:
        #key:国家，value:{'金牌':9,'银牌':4,'铜牌':2,'总数':15}
        for key,value in country.items():
            print(i,key,'金',value['金牌'])#输出所对应结果
        i+=1
ran('金牌')



# 集合和字典的区别
# demo = {
#     'name':"张三",
#     'num':"123456",
# }
# print(demo)
# print(demo['name'])

# jihe={1,2,3,3,4,5}
# print(jihe)

# jihe.add(123)
# print(jihe)

# if 1 in jihe:
#     print(233)

# else:
#     print("not")

# if 'name' in demo:
#     print('name in demo')
# else:
#     print('name not in demo')

# if '张三' in demo:
#     print('张三')
# else:
#     print('张三 not in demo')

