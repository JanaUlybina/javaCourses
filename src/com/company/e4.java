package com.company;
import java.util.Scanner;
import java.util.StringTokenizer;
public class e4{
    public static void main(String[] args) {
        System.out.println("Введите предложение:");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] str = token(text);

        System.out.println("Введите слово:");
        String word = sc.nextLine();

        if(str.length > 0)
            System.out.println("Кол-во слов: "+ searchWord(str, word));
    }

    public static String[] token(String t){

        StringTokenizer text = new StringTokenizer(t.toLowerCase(), " ");
        int count = text.countTokens();
        String[] sText = new String[count];
        for(int i = 0; i < sText.length; i++){
            sText[i] = text.nextToken();
        }
        return sText;
    }

    public static int searchWord(String[] message, String word) {
        int count = 0;
        int key = 0;
        String w = word.toLowerCase();
        System.out.println(message[0]);
        for (int i = 0; i < message.length; i++){
            for (int j = 0; j < message[i].length(); j++){
                if(w.length() != message[i].length()){
                    break;
                }
                else{
                    if (w.charAt(j) != message[i].charAt(j)) {
                        break;
                    }
                    key = 1;
                }

            }
            if (key == 1)
                count++;
            key = 0;
        }
        return count;
    }
}
