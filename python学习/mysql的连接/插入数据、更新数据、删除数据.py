import mysql.connector

#创建数据库链接

db = mysql.connector.connect(
    host="10.2.37.12",
    user="root",
    password='Zxc2750444177.',
    database="123"
)

cursor = db.cursor()

#插入数据
sql = "INSERT INTO `1` (name,phone_number,sex,birthday) VALUES (%s,%s,%s,%s)"
values = ('李四',17761566164,'女','2007-08-31')
cursor.execute(sql,values)

#提交事务
db.commit()

print(cursor.rowcount,"条记录插入成功")