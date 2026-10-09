n1=1.1
n2=1.214
print( n1 + n2 )  # 2.314

# 四舍五入round
n3 =round(n1+n2,1)  #1表示小数点后的位数
print(n3)  # 2.3

print(round(n1+n2,2))  #2.31


n3=1.3
n4=15.256
import math
# 向上取整ceil(天花板)
n5=math.ceil(n3+n4)  # "."可以理解为“的”，math库里的ceil
print("向上取整的结果是：",n5)
# 向下取整floor(地板)   ‘‘；；；；’’
n6=math.floor(n3+n4)
print("向下取整的结果是：",n6)
