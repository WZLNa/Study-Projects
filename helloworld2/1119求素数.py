#求素数
def aa(a):
    for i in range(2,a):
        if a%i==0:
            break
    if a==i+1:
        print("是")
    else:
        print("不是")
aa(int(input("请输入一个数：")))

def bb(a):
    s=0
    for i in range(1,a+1):
        if i%2==1:
            s=s+1/i
    print(s)
bb(int(input("请输入一个数：")))
