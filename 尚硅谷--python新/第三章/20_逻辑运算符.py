# and用于判断其两侧的值，是否都为True
print(True and True)
print(True and False)
print(False and True)
print(False and False)

print("************************************")
print(2>1 and 2>1)
print(2>1 and 2<1)
print(2<1 and 2>1)
print(2<1 and 2<1)

# and具备“逻辑短路”能力
print("************************************")
print(False and 3/0) #执行到False就不执行了，因为已经False了
print(3>9 and 3/0)

# and返回的不一定是布尔值，它返回的是某个参与计算的值本身
# 规则：and会先看左边，如果左边是“假”，就直接返回左边，否则返回右边
# 备注：若参与and运算的值不是布尔值，那python会自动转为布尔值，然后再进行逻辑操作
print("************************************")
print(2-2 and True) #打印0
print('' and True) # 打印""
print(True and 8/2) # 打印 4(靠后)
print(3+3 and 3*4) # 打印12(靠后)

# or用于判断其两侧，是否有一个为True（只要有一个是True，那就返回True）
print("************************************")
print(True or True)
print(True or False)
print(False or True)
print(False or False)

#not用于取反
#not返回的值，一定是布尔值！