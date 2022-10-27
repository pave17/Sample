import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class String_OperationsTest {
    public static StringOperations StringOperation;

    @BeforeClass
    public static void setup() {
        StringOperation = new StringOperations();
    }

    //Author: Rohith tadi
    //Description: This test case is used to test the reverse string function
    @Test
    public void testreversestring(){
        assertEquals("nitin", StringOperation.reverseString("nitin"));
    }
    //Author:Rohith tadi
    //Description: This test case is used to test the concatenation of strings function
    @Test
    public void testconcatenation(){
        assertEquals("Snowball", StringOperation.StringConcatenation("Snow", "ball"));
    }
    //Author: Rohith tadi
    //Descirption: This test case is used to test the length of string function
    @Test
    public void testlengthstring(){
        assertEquals(15, StringOperation.StringLength("SoftwareTesting"));
    }
    //Author: Ibrahim
    //Description: This test tests the string lowercase method
    @Test
    public void test_String_Lowercase(){
        assertEquals("refer", StringOperation.String_Lowercase("REFER"));
    }
    //Author:Ibrahim
    //Description:This test tests the count vowels method
    @Test
    public void test_countVowels(){
        assertEquals(3, StringOperation.countVowels("Ibrahim"));
    }
    //Author: Ibrahim
    //Description: This test tests the count consonants
    @Test
    public void test_countconsonants(){
        assertEquals(4, StringOperation.countConsonants(("Ibrahim")));
    }

    // Author: Pravalika
    // Description: This test tests the StringOccurence() function

    @Test
    public void test_StringOccurence() {
        assertEquals(3, StringOperations.StringOccurence("Pravallika"));
    }

    // Author: Pravalika
    // Description: This test tests the StringTrim() function

    @Test
    public void test_StringTrim() {
        assertEquals("madam", StringOperation.StringTrim("madam"));
    }

    // Author: Pravalika
    // Description: Ths test tests the Anagram() function
    @Test
    public void test_isAnagram() {
        assertTrue(StringOperation.isAnagram("rat", "tar"));
    }

    /// Author: Pravalika
    // Description : Integration tests which is a combination of countVowels, StringConcatenation and String Reverse
    @Test
    public void Pravalika_test_Integration(){
        assertEquals(2,StringOperation.countVowels(StringOperation.reverseString(StringOperation.StringConcatenation("ma","dam"))));
    }

}






