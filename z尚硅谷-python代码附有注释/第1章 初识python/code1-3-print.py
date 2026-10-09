print("123")
year=2024
print(year,"年，我要减肥")
print(end='*') # end:设置打印结束后的字符，默认是换行符\n
print(year,"年，我要减肥",sep="*")
print(year,"年，我要减肥",sep="") # sep:设置打印多个内容的分隔符

# 格式化输出
mouth = 8
day = 15
print("今年是%d年%02d月%d日,星期%s,天气%s,温度%.1f " % (year, mouth, day,"周四","晴",25))
# %d:整数占位符
# %02d:整数占位符，不足2位用0填充
# %s:字符串占位符
# %.1f:浮点数占位符，保留1位小数

print("woshi%d"% 1)