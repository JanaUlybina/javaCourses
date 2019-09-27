package com.company;
import java.util.Scanner;

public class e1 {
public static void main(String[] args) {
    int num = 0;
    try{
        System.out.println("Введите число: ");
        Scanner number = new Scanner(System.in);
        num = number.nextInt();
    }
    catch (Exception e) {
        System.out.println("Некоректно введенные данные");
        return;
    }

    if (num % 2 == 0) {
        if (num == 2) {
            if(num > 0)
                System.out.println("Четное, простое");
            else
                System.out.println("Четное");

        } else if (num == 0)
            System.out.println("Четное");
        else {
            if(num > 0)
                System.out.println("Четное, составное");
            else
                System.out.println("Четное");
        }

    } else {
        if (num == 1) {
            System.out.println("НЕчетное");
            return;
        }
        for (int i = 3; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if(num > 0)
                    System.out.println("НЕчетное, составное");
                else
                    System.out.println("НЕчетное");
                return;
            }
        }
        if (num > 0)
            System.out.println("НЕчетное, простое");
        else
            System.out.println("НЕчетное");
        }
    }
}

