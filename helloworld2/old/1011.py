# 输入一个三位数
num = int(input("请输入一个三位数："))

# 分别提取百位、十位、个位
hundreds = num // 100          # 百位
tens = (num % 100) // 10       # 十位
units = num % 10               # 个位

sum_digits = hundreds + tens + units

print(f"百位：{hundreds}，十位：{tens}，个位：{units}")
print(f"各位数字之和为：{sum_digits}")

print("#############################")
num=input("请输入一个数：")
num2=input("请输入另一个数：")
print(f"他们的字符串类型为{type(num)}和{type(num2)}，相加起来为{int(num)+int(num2)}")
print("他们的字符串类型为：",type(num),"和",type(num2),",他们相加起来为：",(int(num)+int(num2)))