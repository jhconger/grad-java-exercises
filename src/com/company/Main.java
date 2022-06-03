package com.company;//package com.company;
import java.util.stream.IntStream;
import java.util.*;
import java.util.stream.IntStream;

import java.util.Arrays;

public class Main {
//  static int distClosestNumbers(int[] numbers) {
//      System.out.println("The original array is: ");
//      for (int num : numbers) {
//          System.out.print(num + " ");
//      }
//      Arrays.sort(numbers);
//      System.out.println("\nThe sorted array is: ");
//      for (int num : numbers) {
//          System.out.print(num + " ");
//      }
//      int l = 0;
//      for (int i = 0; i < numbers.length; i++) {
//          for (int k = i + 1; k < numbers.length; k++) {
//              if (numbers[i] != numbers[k]) {
//                  l = (numbers[k] - numbers[i]);
//              }
//          }
//      }
//////                        // try to implement it!
//      return l;
//  }
//
//
//            public static void main(String[] args) {
//                int[] testArray = {3, 9, 50, 15, 99, 7, 98, 65};
//                int result = distClosestNumbers(testArray);
//                System.out.println(result); // Expected result is 1 (the 2 closest numbers are 98 and 99)
//            }
//        }


//public class Main {

//    // Returns the distance between the two closest numbers.
//    static int distClosestNumbers(int[] numbers) {
//        Arrays.sort(numbers);
//        int l = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            for (int k = i + 1; k < numbers.length; k++) {
//                if (numbers[i] != numbers[k]) {
//                    l = (numbers[k] - numbers[i]);
//                }
//
//            }
//        }
//        return l;
//    }
//                public static void main(String[] args) {
//                    int[] testArray = {3, 9, 50, 15, 99, 7, 98, 65};
//                    int result = distClosestNumbers(testArray);
//                    System.out.println(result); // Expected result is 1 (the 2 closest numbers are 98 and 99)
//                }
//            }
//
//    public static boolean isPalindrome(String str) {
//        int i = 0, j = str.length() - 1;
//        while (i < j) {
//            if (str.charAt(i) != str.charAt(j))
//                return false;
//            i++;
//            j--;
//        }
//        return true;
//    }
//
//
// public static void main (String[] args) {
//     String str = "10001";
//     String str2 = "MoM";
//
//     str = str.toLowerCase();
//     str2 = str2.toLowerCase();
//
//     if (isPalindrome(str))
//         System.out.print("It is a palindrome");
//     else
//         System.out.print("It is not a palindrome");
//
//     // new line for better readability
//     System.out.println();
//
//     // For string 2
//     System.out.print("String 2 : ");
//     if (isPalindrome(str2))
//         System.out.print("It is a palindrome");
//     else
//         System.out.print("It is not a palindrome");
// }
//}




        public static void main(String[] args)
        {
            fizzBuzzBeforeJava8(100);

        }

        private static void fizzBuzzBeforeJava8(int num)
        {
            for(int i=0;++i<101;)
                System.out.println(i%3>0?i%5>0?i:"Buzz":i%5>0?"Fizz":"FizzBuzz");}}

//            for (var i = 1; i <= 100; i++) { var result = “”; if (i % 3 === 0) { result = “Fizz”; } if (i % 5 === 0) { result += “Buzz”; } console.log(result || i); }
