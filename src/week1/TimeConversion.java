package week1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import static java.lang.Integer.parseInt;

public class TimeConversion {


    class Result {

        /*
         * Complete the 'timeConversion' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String timeConversion(String s) {
            // Write your code here
            int hour = Integer.parseInt(s.substring(0, 2));
            char x = s.charAt(s.length()-2);
            String ans = "";

            if (Character.toLowerCase(x) == 'p' && !(s.substring(0, 2).equals("12"))) {
                hour = hour += 12;
                String newHour = String.valueOf(hour);
                ans = (newHour + s.substring(2, s.length()));
            } else if ((Character.toLowerCase(x) == 'a') && (s.substring(0, 2).equals("12"))) {
                ans = ("00" + s.substring(2, s.length()));
                System.out.println(ans);
            } else {
                ans = s;
            }
            ans = ans.substring(0, ans.length()-2);
            return ans;

        }


    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String s = bufferedReader.readLine();

            String result = Result.timeConversion(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }


}
