public class Solution {
    public static String evenOrOdd(int number) {
        if(number%2==0){
            return "Even";
        }
        else
        return "Odd";
    }

    public static void main(String[] args){
        int number = 10;
        assert(evenOrOdd(number).equals("Even")) : "Expect Even for input 10";
        System.out.println("All test cases in main function passed");
    }
}
