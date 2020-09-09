package com.vincentmegia;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args )
    {
    }

    static String process(String text) {
        //define exit
        var tokens = text.split("");
        var skip = "";
        if (text.length() == 1) return text;
        if (tokens[0].equals(tokens[1]) && tokens.length <= 2) return text;
        int i = 0;
        while(tokens[i].equals(tokens[i + 1])) {
            i++;
            skip += tokens[i];
            if (i == text.length() - 1) return text;
        }
        var key = tokens[i] + tokens[i + 1];
        var reducer = "";
        if (key.equals("ab") || key.equals("ba")) reducer = "c";
        else if (key.equals("bc") || key.equals("cb")) reducer = "a";
        else if (key.equals("ac") || key.equals("ca")) reducer = "b";

        var result = skip + reducer + text.substring(i + 2);
        var output = process(result);
        return output;
    }
}
