import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger number_1= sc.nextBigInteger();
        BigInteger number_2 =sc.nextBigInteger();;

        BigInteger  sum, mul;
        sum = number_1.add(number_2);
        mul = number_1.multiply(number_2);
        System.out.println( sum);
        System.out.println( mul);
    }
}