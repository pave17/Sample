import java.util.Arrays;


public class StringOperations {
    //Author: Rohith
    //Description: This function is used to reverse the given string
    public static String reverseString(String str) {
        char ch[] = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        return rev;

    }

    /// Author: Rohith
    //Description: This function is to merge two strings
    public static String StringConcatenation(String s1, String s2){
        String s3 = s1.concat(s2);
        return s3;
    }

    //Author: Rohith
    //Author: This function is used to give length of the string
    public static int StringLength(String s1) {
        int length = s1.length();
        return length;
    }

    // Author :Ibrahim
    // Description : The below method returns the number of vowels in the string
    //  This function is tested by Unit Test : test_countVowels()
    public static int countVowels(String S1)
    {
        int count = 0;

        char[] Chars = S1.toCharArray();

        for (char chr : Chars)
        {
            if (chr == 'a' || chr == 'A' || chr == 'e' || chr == 'E' || chr == 'i' || chr == 'I' || chr =='o' || chr == 'O' || chr == 'u' || chr == 'U' )
            {
                count = count + 1;
            }
        }
        return count;
    }

    // Author :Ibrahim
    // Description : The below method returns the number of consonants in the string
    //  This function is tested by Unit Test : test_countConsonants()
    public static int countConsonants(String S2)
    {
        int count = 0;

        char[] Chars = S2.toCharArray();

        for ( char chr: Chars)
        {
            if (chr != 'a' && chr != 'A' && chr != 'e' && chr != 'E' && chr != 'i' && chr != 'I' && chr != 'o' && chr != 'O' && chr != 'u' && chr != 'U')
            {
                count = count + 1;
            }
        }
        return count;
    }

    // Author :Ibrahim
    // Description : The below method returns the number of lowercase in the string
    //  This function is tested by Unit Test : test_StringLowercase()
    public String String_Lowercase(String Str3) {
        String Str4 = Str3.toLowerCase();
        return Str4;
    }

    // Author: Pravalika
    // Description: This below method returns the count of occurence of a letter
    // This function is tested by Unit Test : test_StringOccurence()

    public static int StringOccurence(String Word) {
        char Character = 'a';
        int count = 0;
        for (int i = 0; i < Word.length(); i++) {
            if (Word.charAt(i) == Character) {
                count++;
            }
        }
        return count;

    }

    // Author: Pravalika
    // Description: This below method removes the extra spaces at the starting and ending of the string
    // This function is tested by Unit Test : test_StringTrim()
    public String StringTrim(String word) {
        word = word.trim();
        return word;
    }

    // Author: Pravalika
    // Description: This below method returns the boolean value by checking whether a string is anagram or not
    // This function is tested by Unit Test : test_isAnagram()
    public boolean isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str1.replaceAll("\\s", "");
        boolean flag = true;
        if (s1.length() != s2.length()){
            flag = false;
        }
        else{
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            flag = Arrays.equals(ArrayS1, ArrayS2);
        }
        if(flag)
            return true;
        else
            return false;
    }
}


