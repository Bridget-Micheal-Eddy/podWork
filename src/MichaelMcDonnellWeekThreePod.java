import java.util.ArrayList;
import java.util.List;

public class MichaelMcDonnellWeekThreePod {

    public static void main(String[] args) {
        staircase(10);
//        compareTriplets();
    }

    //HackerRank

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> comparisonList = new ArrayList<>();
        int aliceComparisonPoints = 0;
        int bobComparisonPoints = 0;

        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                aliceComparisonPoints++;
            } else if(a.get(i) < b.get(i)) {
                bobComparisonPoints++;
            } else if(a.get(i) == a.get(i)) {
                continue;
            }
        }

        comparisonList.add(aliceComparisonPoints);
        comparisonList.add(bobComparisonPoints);

        return comparisonList;
    }

    //HackerRank

    static void staircase(int n) {

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)

            {
                if((i+j)>n)
                {
                    System.out.print("#");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }

    //CodeWars

    public static String getMiddle(String word) {
        int position;
        int length;
        if (word.length() % 2 == 0)
        {
            position = word.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = word.length() / 2;
            length = 1;
        }
        return word.substring(position, position + length);

    }

}
