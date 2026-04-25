# lambda匿名函数

### 1. `lambda` 表达式的基本语法

```python
lambda 参数: 表达式
```

- `lambda` 关键字后面跟着参数列表（可以有多个参数），然后是一个冒号 `:`，最后是表达式。
- `lambda` 函数只能包含一个表达式，不能包含复杂的语句（如 `if`、`for` 等）。

#### 示例：

```python
# 定义一个 lambda 函数，计算两个数的和
add = lambda x, y: x + y
print(add(3, 5))  # 输出: 8

# 定义一个 lambda 函数，计算平方
square = lambda x: x * x
print(square(4))  # 输出: 16
```

### 2. `lambda` 与 `map()` 结合使用

`map()` 函数可以将一个函数应用到可迭代对象的每个元素上，并返回一个新的迭代器。

#### 示例：

```python
numbers = [1, 2, 3, 4, 5]

# 使用 map() 和 lambda 计算每个数的平方
squared = list(map(lambda x: x * x, numbers))
print(squared)  # 输出: [1, 4, 9, 16, 25]
```

### 3. `lambda` 与 `filter()` 结合使用

`filter()` 函数可以根据某个条件过滤可迭代对象中的元素，并返回一个新的迭代器。

#### 示例：

```python
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

# 使用 filter() 和 lambda 过滤出偶数
even_numbers = list(filter(lambda x: x % 2 == 0, numbers))
print(even_numbers)  # 输出: [2, 4, 6, 8, 10]
```

### 4. `lambda` 与 `sorted()` 结合使用

`sorted()` 函数可以根据自定义的排序规则对可迭代对象进行排序。

```python
students = [('Alice', 85), ('Bob', 90), ('Charlie', 78)]

# 使用 sorted() 和 lambda 按成绩排序
sorted_students = sorted(students, key=lambda student: student[1])
print(sorted_students)  # 输出: [('Charlie', 78), ('Alice', 85), ('Bob', 90)]
```



# Sort排序

sort()函数是Python 列表的一个方法，是python中的内置函数，sort()函数可以对列表进行**就地**排序。

只使用 **<** 来比较项之间的关系。如果任何比较操作失败，异常将不会被屏蔽(在排序过程中发生任何比较操作失败的异常，该异常将会被抛出，而不会被程序自动处理或忽略。) – 如果任何比较操作失败，整个排序操作将失败（并且列表可能会处于部分修改的状态）。

## sort()方法语法：

`sort(key=None, reverse=False)`

### 参数

sort() 接受两个仅限以关键字形式传入的参数 (仅限关键字参数)，这两个参数是可选的：

key 指定带有一个参数的函数，用于从每个列表元素中提取比较键 (例如 key=str.lower)。 对应于列表中每一项的键会被计算一次，然后在整个排序过程中使用。 默认值 None 表示直接对列表项排序而不计算一个单独的键值。

reverse 排序规则，为一个布尔值。 reverse = True 降序， reverse = False 升序（默认）。

### 返回值

该方法没有返回值，但是会对列表的对象进行排序。

## 实例

### 简单使用

```python
x = [8,9,0,7,4,5,1,2,3,6]
x.sort()
print(x)
```

输出结果

```python
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
```

### sort()降序排序

函数sort() 默认情况下 是升序排序，进行降序排序，需要用到函数reverse()

```python
x = [8,9,0,7,4,5,1,2,3,6]
x.sort()
x.reverse()
print(x)
```

输出结果

```python
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
```

对于字符串，默认是按照字母进行排序：

```python
my_list = ['apple', 'date', 'banana', 'cherry']
my_list.sort()
print(my_list)
```

输出结果

```python
['apple', 'banana', 'cherry', 'date']
```

复制代码

开头字母相同，则比较第二个字母

```python
my_list = ['apple', 'banana', 'cherry', 'date', 'abcdefg']
my_list.sort()
print(my_list)
```

输出结果

```python
['abcdefg', 'apple', 'banana', 'cherry', 'date']
```

### [key参数](https://zhida.zhihu.com/search?content_id=241669348&content_type=Article&match_order=1&q=key参数&zd_token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJ6aGlkYV9zZXJ2ZXIiLCJleHAiOjE3NjQzMTgwNjAsInEiOiJrZXnlj4LmlbAiLCJ6aGlkYV9zb3VyY2UiOiJlbnRpdHkiLCJjb250ZW50X2lkIjoyNDE2NjkzNDgsImNvbnRlbnRfdHlwZSI6IkFydGljbGUiLCJtYXRjaF9vcmRlciI6MSwiemRfdG9rZW4iOm51bGx9.RbPh9eXScBhagJeHQqs_Bs4doe2grmgqnuECOasHiVw&zhida_source=entity)

可选。

指定排序标准的函数。key接受的是一个只有一个形参的函数

key接受的函数返回值，表示此元素的权值，sort将按照权值大小进行排序

将字符串的长度进行排序，可以使用sort()函数并将len函数作为key参数传入：

```python
my_list = ['apple', 'banana', 'cherry', 'date']
my_list.sort(key=len)
print(my_list) 
```

输出结果

```python
['date', 'apple', 'banana', 'cherry'] 
```

### [reverse参数](https://zhida.zhihu.com/search?content_id=241669348&content_type=Article&match_order=1&q=reverse参数&zd_token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJ6aGlkYV9zZXJ2ZXIiLCJleHAiOjE3NjQzMTgwNjAsInEiOiJyZXZlcnNl5Y-C5pWwIiwiemhpZGFfc291cmNlIjoiZW50aXR5IiwiY29udGVudF9pZCI6MjQxNjY5MzQ4LCJjb250ZW50X3R5cGUiOiJBcnRpY2xlIiwibWF0Y2hfb3JkZXIiOjEsInpkX3Rva2VuIjpudWxsfQ.MHFCqKf9KsKyJBGox0Kw3gABr-3SRbQs5buttnOLp6I&zhida_source=entity)

可选。

reverse接受的是一个bool类型的值 (Ture or False)，表示排列顺序。

reverse=False 将对列表进行**升序**排序(**默认**)。

reverse=True 将对列表进行**降序**排序。

```python
x = [8,9,0,7,4,5,1,2,3,6]
x.sort(reverse=True)
print(x)
x.sort(reverse=False)
print(x)
```

输出结果

```python
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
```

## sort()和sorted()的区别

sorted()介绍文章：[Python3 sorted() 函数 – 对所有可迭代的对象进行排序操作](https://link.zhihu.com/?target=https%3A//www.linfengnet.com/python/1313.html)。

**sort** 是**应用在 list 上**的方法，**sorted** 可以对**所有可迭代的对象**进行排序操作。

list 的 sort 方法返回的是对已经存在的列表进行操作，而内建函数 sorted 方法返回的是一个新的 list，而不是在原来的基础上进行的操作。

### 实例

### 函数sort()修改序列，不返回任何值

```python
x = [8,9,0,7,4,5,1,2,3,6]
y = x.sort()
print(y)
print(x) 
```

输出结果

```python
None
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
```

### [sorted()函数](https://zhida.zhihu.com/search?content_id=241669348&content_type=Article&match_order=1&q=sorted()函数&zd_token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJ6aGlkYV9zZXJ2ZXIiLCJleHAiOjE3NjQzMTgwNjAsInEiOiJzb3J0ZWQoKeWHveaVsCIsInpoaWRhX3NvdXJjZSI6ImVudGl0eSIsImNvbnRlbnRfaWQiOjI0MTY2OTM0OCwiY29udGVudF90eXBlIjoiQXJ0aWNsZSIsIm1hdGNoX29yZGVyIjoxLCJ6ZF90b2tlbiI6bnVsbH0.I4_3T36iogx38ZVRK5aySFaIiTexYDqXbhST2eIHa9c&zhida_source=entity) 返回一个排序列表，不改变原有序列

```python
x = [8,9,0,7,4,5,1,2,3,6]
y = sorted(x)
print(y)
print(x)
```

输出结果

```python
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
[8, 9, 0, 7, 4, 5, 1, 2, 3, 6]
```