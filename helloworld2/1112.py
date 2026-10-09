#字典定义
dict1={
    '周杰伦':90,
    'xiaozhang':88
}


# 赋值方式
dict2={}
dict2['id']=1
dict2['name']='小李'
print(dict1)
print(dict2)


woo={
    'asd':90,
    'xiaozhang':88
}

woo["asd"]=80
print(woo['xiaozhang'])


#删除字典内容
del woo['xiaozhang']
woo.clear()

print(woo)







print('*'*30)

fruits=['apple','orange','pear']
print(f"现在的水果:{fruits}")
fruit_1=input("请输入水果名称:")
# 判断
if fruit_1 in fruits:
    print("有这个水果")
else: #没有就添加进去
    fruits.append(fruit_1)
    print("没有这个水果，添加成功")
    print(fruits)
