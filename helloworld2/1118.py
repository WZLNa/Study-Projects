A={1,2,3,"c","d"}
B={1,2,3,"a","b"}
print(A^B) #对称差集

c={1,2,3,4}
d={1,2,3,4,5}
print(c.issubset(d)) #c是否是d的子集,True
print(d.issuperset(c)) #d是否是c的超集,True
print(c.isdisjoint(d)) #c和d是否不相交,False





print("*"*25)

#定义函数 如print() int()都是内置函数
def hello():
    print("hello world")

hello() #调用函数hello



def  add(a,b):
    return a+b
result=add(3,4) #调用函数add,将3和4作为参数传递给函数,函数返回值赋值给result
print(result)



def print5050():
    print(sum(range(1,101)))

print5050()

#函数定义：形参(x,y,z是函数定义时的参数,调用函数时传递的参数是实参
def sum2(x,y,z):
    result=x+y+z
    print(result)
    # return result
#函数调用：实参(1,2,3)
sum2(1,2,3)
print(sum2(1,2,3)) #None,因为函数sum没有返回值(return)


def hello2(name):
    print(f"{name}")

hello2("张三")

def hello3(name):
    print(f"你好，{name}")
    return f"你好，{name}"

def xiangjia(a,b):
    print(f"{a}加{b}等于{a+b}")
    return a+b #返回a+b的值

xiangjia(1,2)

xj = xiangjia(1,2)
print(xj) #3,因为函数xiangjia返回了a+b


def chou(a):
    print(f"{a},真丑")

chou("许波")