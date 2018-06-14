# 匿名类

## 本地类

```java
{
    final int a = 0;
    int b = 1;
    class LocalClass {
        void test() {
            System.out.println(a+b);
            // a++;b--;
        }
    }

}
```

* 本地类不能对外部变量进行修改