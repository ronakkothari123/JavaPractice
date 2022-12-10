package String;

import java.util.Arrays;

public class StringLib {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(vowelCount("i think, therefore i am")));
    }

    public static int[] vowelCount(String string){
        //initialize vowels array that stores all vowels
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

        //initialize the returnArray with size of vowels
        int[] vowelCounts = new int[vowels.length];

        //cycle through entire string and tally all the vowels in vowelCounts
        for(int i = 0; i < string.length(); i++) for(int j = 0; j < vowels.length; j++) if(string.charAt(i) == vowels[j]) vowelCounts[j]++;

        //returns the vowelCounts values
        return vowelCounts;
    }
}
