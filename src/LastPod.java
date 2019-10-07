import java.util.ArrayList;

public class LastPod {


    // 1. check to see if a array has a 1 digit
    public static boolean hasOne(int n) {

        // checks to see if it is not a zero
        while (n != 0) {
            if (n % 10 == 1)
                return true;

            n /= 10;
        }

        return false;
    }


    // Method to check if x is power of 2
    static boolean isPowerOfTwo (int x)
    {
	// First x in the below expression is
	//for the case when x is 0
        return x!=0 && ((x&(x-1)) == 0);
    }






    public static void main(String[] args) {
        System.out.println(hasOne(39));
        System.out.println(hasOne(6301));
        System.out.println(hasOne(11));

       // 2.Reverse the string of redrum
        String hi = "REDRUM";
        System.out.println(new StringBuilder(hi).reverse().toString());


        System.out.println(isPowerOfTwo(4));


    }

}
