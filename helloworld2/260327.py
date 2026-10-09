# # for i in range(20):
#
# #     if i == 13:
# #         continue
# #     print(i)
# #     if i ==16:
# #         break
#
# str1='*@python@*'
# print(str1[2:].strip('@'))
#
# str2='1dkjfhufgye1'
# print(str2[3:].strip('1'))
#
# for y in range(1,10,2):
#     print(y)
#
#
# for p in "python is the best language ":
#
#     if p=='n':
#
#         break
#
#     print(p)
#
# def maxcount():
#
#     a,b = 1000,99
#
#     for i in range(10):
#
#         a=a*b+1
#
#         b=b*a-1
#
#         return a
#
# maxcount()
#
# dic1={
#     '数学':123
# }
#
#
#
# txt = open("book.txt", "r")
#
# print(txt)
#
# txt.close()

s=["seashell","gold","pink","brown","purple","tomato"]

print(len(s),min(s),max(s))

L = 'abcd'

def f(x,result=['a','b','c','d']):

    if x:

        result.remove(x[-1])

        f(x[:-1])

    return result

print(f(L))

a='123456'
print(a[:-2]) # 提取前2个字符
print(a[-2:]) # 提取后2个字符