import java.util.*;  
public class Solution {
    public static int negativeNumbers(int number) {
        // Scanner sc= new Scanner(System.in);
        // int number  = sc.nextInt();

        if (number > 0){
            return -(number);
        }
        else
        return number;
    }

    public static void main(String[] args) {
        int number = 5;
        assert negativeNumbers(number)==-5 : "Expect -5 for number = 5";
        number = -3;
        assert negativeNumbers(number)==-3 : "Expect -3 for number = -3";
        System.out.println("All test cases in main function passed");
    }
}
