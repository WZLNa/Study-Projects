import mysql.connector

#创建数据库链接

db = mysql.connector.connect(
    host="10.2.37.12",
    user="root",
    password='Zxc2750444177.',
    database="123"
)

cursor = db.cursor()

cursor.execute("SELECT * FROM `1`")  # ⚠️ 表名是数字必须加反引号

table1 = cursor.fetchall()

# print(table1)

for row in table1:
    print(row)