# Java 字符串

## 格式化输出

* System.out.prinf(sentenceFormat,args);
  * 调用的是System.out.format(...);
* 无差别换行符 `%n`
* `%d`
  * `%8d` -- 总长度8位，右对齐
  * `%-8d` -- 左对齐
  * `%08d` -- 补0
  * `%,8d` -- 千位分隔符