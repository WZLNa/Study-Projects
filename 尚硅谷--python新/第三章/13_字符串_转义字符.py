#使用\'输出 '
print('在Python中，可以使用\'包裹一个字符串')

#使用\"输出 "
print("在Python中，可以使用\"包裹一个字符串")

#使用\n进行换行
print('注册会员需要以下信息:\n姓名\n年龄\n手机号')

#使用\\输出\
print('D:\\nice')

#使用 \b 删除前一个字符
print("helloo\b")

#使用\r将光标移动到最前面，并覆写后面的内容
import time
# time.sleep(1)
# print("正在加载:",end="")
# time.sleep(0.5)
# print("\r",end='')
# print("正在加载:15%",end='')
# time.sleep(0.5)
# print("\r",end='')
# print("正在加载:26%",end='')
# time.sleep(0.5)
# print("\r",end='')
# print("正在加载:31%",end='')
# time.sleep(0.5)
# print("\r",end='')
# print("正在加载:46%",end='')
# time.sleep(0.5)
# print("\r",end='')
# print("正在加载:56%",end='')
# time.sleep(0.5)
# print("\r",end='')
# print("正在加载:76%",end='')
# time.sleep(2.5)
# print("\r",end='')
# print("正在加载:98%",end='')
# time.sleep(5)
# print("\r",end='')
# print("正在加载:100%",end='')

for i in range(1,101,5):
    print(f"\r当前进度：{i}%",end="")
    time.sleep(0.1)
    if i == 96:
        time.sleep(1)
        break
print("\r当前进度：97%",end="")
time.sleep(1)
print("\r当前进度：98%",end="")
time.sleep(2)
print("\r当前进度：99%",end="")
time.sleep(3)
print("\r当前进度：100%")


# 使用\t输入一个水平制表符（与Tab同效果）（让光标跳到下一个制表位）
print('1234123412341234')
print('ab\tcd'.expandtabs(4))
print('abc\td'.expandtabs(4))
print('abcd\t'.expandtabs(4))
print('我是\t中文') # 中文一个字占用2个位置