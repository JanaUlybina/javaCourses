package com.company;
import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        try{
            System.out.println("Введите первое число:");
            Scanner number1 = new Scanner(System.in);
            num1 = number1.nextInt();
            System.out.println("Введите второе число:");
            Scanner number2 = new Scanner(System.in);
            num2 = number2.nextInt();
        }
        catch (Exception e) {
            System.out.println("Некоректно введенные данные");
            return;
        }

        int nod = func_nod(num1,num2);
        int nok = Math.abs(num1*num2/nod);
        System.out.println("Наибольший общий делитель: " + nod);
        System.out.println("Наименьшее общее кратное: " + nok );
    }

    public static int func_nod(int a,int b){
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return Math.abs(a);
    }
}
