# 命令

> 命令是可执行的程序

* 单独的程序
* shell的内置功能

## 命令的剖析

* 命令本身
* 追加的参数

### 目标 *target*

* 提供所要处理的位置
* 源文件 *source*
* 目标文件 *destination*

### 选项 开关 标记

* ls -l
* ls -a
* ls -la

### 相关信息

* `man`
* `info`
* `apropos`

---

## 命令的修改

### 元字符

* ?
* /*
* []
  * 匹配包含的字符

### 重定向 *redirection*

> 默认:键盘/屏幕(Terminal)

#### 输入重定向

* `<`

#### 输出重定向

* `>`
* `>>`
  * 追加
  * 更安全
* `0>`: stdin
* `1>`: stdout
* `2>`: stderr

### 管道 *pipe*

* `|` 发送
* more / less

### 命令置换

* `ls $(pwd)`
* `pwd | ls`
* ls \`pwd\`
* `ls ${pwd}` -- 在当前shell中执行

---

## 任务定时调度

* 定时调用脚本/代码

### crond

#### `*` -- per

\* | meaning
-|-
\* | minute in hour
\* | hour
\* | day
\* | month
\* | week

* `,` -- disparture
* `-` -- from ... to
* `*\n` -- per n-th

### `crontab [option]`

* `-e` edit
* `-l` list
* `-r` remove
