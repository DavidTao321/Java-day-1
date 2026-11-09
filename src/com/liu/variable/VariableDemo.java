package com.liu.variable;

/**
 * Day 2 练习：变量的声明、赋值和算术运算。
 *
 * <p>运行：java -cp out com.liu.variable.VariableDemo</p>
 */
public class VariableDemo {
    public static void main(String[] args) {
        int pay = 10;
        int card = 20;
        int vx = 0;
        System.out.println(pay + card + vx);
        vx = vx + 10;
        vx = vx - 2;
        System.out.println(vx);
    }
}
