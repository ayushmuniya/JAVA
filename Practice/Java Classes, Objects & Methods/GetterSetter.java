import java.util.*;

public class Solution {

    public int beets;

    public Solution() {
        this.beets = 0;
    }

    public int GetBeets() {
        return beets;
    }

    public void SetBeets(int beets) {
        this.beets = beets;
    }

    public static void main(String args[]) {
        Solution ob = new Solution();
        ob.SetBeets(21);
        assert ob.GetBeets() == 21 : "Setting beets = 21 then Getting beets";
        System.out.println("All test cases in main function passed");

    }
}
