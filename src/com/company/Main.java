package com.company;

import java.sql.SQLOutput;
import java.util.stream.IntStream;
import java.util.*;
import java.util.stream.IntStream;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

//
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
//
//    public static class Result {
//
//
//        public static void plusMinus(List<Integer> arr) {
//            // Write your code here
//            double positive = 0, negative = 0, zero = 0;
//            int arrSize = arr.size();
//
//            for (int i = 0; i < arr.size(); i++) {
//
//
//                if (arr.get(i) > 0) {
//                    positive++;
//                } else if (arr.get(i) < 0) {
//                    negative++;
//                } else {
//                    zero++;
//                }
//            }
//            System.out.printf("%1.6f \n", positive / arrSize);
//            System.out.printf("%1.6f \n", negative / arrSize);
//            System.out.printf("%1.6f \n", zero / arrSize);
//
//        }
//    }
//
//
//    class Solution {
//        public static void main(String[] args) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//            int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//            List<Integer> arr = new ArrayList<>();
//
//            for (int i = 0; i < n; i++) {
//                int arrItem = Integer.parseInt(arrTemp[i]);
//                arr.add(arrItem);
//            }
//
//            Result.plusMinus(arr);
//
//            bufferedReader.close();
//        }
//    }
//}
//

// print following shapes:
//        $$
//       $$$$
//      $$$$$$
//     $$$$$$$$
//    $$$$$$$$$$
//   $$$$$$$$$$$$
//               #
//              #  #
//             #    #
//            #      #
//           #        #
//          #          #
//         #            #
//         # # # # # # # #
//        #
//      #  #
//     #    #
//    #      #
//     #    #
//      #  #
//       #


//    public static void main(String[] args) {
//        for (int i = 6; i >= 1; i--) {
//            for (int j = 1; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 6; k >= i; k--) {
//                System.out.print("$");
//            }
//            for (int k = 6; k >= i; k--) {
//                System.out.print("$");
//            }
//            System.out.println();
//        }


    //
//    public static void main(String[] args) {
//        System.out.println("      #");
//                for (int i = 6; i >= 1; i--) {
//
//            for (int j = 1; j < i; j++) {
//                System.out.print(" ");
//            }
//                    System.out.print("#");
//            for (int k = 6; k >= i; k--) {
//                System.out.print(" ");
//            }
//            for (int k = 6; k >= i; k--) {
//                System.out.print(" ");
//            }
//                    System.out.print("#");
//                    System.out.println();
//        }
//                for( int k = 7; k>= 0; k--) {
//                    System.out.print("# ");
//                }
//
//    public static void main(String[] args) {
//        System.out.println("    #");
//        for (int i = 3; i >= 1; i--) {
//
//            for (int j = 1; j < i; j++) {
//                System.out.print(" ");
//            }
//            System.out.print("#");
//            for (int k = 3; k >= i; k--) {
//                System.out.print(" ");
//            }
//            for (int k = 3; k >= i; k--) {
//                System.out.print(" ");
//            }
//            System.out.print("#");
//            System.out.println();
//        }
//
//        for (int i = 2; i >= 1; i--) {
//
//            for (int j = 2; j >= i; j--) {
//                System.out.print(" ");
//            }
//            System.out.print("#");
//            for (int k = 0; k < i; k++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i; k++) {
//                System.out.print(" ");
//            }
//            System.out.print("#");
//            System.out.println();
//        }
//        System.out.println("   #");
//    }
//}

//    public static void main(String[] args) {
//        System.out.println("please enter a number to check if it is a prime number: ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        boolean isPrime = true;
//
//        for (int i = 2; i <= a / 2; i++) {
//
//            if (a % i == 0) {                 //  if (a % 2 == 0) {    results in false returns.  a % i works correctly.
//                isPrime = false;
//                break;
//            }
//        }
//        if (isPrime) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//}

//    public static void main(String[] args) {
//        System.out.println("Please enter a number: ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int res = 1;
//        int q = a/10;
//        while (q != 0) {
//            q = q/10;
//            res++;
//        }
//        System.out.println(res);
//    }
//}


    //enter a number and return how many prime numbers there are between 0 and that number:
//    public static void main(String[] args) {
//        System.out.println("Please enter a number: ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int count = 0, large = 0;
//        boolean isPrime = true;
//        for (int i = 1; i < a; i++) {
//            isPrime = true;
//            for (int j = 2; j < i; j++) {
//            if (i % j == 0) {
//                isPrime = false;
//                break;
//            }
//            }
//            if(isPrime && i != 2) {
//                count++;
//                isPrime = false;
//            }
//        }
//        System.out.println(count);
//    }
//}

//
//    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] arr2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        int[] arr3 = new int[20];
//        int index = 0;
//        for (int i = 0; i < arr1.length; i++) {
//            arr3[index++] = arr1[i];
//            arr3[index++] = arr2[i];
//        }
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.print(arr3[i] + "  ");
//        }
//    }
//}
//

//input is array of ten random numbers, output the second-smallest and second-largest numbers.
//    public static void main(String[] args) {
//        int[] arr = {3, 87, 43, 18, 1, 6, 37, 28, 91, 10};
//        int small = arr[0], large = arr[0];
//        int s_small = -1, s_large = -1;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < small) {
//                s_small = small;
//                small = arr[i];
//            }
//            if (arr[i] > large) {
//                s_large = large;
//                large = arr[i];
//            }
//        }
//        System.out.println(s_small + "  " + s_large);
//    }
//}


//get array from user and have them choose two numbers from array.  Return array with those two numbers swapped.
//    public static void main(String[] args) {
//Scanner sc = new Scanner(System.in);
//int [] arr = new int [10];
//        System.out.println(" Please enter ten numbers for Array Values: ");
//        for (int i = 0 ; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Choose one of previous values Num1: ");
//        int a = sc.nextInt();
//        System.out.println("Choose another of the previous values Num2: ");
//        int b = sc.nextInt();
//        int index_a = 0, index_b = 0;
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] == a) {
//                index_a = i;
//            }
//            if(arr[i] == b) {
//                index_b = i;
//            }
//        }
//        int c = arr[index_a];
//        arr[index_a] = arr[index_b];
//        arr[index_b] = c;
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }
//    }
//
//}


    //declare and initialize two arrays and print numbers that are in both arrays.
// then take values of arrays and swap them. (Arr1 has values of arr2 and vice versa.
//    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 13, 4, 5, 6, 17, 8, 9, 10};
//        int[] arr2 = {11, 12, 13, 2, 15, 16, 17, 9, 19, 20};
//
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1.length; j++) {
//                if (arr1[i] == arr2[j]) {
//                    System.out.println(arr1[i]);
//                }
//            }
//        }
//        int[] arr3 = new int[10];
//        for (int i = 0; i < arr1.length; i++) {
//            arr3[i] = arr1[i];
//        }
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = arr2[i];
//        }
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr3[i];
//        }
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr3[i];
//            System.out.print(arr1[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i] + " ");
//        }
//    }
//}
//

//    public static void main(String[] args) {
//        Scanner sc =  new Scanner(System.in);
////        long[] arr = new long[5];
//        long sum = 0;
//        long max = Long.MIN_VALUE;
//        long min = Long.MAX_VALUE;
//        for(int i = 0; i < 5; i++) {
//            long n = sc.nextLong();
//            sum += n;
//            max = Math.max(max, n);
//            min = Math.min(min, n);
//        }
//        System.out.println((sum - max) + " " + (sum - min));
//    }
//
//}



//code for switching civilian to military time
//
//public static void main(String[] args) {
//
//            if (s.substring(s.length() - 2).equals("AM")) {
//        String h = (Integer.valueOf(s.substring(0, 2)) == 12) ? "00" : s.substring(0, 2);
//        return h.concat(s.substring(2, s.length() - 2));
//    } else {
//        String h = (Integer.valueOf(s.substring(0, 2)) == 12) ?
//                "12" : String.valueOf(Integer.valueOf(s.substring(0, 2)) + 12);
//        return h + s.substring(2, s.length() - 2);
//    }
//}
//
