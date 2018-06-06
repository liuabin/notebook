# Java 复用

## 组合

* has-a
* 惰性初始化
  * 使用前进行

---

## 聚合

* is-a

### 继承 **extend**

#### super( args ) 

* 基类构造器

#### super.foo( args )

* 基类方法
* **子类Overload不对父类方法进行Overwrite**

### Override 

* @Override
  * 提示编译器检查重载

#### 向上转型

* 父 <- 子 --- 使用继承的依据
* automaticly

### final

#### final数据

##### C++

* 编译时进行
* const ... 基本
* const* ... 引用指针不变

##### Java

* 运行时绑定
* final 数据不变
* 空白final在Constructor中初始化
* `final static` **参数名** 全大写加下划线

#### final 参数

* 参数只读
* （常引用）

#### final 方法

* 此方法不被 Override / Overload
* `private` 为隐式 final

#### final 类

* final
* 所有域隐式fianl

---

## 代理

* （包含、方法全具备）
* 私用化包含类
* 写同名接口调用包含类方法

### static加载

* 单例模式
* 类只在static被访问时加载
* constructor 隐式static