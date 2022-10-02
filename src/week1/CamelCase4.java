package week1;

import java.io.*;
import java.util.*;

import static java.lang.Character.isUpperCase;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.nextLine();
        char splitOrCombine = str.charAt(0);
        char methodClassOrVar = str.charAt(2);

        String name = str.substring(4, str.length());
        String result = "";

        if (splitOrCombine == 'S') {
            for (int i = 0; i < name.length(); i++) {
                if (isUpperCase(name.charAt(i))) {
                    result = name.substring(0, i) + " " + name.substring(isUpperCase(name.charAt(i)), name.length());
                }
            }
        } else if (splitOrCombine == 'C') {
            for (int i = 0; i < name.length(); i++) {
                int index;
                if (name.charAt(i) == ' ') {
                    index = i;
                }
                result = name.substring(0, index) + name.substring(index+1, name.length());
            }
        } else {
            System.out.println("Error.");
        }
    }
}