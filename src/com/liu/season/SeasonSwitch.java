package com.liu.season;

import java.util.Scanner;

/**
 * switch 练习：输入月份，输出对应的季节。
 *
 * <p>运行：java -cp out com.liu.season.SeasonSwitch</p>
 */
public class SeasonSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        int a = sc.nextInt();
        switch (a) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("没有这个月份");
                break;
        }
        System.out.println("退出Switch");
    }
}
