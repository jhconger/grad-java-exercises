package com.company;
import java.io.*;
import java.net.*;
import java.net.http.HttpClient;
import java.util.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

////
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
//   for (int i = 0; i++ < 100; )
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


//find median of array
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
//        Arrays.sort(a);
//        if ((n & 1) == 1) {
//            System.out.println(a[n / 2]);
//        } else {
//            System.out.println((a[n / 2] + a[n / 2 + 1]) / 2);
//        }
//        sc.close();
//    }
//}


    //find unique integer in array
//    public static int lonelyInteger(int [] a) {
//
//    int val = 0;
//for(int num : a) {
//        val = val ^ num;
//    }
//return val;
//}
//}


//    public static int diagonalDifference(List<List<Integer>> arr) {
//        // Write your code here
//        int leftdiagonal = 0;
//        int rightdiagonal = 0;
//        for(int i = 0, j = arr.get(0).size()-1; i < arr.get(0).size(); i++, j--){
//            leftdiagonal = leftdiagonal + arr.get(i).get(i);
//            rightdiagonal = rightdiagonal + arr.get(i).get(j);
//        }
//        return Math.abs(leftdiagonal - rightdiagonal);
//    }
//}

// working countingSort
//    public static List<Integer> countingSort(List<Integer> arr) {
//        // Write your code here
//        List<Integer> res = new ArrayList<Integer>(Collections.nCopies(100, 0));
//        for(Integer a : arr)
//            res.set(a, res.get(a)+1);
//        return res;
//    }
//}


//zigzag sequence
//public static void main (String[] args) throws java.lang.Exception {
//    Scanner kb = new Scanner(System.in);
//    int test_cases = kb.nextInt();
//    for(int cs = 1; cs <= test_cases; cs++){
//        int n = kb.nextInt();
//        int a[] = new int[n];
//        for(int i = 0; i < n; i++){
//            a[i] = kb.nextInt();
//        }
//        findZigZagSequence(a, n);
//    }
//}
//
//    public static void findZigZagSequence(int [] a, int n){
//        Arrays.sort(a);
//        int mid = (n)/2;
//        int temp = a[mid];
//        a[mid] = a[n - 1];
//        a[n - 1] = temp;
//
//        int st = mid + 1;
//        int ed = n - 2;
//        while(st <= ed){
//            temp = a[st];
//            a[st] = a[ed];
//            a[ed] = temp;
//            st = st + 1;
//            ed = ed - 1;
//        }
//        for(int i = 0; i < n; i++){
//            if(i > 0) System.out.print(" ");
//            System.out.print(a[i]);
//        }
//        System.out.println();
//    }
//}


//tower breaker
//public static int towerBreakers(int n, int m) {
//    // Write your code here
//      n = height of tower
//      m= number of towers
//
//
//      if number of towers is even player 2 will always win
//      if number of towers is odd player 1 will always win
//      if number of towers is 1, player 1 always wins
//      if height is one player 2 always wins
//      return (n % 2 == 0 || m == 1) ? 2 : 1;
//      }
//
//}


////caesars cipher
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//
//        int n       = in.nextInt();
//        String s    = in.next();
//        int r       = in.nextInt();
//
//        String out  = "";
//
//    char[] a = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//    char[] b = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
//
//        for(int i = 0; i < s.length(); i++) {
//
//        char c = s.charAt(i);
//
//        if(!Character.isLetter(c)) {
//            out += c;
//        }
//
//        for(int j = 0; j < a.length; j++) {
//
//            if(c == a[j]) {
//                out += a[(j+r)%a.length];
//            }
//            if(c == b[j]) {
//                out += b[(j+r)%a.length];
//            }
//
//        }
//
//    }
//
//        System.out.println(out);
//
//}
//}

//    public static void main(String[] args) {
//
//String strl = "abcdefghijklmnopqrstuvwxyz";
//    String stru = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//    String ans = "";
//        for(int i = 0 ; i < s.length() ; i++){
//        if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')){
//            for(int j = 0 ; j < strl.length() ; j++){
//                if(s.charAt(i) == strl.charAt(j)){
//                    ans += strl.charAt((j+k)%26);
//                }
//                else if(s.charAt(i) == stru.charAt(j)){
//                    ans += stru.charAt((j+k)%26);
//                }
//            }
//        }
//        else{
//            ans += s.charAt(i);
//        }
//    }
//        return ans;
//}
//}


    //grid challenge
//doesnt work
//    public static void main(String[] args) throws IOException {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        while(t-->0){
//            int n = Integer.parseInt(br.readLine());
//            String[]grid = new String[n];
//            for(int i=0;i<n;i++) {
//                grid[i] = sort(br.readLine());
//            }
//
//            boolean ok = true;
//
//            for(int i=0;i<n;i++){
//                for(int j=1;j<n;j++){
//                    if(grid[j].charAt(i) < grid[j-1].charAt(i)){
//                        ok = false;
//                        break;
//                    }
//                }
//            }
//            System.out.println(ok?"YES":"NO");
//
//        }
//    }
//    }

    //Works!!!!!
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t > 0) {
//            int n = sc.nextInt();
//            char[][] grid = new char[n][n];
//            for (int i = 0; i < n; i++) {
//                grid[i] = sc.next().toCharArray();
//                Arrays.sort(grid[i]);
//            }
//            boolean ok = true;
//            for (int i = 0; i < n - 1; i++) {
//                for (int j = 0; j < n; j++) {
//                    if (grid[i][j] > grid[i + 1][j]) {
//                        ok = false;
//                        break;
//                    }
//                }
//            }
//
//            if (ok) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//        }
//    }
//}
//    public static String main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//            int n = sc.nextInt();
//            char[][] grid = new char[n][n];
//
//        for (int i = 0; i < n; i++) {
//                grid[i] = sc.next().toCharArray();
//                Arrays.sort(grid[i]);
//            }
//        for (int i = 0; i < n-1; i++) {
//        for (int j = 0; j < n; j++) {
//        if (grid[i][j] > grid[i + 1][j]) {
//        return "NO";
//        }
//        }
//        }
//        return "YES";
//        }
//        }
//works
//    public static String gridChallenge(List<String> grid) {
//    Scanner sc = new Scanner(System.in);
//    int t = sc.nextInt();
//    int n = sc.nextInt();
//        for (int i = 0 ; i < grid.size(); i++) {
//            char[] c = grid.get(i).toCharArray();
//            Arrays.sort(c);
//            grid.set(i, new String(c));
//        }
//
//        for (int i = 0 ; i < grid.get(0).length() ; i++) {
//            int j = 0;
//            while (j < grid.size() - 1) {
//                if (grid.get(j).charAt(i) > grid.get(j + 1).charAt(i)) {
//                    return "NO";
//                }
//                j++;
//            }
//        }
//        return "YES";
//    }
//}


//    merge lists
//    static Main(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
//     if (head1 == null) return head1;
//    else if (head2 == null) return head2;
//
//    List<Integer> integerStack1 = new ArrayList<>();
//    List<Integer> integerStack2 = new ArrayList<>();
//    for (int i = 0; ; i++) {
//        integerStack1.add(head1.data);
//        if (head1.next != null)
//            head1 = head1.next;
//        else
//            break;
//    }
//
//    for (int i = 0; ; i++) {
//        integerStack2.add(head2.data);
//        if (head2.next != null)
//            head2 = head2.next;
//        else
//            break;
//    }
//
//    integerStack1.addAll(integerStack2);
//    Collections.sort(integerStack1);
//
//    SinglyLinkedListNode result = null;
//    int counter = integerStack1.size();
//    for (int i = 0; i < counter; i++) {
//        result = insertNodeAtTail(result, integerStack1.get(i));
//    }
//
//    return result;
//
//
//}

//queue
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int arr[] = new int[n];
//        int rear = -1;
//        int front = 0;
//        for (int i = 0; i < n; i++) {
//
//            int ops = in.nextInt();
//            if (ops == 1) {
//                int num = in.nextInt();
//                arr[++rear] = num;
//            } else if (ops == 2) {
//                int num = arr[front++];
//            } else {
//                System.out.println(arr[front]);
//            }
//        }
//    }
//}

//given an array print second largest and second smallest values from that array.
//    public static void main(String[] args) {
//        int[] arr = {5, 50, 34, 1, 6, 56, 82, 43, 101};
//        int small = arr[0], large = arr[0];
//        int s_small = -1, s_large = -1;
//        for(int i = 1; i < arr.length; i++) {
//            if(arr[i] < small){
//                 s_small = small;
//                 small = arr[i];
//            }
//            if(arr[i] > large) {
//                 s_large = large;
//                 large = arr[i];
//            }
//        }
//        System.out.println(s_small + " " + s_large);
//    }
//}

//accept array from user then take index of two numbers in array and swap them
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[10];
//        System.out.println("Array Values: ");
//        for (int i = 0; i <  arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Num1: ");
//        int a = sc.nextInt();
//        System.out.println("Num2 : ");
//        int b = sc.nextInt();
//        int index_a = 0, index_b = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == a) {
//                index_a = i;
//            }
//            if (arr[i] == b) {
//                index_b = i;
//            }
//        }
//        int c = arr[index_a];
//        arr[index_a] = arr[index_b];
//        arr[index_b] = c;
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }
//    }
//}


    //get 2 arrays from user and print numbers that appear in both arrays
//    public static void main(String[] args) {
//        int[] arr1 = {5, 50, 34, 1, 6, 56, 82, 43, 101};
//        int[] arr2 = {6, 30, 34, 1, 16, 86, 89, 42, 101};
//
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1.length; j++) {
//                if (arr1[i] == arr2[j]) {
//                    System.out.println(arr1[i]);
//                }
//            }
//        }
//    }
//}
//    public static String isBalanced(String s) {
//        Stack<Character> st = new Stack<>();
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        while (s.length() != (s = s.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length()) ;
//        if(s.isEmpty()) System.out.println("Yes");
//        else {
//            System.out.println("No");
//        }
//    }
//}

    //    public static String isBalanced(String s) {
//        while (s.length() != (s = s.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length()) ;
//        return s.isEmpty() ? "YES" : "NO";
//    }
//}
//    public static void main(String[] args) throws IOException {
//        URL urlForGetRequest = new URL("https://jsonplaceholder.typicode.com/posts/1");
//        String readLine = null;
//        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
//        conection.setRequestMethod("GET");
//        conection.setRequestProperty("Title", "substr");
//        int responseCode = conection.getResponseCode();
//
//
//        if (responseCode == HttpURLConnection.HTTP_OK) {
//            BufferedReader in = new BufferedReader(
//                    new InputStreamReader(conection.getInputStream()));
//            StringBuffer response = new StringBuffer();
//            while ((readLine = in.readLine()) != null) {
//                response.append(readLine);
//            }
//            in.close();
//            System.out.println(response.toString());
//        } else {
//            System.out.println("GET NOT WORKED");
//        }
//
//    }
//}

//    accept array of characters and print vowels that exist within array
//    public static void main(String[] args) {
//        char[] arr = {'a', 'b','c', 'd', 'e', 'f', 'g', 'h', 'i'};
//
//
//        for (int j = 0; j < arr.length; j++) {
//            if(arr[j]=='a' || arr[j]=='e' ||arr[j]=='i' || arr[j]=='o' ||
//                    arr[j]=='u' || arr[j]=='y')
//
//                    System.out.println(arr[j]);
//                }
//            }
//        }

