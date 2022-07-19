package com.company;//package com.company;

import java.sql.SQLOutput;
import java.util.stream.IntStream;
import java.util.*;
import java.util.stream.IntStream;
import java.io.*;
import java.util.Scanner;
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
//  for (var i = 1; i <= 100; i++) { var result = “”; if (i % 3 === 0) { result = “Fizz”; } if (i % 5 === 0) { result += “Buzz”; } console.log(result || i); }


    //  best solution I have found thus far
//    public static void main(String[] args) {
//
//        for (int i = 0; i++ < 100; )
//            System.out.println(i % 3 > 0 ? i % 5 > 0 ? i : "Buzz" : i % 5 > 0 ? "Fizz" : "FizzBuzz");
//    }
//}

//     is i divisible by 3
//              YES: test i divisible by 5
//                            YES: print FizzBuzz
//                            NO: print Fizz
//
//              NO: test i divisible by 5
//                            YES: print Buzz
//                            NO: print i


//    public static void main(String[] args) {
//
//        String str = "", nstr = "";
//        str = str.toLowerCase();
//        char ch;
//
//        String isPalindrome = "The word " + str + " is a Palindrome";
//        String isNotPalindrome = "The word " + str + " is not a Palindrome";
//        System.out.println("Original word: " + str);
//
//        for (int i = 0; i < str.length(); i++) {
//            ch = str.charAt(i);
//            nstr = ch + nstr;
//        }
//        System.out.println("Reversed word : " + nstr);
//
//        if (str.equals(nstr)) {
//            System.out.println(isPalindrome);
//        }
//        else {
//            System.out.println(isNotPalindrome);
//        }
//    }
//}

// This is for swapping values of 2 variables
//    public static void main(String[] args) {
//
//        int a = 11, b = 2;


//        System.out.println("Initial Values: " + "a = " + a +  "  " +  "b = " + b );
//Logic 1
//        int t=a;
//         a= b;
//         b=t;
//
//        System.out.println("Swapped Values: " + "a = " + a +  "  " +  "b = " + b );

//Logic 2 third variable

//        a = a+b;
//        b = a -b;
//        a = a-b;
//
//        System.out.println("Swapped Values: " + "a = " + a +  "  " +  "b = " + b );

    //Logic 3 (only if a and b != 0)
//        a = a*b;
//        b = a/b;
//        a = a/b;
//        System.out.println("Swapped Values: " + "a = " + a +  "  " +  "b = " + b );

//        //Logic 4 (bitwise XOR (^) )
//        a = a^b;
//        b = a^b;
//        a = a^b;
//        System.out.println("Swapped Values: " + "a = " + a +  "  " +  "b = " + b );

    //Logic 5 (Single statement)
//        b=a=b;
//        System.out.println("Swapped Values: " + "a = " + a +  "  " +  "b = " + b );
//    }
//}

// print
// 1*****
//12****
//123***
//1234**
//12345*
//123456
//    public static void main(String[] args) {
//        for (int i = 1; i <= 6; i++) {
//            for (int j = 1; j <= i; j++) {
//            System.out.print(j);
//        }
//        for (int k = 6; k > i; k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        {
//        }
//    }
//}
//}


// print:
//        12345@
//        1234@@
//        123@@@
//        12@@@@
//        1@@@@@
//        @@@@@@

//    public static void main(String[] args) {
//
//        for (int i = 6; i >= 0; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            for (int k = 6; k > i; k--) {
//                System.out.print("@");
//            }
//            System.out.println();
//
//        }
//    }
//}


//    print:
//@
//@ @
//@   @
//@     @
//@       @
//@ @ @ @ @ @
//
//    public static void main(String[] args) {
//        System.out.println("@");
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.print("@");
//            for (int j = 0; j <= i; j++) {
//                System.out.print(" ");
//            }
//            System.out.print("@");
//            System.out.println();
//        }
//            for (int j = 5; j > 0; j--) {
//System.out.print("@ ");
////
//            }
//        }
//    }
//


//
//    print:
//            1  10  11  20  21   30
//            2  9  12  19  22   29
//            3  8  13  18  23   28
//            4  7  14  17  24   27
//            5  6  15  16  25   26
//            6  5  16  15  26   25
//            7  4  17  14  27   24
//            8  3  18  13  28   23
//            9  2  19  12  29   22
//            10  1  20  11  30   21
//
//    public static void main(String[] args) {
//        for (int a = 1, b = 10, c = 11, d = 20, e = 21, f = 30; a <= 10; a++, b--, c++, d--, e++, f--) {
//            System.out.println(a + "  " +  b + "  " + c + "  " + d + "  " + e + "   " + f);
//        }
//    }
//}

// Take input from user for a box (# of rows and # of columns) and print B for # of rows and # of columns
//    Rows: 4
//    Cols: 12
//    BBBBBBBBBBBB
//    BBBBBBBBBBBB
//    BBBBBBBBBBBB
//    BBBBBBBBBBBB
//

    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Rows: ");
//        int rows = sc.nextInt();
//        System.out.println("Cols: ");
//        int col = sc.nextInt();
//        if (rows <= 0 || col <= 0) {
//            System.out.println("Please input a number greater than 0");
//        } else {
//            for (int i = 1; i <= rows; i++) {
//                for (int j = 1; j <= col; j++) {
//                    System.out.print("B");
//                }
//                System.out.println();
//            }
//        }
//    }
//}


// Take 10 numbers from user and print largest and smallest number.
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int i = 2, small = 0, large = 0;
//        System.out.print("Num 1:");
//        int a = sc.nextInt();
//        small = a;
//        large = a;
//
//        while(i <= 10){
//            System.out.print("Num " + i + ": ");
//            int b = sc.nextInt();
//            if (b < small) {
//                small = b;
//            }
//            if (b > large) {
//                large = b;
//
//            }
//            i++;
//        }
//        System.out.println("Larger: " + large + "    Smaller: " + small);
//    }
//}


// Write a program that takes the base and exponent from user and print the result using a do while loop
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Provide base number: ");
//        int b = sc.nextInt();
//        System.out.println("Provide exponent: ");
//        int e = sc.nextInt();
//        int res = 1, i = 1;
//        do {
//            res = res * b;
//            i++;
//        } while (i <= e);
//        System.out.println(res);
//    }
//}


    //Using for loop print result of multiplication of all odd #s from 1 to 20 and the result of the sum of all even numbers from 1 to 100
//    public static void main(String[] args) {
//    int odd = 1, even = 0;
//    for (int i = 1; i<=20; i+=2) {
//        odd = odd * i;
//    }
//        for (int i = 2; i<=100; i+=2) {
//            even = even + i;
//        }
//        System.out.println(even);
//        System.out.println(odd);
//    }
//}
