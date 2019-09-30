package bridgetpods;

public class BridgetsPodWork {
    public static void main(String[] args) {
        //near hundred tests
        System.out.println(nearHundred(93)); //true
        System.out.println(nearHundred(90)); //true
        System.out.println(nearHundred(89)); //false
        //has teen tests
        System.out.println(hasTeen(13, 20, 10)); //true
        System.out.println(hasTeen(20, 19, 10)); //true
        System.out.println(hasTeen(20, 10, 13)); //true
        //monkey trouble tests
        System.out.println(monkeyTrouble(true, true)); //true
        System.out.println(monkeyTrouble(false, false)); //true
        System.out.println(monkeyTrouble(true, false)); //false


    }
// Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

   static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }
    // We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
     static boolean hasTeen(int a, int b, int c) {

        return (a >= 13 && a <= 19) ||
                (b >= 13 && b <= 19) ||
                (c >= 13 && c <= 19);

    }
//    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
   static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        return ((aSmile && bSmile) || (!aSmile && !bSmile));

    }
}
//




