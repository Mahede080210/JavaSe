# <center>Java事务管理</center>
---
因为热爱，所以拼搏。           --[RuiDer](ruider.github.io)

---

###   事务
```Java
事务是什么？
	事务一般而言是相对数据库而言的，对于数据库一次操作就属于一个事务，
	一次操作可以是几句sql语句，也可以是几句JDBC的Java语句。
	一次操作的成败直接影响数据库的数据以及与被修改数据有关的数据。所以，
	事务相当重要。

```
### 事务原则
```java
	数据库事务遵从ACID原则。
	A：原子性，automicty，一次操作对某一数据的修改在事务失败后恢复原来的数据
	C：一致性，一次操作失败后与被修改的数据有关的所有数据恢复原来的数据
	I：隔离性：一次操作进行的时候，对于其他数据，被修改的数据是不可见的。
	D：持久性，一次操作失败后，数据库的所有数据必须保持正确。
```
### 举例说明
```java
事务管理在现实生活中被常用，比如两个人在线转money，
A给B转钱，其中B突然断网，那么正在交易的现金就会出现问题：
A少了钱，B的钱没有增加。这时就需要事务管理来处理了！！！

解决方案：加入事务管理，当事务失败后，原有数据恢复。
```
