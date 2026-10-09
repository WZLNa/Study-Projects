# n = 1
# s = 1
# y = 0
# while n < 5:
#     s *= n
#     y += s
#     n += 1
# print(y)
#
#
# k = 100
# while k >= 1:
#     print(k)
#     k = k / 2
#
# for s in "I am a lovely boy":
#     if s == "a" :
#         s = "'"
#     print(s,end = "")
#

# for i in ("python"):
#     print (i) #i不在python里，故执行print
'''
sum=0
i=0
for i in range(36):
    o=(35-i)
    if 2*i+4*o==94:
        print(f"鸡有{i}只，兔子有{o}只")
'''

def my_function(a: int, b: str) -> None:
    """
    示例函数
    :param a: 只能传入整数类型
    :param b: 只能传入字符串类型
    """
    print(f"a = {a} (类型: {type(a).__name__})")
    print(f"b = {b} (类型: {type(b).__name__})")

# 正确使用
my_function(123, "hello")        # 正常工
# 实际上python不会强制类型检查，你在第一个值输入str也能正常输出但是IDE会标红


def my_function2(a: int, b: str) -> None:
    """
    示例函数
    :param a: 只能传入整数类型
    :param b: 只能传入字符串类型
    """
    # 运行时类型检查
    if not isinstance(a, int):
        raise TypeError(f"参数 'a' 必须是整数，当前是 {type(a).__name__}")
    if not isinstance(b, str):
        raise TypeError(f"参数 'b' 必须是字符串，当前是 {type(b).__name__}")
    
    print(f"a = {a} (类型: {type(a).__name__})")
    print(f"b = {b} (类型: {type(b).__name__})")
my_function2(123, "456")  # 启用了强制审查，此时符合要求可以正常工作