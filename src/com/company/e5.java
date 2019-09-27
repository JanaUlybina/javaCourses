package com.company;
import java.util.*;

public class e5 {

    public static void main(String[] args) {
        System.out.println("Введите последовательность целых чисел");
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();
        String[] a = token(numbers);
        if(numbers.length() <= 100)
            toCheckPalindromNumber(a);
        else
            System.out.println("N > 100");
    }

    public static String[] token(String numbers) {
        StringTokenizer num = new StringTokenizer(numbers, " ");
        int count = num.countTokens();
        String[] numText = new String[count];
        for (int i=0; i<numText.length; i++) {
            numText[i] = num.nextToken();
        }

        return numText;
    }

    public static void toCheckPalindromNumber(String[] nums) {
        for (int i=0; i<nums.length; i++) {
            try {
                int a = Integer.parseInt(nums[i]);
                if (checkNumbers(a))
                    System.out.println("Число "+a+" является палиндромом");
            } catch (NumberFormatException e) {
                    System.out.println("Введенное вами выражение '"+nums[i]+
                            " не является последовательностью целых чисел");
            }
        }
    }

    public static boolean checkNumbers(int num) {
        char[] x = String.valueOf(num).toCharArray();
        boolean check = true;
        for (int i=0, j=x.length-1; i < x.length; i++, j--) {
            if (x[i] == x[j]) {
                check = true;
            } else {
                return false;
            }
        }
        return check;
    }
}