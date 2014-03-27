package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Warmap_1 warmap = new Warmap_1();
        System.out.println("sleepIn (" + warmap.weekday + "," + warmap.vecation + ") -> " + warmap.sl);
        System.out.println("monkeytrable (" + warmap.aSmile + "," + warmap.bSmile + ") -> " + warmap.sm);
        System.out.println("sumdouble (" + warmap.a + "," + warmap.b + ") -> " + warmap.sD);
        System.out.println("diff21 (" + warmap.c + ") -> " + warmap.diff);
        System.out.println("parrottrouble(" + warmap.talk + "," + warmap.hour + ") -> " + warmap.pattot);
        System.out.println("makes10(" + warmap.d + "," + warmap.e + ") -> " + warmap.makes);
        System.out.println("postNeg(" + warmap.f + "," + warmap.g + "," + warmap.neg + " ) -> " + warmap.pN);
        System.out.println("notString (" + warmap.boolStr + ") ->" + warmap.not);
        System.out.println("missingChar (" + warmap.l + "," + warmap.m + ") -> " + warmap.miss);
        System.out.println("frontbask ("+warmap.n+") -> "+warmap.front);
    }
}

class Warmap_1 {
    Random rand = new Random();

    /*
    The parameter weekday is true if it is a weekday,
    and the parameter vacation is true if we are on vacation.
    We sleep in if it is not a weekday or we're on vacation.
    Return true if we sleep in.
    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true
    */
    boolean weekday = rand.nextBoolean();
    boolean vecation = rand.nextBoolean();
    boolean sl = sleepIn(weekday, vecation);

    public boolean sleepIn(boolean weekday, boolean vecation) {
        if (!weekday || vecation) {
            return true;
        } else {
            return false;
        }
    }

    /*
    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
    We are in trouble if they are both smiling or if neither of them is smiling.
    Return true if we are in trouble.

    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false
    */
    boolean aSmile = rand.nextBoolean();
    boolean bSmile = rand.nextBoolean();
    boolean sm = monkeytrouble(aSmile, bSmile);

    public boolean monkeytrouble(boolean aSmile, boolean bSmile) {
        if (!aSmile && !bSmile) {
            return true;
        } else if (aSmile && bSmile) {
            return true;
        } else {
            return false;
        }
    }


    /* Given two int values, return their sum. Unless the two values are the same, then return double their sum.

     sumDouble(1, 2) → 3
     sumDouble(3, 2) → 5
     sumDouble(2, 2) → 8
      */
    int a = rand.nextInt(10);
    int b = rand.nextInt(10);
    int sD = sumDouble(a, b);

    public int sumDouble(int a, int b) {
        int c = 0;
        if (a == b) {
            c = (a + b) * 2;
        }
        if (a != b) {
            c = a + b;
        }
        return c;
    }

    /*Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0
*/
    int c = rand.nextInt(50);
    int diff = diff21(c);

    public int diff21(int a) {
        int c = 0;
        if (a > 21) {
            c = (a - 21) * 2;
        }
        if (a <= 21) {
            c = 21 - a;
        }
        return c;
    }

    /*We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
     We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
    parrotTrouble(true, 6) → true
    parrotTrouble(true, 7) → false
    parrotTrouble(false, 6) → false
      */

    int hour = rand.nextInt(23);
    boolean talk = rand.nextBoolean();
    boolean pattot = pattoyTrable(talk, hour);

    public boolean pattoyTrable(boolean talk, int hour) {
        return (talk && (hour < 7 || hour > 20));
    }
        /*
    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

    makes10(9, 10) → true
    makes10(9, 9) → false
    makes10(1, 9) → true
    */

    int d = rand.nextInt(11);
    int e = rand.nextInt(11);
    boolean makes = makes10(d, e);

    public boolean makes10(int a, int b) {
        return ((a == 10) || (b == 10) || (a + b) == 10);
    }

    /*
    Given 2 int values, return true if one is negative and one is positive.
    Except if the parameter "negative" is true, then return true only if both are negative.
    posNeg(1, -1, false) → true
    posNeg(-1, 1, false) → true
    posNeg(-4, -5, true) → true

     */
    int f = rand.nextInt(10) - 5;
    int g = rand.nextInt(10) - 5;
    boolean neg = rand.nextBoolean();
    boolean pN = posNeg(f, g, neg);

    public boolean posNeg(int a, int b, boolean neg) {
        if (a > 0 && b < 0 && (neg == false)) {
            return true;
        }
        if (a < 0 && b < 0 && (neg == true)) {
            return true;
        }
        if (a < 0 && b > 0 && (neg == false)) {
            return true;
        } else {
            return false;
        }

    }
    /*
    Given a string, return a new string where "not " has been added to the front.
    However, if the string already begins with "not", return the string unchanged.
    Note: use .equals() to compare 2 strings.

    notString("candy") → "not candy"
    notString("x") → "not x"
    notString("not bad") → "not bad"
     */

    String sA = "good";
    String sB = "not bad";
    boolean rb = rand.nextBoolean();
    String boolStr = boolAB(sA, sB, rb);
    String not = notString(boolStr);

    private String boolAB(String sA, String sB, boolean rb) {
        if (rb == true) {
            return sA;
        } else {
            return sB;
        }
    }

    public String notString(String x) {
        if (x.length() >= 3 && x.substring(0, 3).equals("not")) {
            return x;
        } else {
            return "not " + x;
        }
    }
    /*
Given a non-empty string and an int n, return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

    missingChar("kitten", 1) → "ktten"
    missingChar("kitten", 0) → "itten"
    missingChar("kitten", 4) → "kittn"

     */

    String l = "revolution";
    int m = rand.nextInt(l.length());
    String miss = missingChar(l, m);

    public String missingChar(String a, int b) {
        String start = a.substring(0, b);
        String end = a.substring(b + 1, a.length());
        return start + end;
    }
    /*

    Given a string, return a new string where the first and last chars have been exchanged.
    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"

     */

    String n = "front";
    String front = frontBack(n);
    public String frontBack(String a) {
        if (a.length() <= 1) {
            return a;
        } else {
            String firstChar = a.substring(0, 1);
            String lastChar = a.substring(a.length() - 1);
            String middle = a.substring(1, a.length() - 1);
            return lastChar + middle + firstChar;
        }
    }


}


