# Java 接口

> 接口：类之间的协议

## fields

* static
* final

## functions

* 强制 public

```java
// Define
interface Foo {
    void Func();

    // In jdk1.8 add default method;
    default public void Func() {
        // defualt codes segment;
    }
}

// Implements
class Demo implements Foo {
    public void Func() {}
}
```

---

## abstract class

* abstract T func(); // Interface
* T func() {} // Default action
* Interface ~= abstract class

---

## 完全解耦

* 编写
  * （接口） <--implements-- 类
* 使用
  * （接口） <--convert-- 类

## 多重继承

### 实现途径

* 单根
* 多接口

---

## 接口的继承

* interface A implements anotherInterface {}

## 默认方法

* default public ...
* 当两个默认方法产生冲突时，要求进行Override