# 命令

> 命令是可执行的程序

* 单独的程序
* shell的内置功能

## 命令的剖析

### 命令本身

### 追加的参数

* 目标 *target*

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
