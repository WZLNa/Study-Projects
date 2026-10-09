import turtle
print("*"*25)
try:
# 绘制等边三角形
# 等边三角形的每个内角为60度，所以每次转向的角度为120度（外角）

    turtle.speed(1)  # 设置绘制速度（1-10，1最慢，10最快）

# 绘制第一条边
    turtle.fd(200)  # 向前移动200像素
# 转向120度
    turtle.seth(120)  # 设置海龟方向为120度

# 绘制第二条边
    turtle.fd(200)
# 转向240度
    turtle.seth(240)  # 设置海龟方向为240度

# 绘制第三条边
    turtle.fd(200)
# 转向0度回到起始方向（可选）
    turtle.seth(0)

# 保持窗口打开，直到用户关闭
    turtle.done()
except turtle.Terminator:
    print('绘图程序异常终止')
else:
    print('绘图程序正常结束')

print("*"*25)
D={"数学":101,
   "语文":202,
   "英语":203,
   "物理":204,
   "生物":206}
D["化学"]=205
D["数学"]=201
del D["生物"]
print(D["化学"])
print(D["数学"])

try:
    print(D["生物"])
except KeyError:
    print("没有“生物”!")