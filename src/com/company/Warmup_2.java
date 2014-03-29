package com.company;

import java.util.Random;

public class Warmup_2 {

    public void warmup2() {
        W_2 w = new W_2();
        System.out.println("stringTimes (" + w.str + "," + w.a + ") ->" + w.times);
        System.out.println("frontTimes (" + w.b + "," + w.c + " ) -> " + w.fTimes);
        System.out.println("countXX (" + w.d + ") -> " + w.count);

        System.out.print("arrayCount9 (");
        w.arrayPrint(w.mass2);
        System.out.println(") -> " + w.arrayCount);

        System.out.print("arrayFront9 (");
        w.arrayPrint(w.mass2);
        System.out.println(") -> "+ w.front9 );

        System.out.print("array123 (");
        w.arrayPrint(w.arrtemp);
        System.out.println(") -> "+w.arr);




    }

    class W_2 {
        Random rand = new Random();

        /*
        Given a string and a non-negative int n, return a larger string that is n copies of the original string.
        stringTimes("Hi", 2) → "HiHi"
        stringTimes("Hi", 3) → "HiHiHi"
        stringTimes("Hi", 1) → "Hi"
         */
        String str = "hello";
        int a = rand.nextInt(5) + 1;
        String times = srtingTimes(str, a);

        public String srtingTimes(String a, int b) {
            String res = " ";
            for (int i = 0; i < b; i++) {
                res = res + a;
            }
            return res;
        }

        /*
    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
    or whatever is there if the string is less than length 3. Return n copies of the front;
    frontTimes("Chocolate", 2) → "ChoCho"
    frontTimes("Chocolate", 3) → "ChoChoCho"
    frontTimes("Abc", 3) → "AbcAbcAbc"
         */
        String b = "Chocolate";
        int c = rand.nextInt(5) + 1;
        String fTimes = frontTimes(b, c);

        public String frontTimes(String a, int b) {
            String res = "";
            String res2 = "";
            if (a.length() >= 3 && b > 0) {
                res = a.substring(0, 3);
                for (int i = 0; i < b; i++) {
                    res2 = res2 + res;

                }
            }
            return res2;
        }

        /*
    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
    countXX("abcxx") → 1
    countXX("xxx") → 2
    countXX("xxxx") → 3
         */
        String d = "exxxxxxample";
        int count = countXX(d);

        public int countXX(String a) {
            int count = 0;
            for (int i = 0; i < a.length() - 1; i++) {
                if (a.substring(i, i + 1).equals("x")) {
                    count++;
                }
            }
            return count;
        }

        /*
    Given an array of ints, return the number of 9's in the array.
    arrayCount9({1, 2, 9}) → 1
    arrayCount9({1, 9, 9}) → 2
    arrayCount9({1, 9, 9, 3, 9}) → 3
         */
        int[] mass = new int[10];
        int[] mass2 = mass9(mass);
        int arrayCount = arrayCount(mass2);


        private int[] mass9(int[] tempmass) {
            for (int i = 0; i < tempmass.length; i++) {
                tempmass[i] = rand.nextInt(5) + 6;
            }
            return tempmass;
        }

        private int arrayCount(int[] tempArray) {
            int count = 0;
            for (int i = 0; i < tempArray.length; i++) {
                if (tempArray[i] == 9) {
                    count++;
                }
            }
            return count;
        }

        public void arrayPrint(int[] arrayTemp) {
            for (int i = 0; i < arrayTemp.length; i++) {
                System.out.print(arrayTemp[i] + " ");
            }
        }

        /*
    Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
    arrayFront9({1, 2, 9, 3, 4}) → true
    arrayFront9({1, 2, 3, 4, 9}) → false
    arrayFront9({1, 2, 3, 4, 5}) → false
         */
        boolean front9 = arrayFront9(mass);

        public boolean arrayFront9(int[] arrayTemp) {
            boolean fr = false;
            for (int i = 0; i <= 4; i++) {
                if (arrayTemp[i] == 9) {
                    fr=true;
                }
            }
            return fr;
        }

        /*

    Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.
    array123({1, 1, 2, 3, 1}) → true
    array123({1, 1, 2, 4, 1}) → false
    array123({1, 1, 2, 1, 2, 3}) → true
         */

        int [] array123=new int[10];
        int [] arrtemp=create123(array123);

        boolean arr=arr123(arrtemp);

        public int [] create123(int [] arrTemp){
            for (int i=0;i<arrTemp.length;i++){
                arrTemp[i]=rand.nextInt(3)+1;
            }
            return arrTemp;
        }
        public boolean arr123(int [] arrtemp){
            boolean arr= false;
            for (int i=0;i<arrtemp.length;i++ ){
                if (arrtemp[i]==1){
                    if(arrtemp[i+1]==2){
                        if(arrtemp[i+2]==3){
                            arr=true;
                        }
                    }return arr;
                }return arr;
            }
            return arr;
        }


    }
}