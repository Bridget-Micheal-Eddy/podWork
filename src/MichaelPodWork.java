import java.util.Scanner;

public class MichaelPodWork {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(diff21(9));

        System.out.println(sleepIn(true, false));

    do {

        System.out.println("Give me a grade number: ");

        int grade = Integer.parseInt(input.nextLine());

        String gradeLetter = "";

        if (grade <= 100 && grade >= 88) {
            gradeLetter = "A";

            if (grade <= 100 && grade >= 98){
                gradeLetter = "A+";
            }

        } else if (grade <= 87 && grade >= 80) {
            gradeLetter = "B";

            if (grade <= 89 && grade >= 87 ){
                gradeLetter = "B+";
            }

        } else if (grade <= 79 && grade >= 67) {
            gradeLetter = "C";

            if (grade <= 79 && grade >= 77 ){
                gradeLetter = "C+";
            }

        } else if (grade <= 66 && grade >= 60) {
            gradeLetter = "D";

            if (grade <= 69 && grade >= 67 ){
                gradeLetter = "D+";
            }

        } else if (grade <= 59 && grade >= 0) {
            gradeLetter = "F";
        }

        System.out.println(gradeLetter);

        System.out.println("Would you like to test another grade Y/N");
    }while (input.nextLine().equalsIgnoreCase("y"));
    }

    public static int diff21(int n){
        if (n <= 21){
            return 21 - n;
        } else {
            return ( n - 21 ) * 2;
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation){
        if (!weekday || vacation){
            return true;
        }else{
            return false;
        }
    }
}
