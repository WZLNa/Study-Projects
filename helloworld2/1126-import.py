import time
time.sleep(5)

from math import sqrt
print(sqrt(20))
# print(factorial(20))  # 会报错 因为只导入了math模块里的sqrt(求平方根)功能

import requests as ttt  # 给requests起了一个别名
ttt.Session