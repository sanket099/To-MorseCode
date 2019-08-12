package com.example.morsecode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class morse {

    static String[] Alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "!", ",", "?",
            ".", "'" , " " };
    static String[] Morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "-.-.--", "--..--",
            "..--..", ".-.-.-", ".----."," " };

    public static HashMap<String,String> Alphatomorse = new HashMap<>();

    static {

        for (int i = 0 ; i<Alpha.length && i<Morse.length;i++){
            Alphatomorse.put(Alpha[i], Morse[i]);
        }



    }
    public static String abc(String text){

        StringBuilder builder = new StringBuilder();

        String [] words = text.split("");

        for ( String word : words){
            for (int j=0; j<(word.length());j++){

                String code = Alphatomorse.get(word.substring(j).toLowerCase());
                builder.append(code).append(" ");

            }
            builder.append(" ");


        }

        return builder.toString();




    }



}
