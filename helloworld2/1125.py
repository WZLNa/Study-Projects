def outer(a,b):
    result=a+b
    print('外层')
    print(result)
    def inner():
        print('内层')
    # 在外部函数内部调用内部函数
    inner()
    return inner

# 调用外部函数
outer(2,3)
inner_func = outer(2,3)
inner_func()