import java.util.*;

public class Solution 
{
     String title;
     String artist;
     public int songListenerCount = 0;
     public int totalCount ;
    

    public Solution(String title, String artist) 
    {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getArtist() 
    {
        return artist;
    }

    public void setArtist(String artist) 
    {
        this.artist = artist;
    }

    public int howMany (int todaysListner)
    {
        totalCount =  todaysListner +  songListenerCount;
        // return totalCount;
        // int songListenerCount = int songListenerCount + int totalCount;
        songListenerCount = songListenerCount + totalCount;
        return totalCount;
    }




    public static void main(String args[])
    {
        Solution hikaruNara = new Solution("Hikaru Nara", "Goose House");
        assert hikaruNara.getArtist().equals("Goose House") : "Expect \"Goose House\" for getArtist() when Solution = [\"Hikaru Nara\", \"Goose House\"]";
        assert hikaruNara.getTitle().equals("Hikaru Nara") : "Expect \"Hikaru Nara\" for getTitle() when Solution = [\"Hikaru Nara\", \"Goose House\"]";
        assert hikaruNara.howMany(5) == 5 : "howMany for Hikaru Naru => 3";
        assert hikaruNara.howMany(22) == 27 : "howMany for Hikaru Naru => 27";

        System.out.println("All test cases in main function passed");

    }
}

