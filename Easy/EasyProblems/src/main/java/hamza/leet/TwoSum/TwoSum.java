package hamza.leet.TwoSum;
public class TwoSum {
    public static void main(String[] args){

        /*Brute Forse Method Implementation: */

//        BruteForseMethod twoSum = new BruteForseMethod();
//        int[] result = twoSum.twoSum(new int[]{1, 3, 4, 5, 1}, 2);
//
//        if (result != null) {
//            System.out.println("The numbers are: " + result[0] + result[1]);
//        }
//        else {
//            System.out.println("No solutions found");
//        }

        OptamisedSolution solution = new OptamisedSolution();
        int [] keyValue = solution.twoSum(new int[]{1, 5, 6}, 9);

        for (int i = 0; i < keyValue.length; i++) {
            System.out.println(keyValue[i]);
        }




  }



}
