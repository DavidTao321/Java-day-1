# Java-day

每天一节课 Java。当前是第 1 天到第 2 天的练习代码。

## 目录结构

```
Java-day-1/
├── README.md
├── src/
│   └── com/liu/
│       ├── variable/VariableDemo.java   # 变量与算术运算（Day 2）
│       ├── season/SeasonSwitch.java     # switch 判断季节
│       └── snake/SnakeGame.java         # Swing 贪吃蛇（AI 生成，可玩）
└── notes/
    └── vx-snippet.txt                   # 变量加减的随手片段
```

## 编译与运行

需要 JDK 8 或更高版本（本机已有 JDK 19/24/25）。

```bash
# 在仓库根目录编译（下面这行在 cmd、PowerShell、bash 下都能直接跑）
javac -encoding UTF-8 -d out ^
  src/com/liu/variable/VariableDemo.java ^
  src/com/liu/season/SeasonSwitch.java ^
  src/com/liu/snake/SnakeGame.java

# 变量练习
java -cp out com.liu.variable.VariableDemo

# 季节判断（会等待键盘输入月份）
java -cp out com.liu.season.SeasonSwitch

# 贪吃蛇（方向键控制，需要图形界面）
java -cp out com.liu.snake.SnakeGame
```

> 说明：`^` 是 Windows cmd 的续行符。在 bash / PowerShell 里请把整条命令写成一行，或改用 `\`（bash）/ 反引号（PowerShell）续行。

## 说明

- 原仓库里的文件没有 `.java` 后缀，`javac` 无法编译；现已按类名和包结构重命名。
- 原来的 `class` 文件只是 `SnakeGame` 的反编译骨架（方法体是 `/* compiled code */`），
  与真正的贪吃蛇实现重复，已删除；实现保留在 `src/com/liu/snake/SnakeGame.java`。
