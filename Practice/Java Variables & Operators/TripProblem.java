public class Solution {
    public static boolean roadTrip(double p, double x, double y) {
        
        if ( (p*x) >= y){
            return true;
        }
        else
        return false;
    }

    public static void main(String[] args) {
        double p=3, x=50, y=100;
        assert(roadTrip(p,x,y)) : "Expect true for input = [3,50,100]";
        System.out.println("All test cases in main function passed");
    }
}
