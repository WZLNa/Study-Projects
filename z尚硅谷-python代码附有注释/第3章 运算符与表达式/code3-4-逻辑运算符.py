print('asd' and 'zxc') 

# 运算符	逻辑表达式	描述	实例
# and	x and y	布尔"与" - 如果 x 为 False，x and y 返回 x 的值，否则返回 y 的计算值。	(a and b) 返回 20。
# or	x or y	布尔"或" - 如果 x 是 True，它返回 x 的值，否则它返回 y 的计算值。	(a or b) 返回 10。
# not	not x	布尔"非" - 如果 x 为 True，返回 False 。如果 x 为 False，它返回 True。	not(a and b) 返回 False


# 与，并且 and
# 有一个值是false，那么结果就是false，全部为True时，结果才是True
# 短路运算：前面的值是False，后面的值就不再计算了
print(True and False)  # 输出False
print(True and True)  # 输出True
print(True and False and True)  # 输出False
print(1==1 and True and 2<3)  # 输出True
print('hello' and 'hi') # 短路运算 输出hi
print('' and 'hi')  # 输出空串，因为前面的''是False
print(False and 'hi')  # 输出False
print(1 and 0)  # 输出0 因为前面的1是True，后面的0是False
print(0 and 1)  # 输出0
# 或者or
# 有一个值是True，那么结果就是True，全部为False时，结果才是False
# 短路运算：前面的值是True，后面的值就不再计算了
print(True or False)  # 输出True
print(False or False or True)  # 输出True
print(1 or 0)  # 输出1
print(2024 or 2025 or 0)  # 输出2024,因为前面的2024是True
print(0 or '' or 888)  # 输出888
# 非not
print(not True)  # 输出False
print(not 1)  # 输出False
print(not '')  # 输出True
# 优先级 not>and>or
print(True and False and not False)  # 输出True
print(True or False and True or False)  # 输出True