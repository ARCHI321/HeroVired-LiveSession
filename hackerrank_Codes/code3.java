package hackerrank_Codes;

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

public class code3 {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> ar = arr.get(i);
            for (int j = 0; j < ar.size(); j++) {
                if (i == j) {
                    sum1 += arr.get(i).get(j);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> ar = arr.get(i);
            for (int j = 0; j < ar.size(); j++) {
                if (i + j == arr.size() - 1) {
                    sum2 += arr.get(i).get(j);
                }
            }
        }
        if (sum1 > sum2) {
            return (sum1 - sum2);
        } else {
            return (sum2 - sum1);
        }

    }

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(List.of(1, 2, 3));
        arr.add(List.of(1, 2, 3));
        arr.add(List.of(1, 2, 3));
        System.out.println(arr);
        System.out.println(diagonalDifference(arr));

    }

}