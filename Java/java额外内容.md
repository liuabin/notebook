# Java --额外

## 外部定义变量内部不可重复定义

* 可变 (int a, String ... args)
  * a ... 非可变参数
  * ... args[]
* enum A {A, B, C}
  * ... .value() // 0 ~ n-1

## `$ java ClassName`

* 调用其main()
* main()可用来对类进行自我测试

## `$ import java.util.\*;`

* 导入全部类
* 不包含其中的包

## String 函数

* .equalsIgnoreCase()  // 神奇的方法
* .toLower / UpperCase()
* .indexOf()  // 查找
* .contains() // return boolean

## Inner class

* Create MainClass**$**InnerClass.class