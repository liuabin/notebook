# Java Exception

## Type

1. 可查异常 CheckedException
    * try-catch `need`
    * FileNotFoundException

2. 运行时异常 RuntimeException
    * 错误很普遍，不强制try-catch捕获
    * ArithmeticException -- 除数为0
    * ArrayIndexOutOfBoundsException
    * NullPointerException

3. 错误 Error
    * 系统级别的异常
    * OutOfMemoryError

## Code

```Java
try {
    // some codes may have exceptions;
    // correct produce;
}catch( IOException | NullPointerExcption e ){
    // Exceptions can use '|' to sepread;
    // To differ the different exceptions;
    if (e instanceof IOException) {
        e.printStackTrace();
    }
    // Handle the excptions;
}finally{
    // Close some source;
}
```
