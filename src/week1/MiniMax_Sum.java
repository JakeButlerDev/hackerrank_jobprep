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


public class MiniMax_Sum {


    class Result {

        /*
         * Complete the 'miniMaxSum' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void miniMaxSum(List<Integer> arr) {
            // Write your code here
            long sum = 0L;
            int min = arr.get(0);
            int max = arr.get(0);
            for (Integer i : arr){
                sum += i;
                if(i > max){
                    max = i;
                } else if(i < min) {
                    min = i;
                }
            }
            System.out.print((sum - max)+" "+(sum - min));
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            Result.miniMaxSum(arr);

            bufferedReader.close();
        }
    }

}
