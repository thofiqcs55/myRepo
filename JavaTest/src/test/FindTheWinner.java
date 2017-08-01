package test;

/**
 * Created by Thofiq.Khan on 8/1/2017
 */
public class FindTheWinner {

    public static String MARIA = "Maria", ANDREA = "Andrea",ODD = "Odd", EVEN = "Even", EMPTY_STRING = "", TIE="Tie";

    /**
     * Inputs
     */
    public static int[] andrea = {1,2,3,4,6};
    public static int[] maria = {2,1,3,4,2};

    /**
     * Main
     * @param args
     */
    public static void main(String[] args){
        System.out.println(winner(andrea, maria, EVEN));
    }

    /**
     * Winner method to declare the winner based on computation
     * @param andrea array of input values
     * @param maria array of input values
     * @param s ODD or Even
     * @return winner name Andrea/Maria
     */
    static String winner(int[] andrea, int[] maria, String s) {
        int andreaSum = 0, mariaSum = 0;

        //Length of both the array should be equal and should not be empty
        if (andrea.length > 0 && maria.length > 0 && andrea.length == maria.length) {
            int startValueForLoop = 0, incrementValue = 2;
            //Find starting value of i to loop the elements
            if (s.equals(ODD)) {
                startValueForLoop = 1;
            } else if (s.equals(EVEN)) {
                startValueForLoop = 0;
            }
            for (int i = startValueForLoop; i < andrea.length; ) {
                andreaSum = andreaSum + (andrea[i] - maria[i]);
                mariaSum = mariaSum + (maria[i]-andrea[i]);
                //To skip odd or even result
                i = i + incrementValue;
            }
        }

        if(andreaSum != 0 && mariaSum != 0) {
            if (andreaSum > mariaSum) {
                return ANDREA;
            } else if (andreaSum < mariaSum) {
                return MARIA;
            } else if (andreaSum == mariaSum) {
                return TIE;
            }
        }

        return EMPTY_STRING;
    }
}
