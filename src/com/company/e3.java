package com.company;
import java.util.*;

public class e3 {
    public static void main(String[] args) {
        System.out.println("Введите предложение:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count;

        if(str.length() == 0)
            count = 0;
        else
            count = str.split(" +").length;

        System.out.println("Кол-во слов: " + count);
        System.out.println("Сортировка по алфавиту: " + stringSort(str));
        System.out.println("Заглавные буквы: " + firstUpperCase(str));
}
    public static String stringSort(String st){
        ArrayList<String> abc = new ArrayList<String>();
        String[] s = st.split(" ");
        for (int i = 0; i < s.length; i++)
            abc.add(s[i]);
        Collections.sort(abc);
        return abc.toString().replace("[", "").replace("]","");
    }

    private static String firstUpperCase(String st) {
        if(st.length() == 0)
            return "";
        StringBuilder builder = new StringBuilder(st);
        if (Character.isAlphabetic(st.codePointAt(0)))
            builder.setCharAt(0, Character.toUpperCase(st.charAt(0)));
        for (int i = 1; i < st.length(); i++)
            if (Character.isAlphabetic(st.charAt(i)) && Character.isSpaceChar(st.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(st.charAt(i)));

        return builder.toString();
    }
}
