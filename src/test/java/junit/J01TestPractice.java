package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class J01TestPractice {
    //task length i test eden test method yaziniz
    @Test
    @DisplayName("Length test")
    void testLength() {
        int actualLength = "osman".length();
        int expected = 5;
        //    assertEquals(expected,actualLength);
        assertEquals(expected, actualLength, "wrong length");

        //   assertTrue();
        //   assertFalse();
    }

    @Test
    void testUpperCase() {
        String actualValue = "Merhaba".toUpperCase();
        String expectedValue = "MERHABA";
        assertEquals(expectedValue, actualValue, "test gecmedi");

    }

    //task contains methodu ile test yaziniz
    @Test
    void testContains() {
        boolean actualValue = "Junit".contains("u");
        boolean expectedValue = true;
        assertEquals(expectedValue, actualValue, "test gecmedi");
    }

    @Test
    void testFindMin() {
        assertEquals(15.8, Math.min(15.8, 25.6));
    }

    //task string bir objeyi array a cevirip string in yeni create ettiginiz
     // array ile uyusup uyusmadigini kontrol ediniz

    @Test
    void testArray(){
        String str="hibernate mvc boot junit mongodb";
        String[] actualArray=str.split(" ");
        String[] expectedArray={"hibernate", "mvc" ,"boot" ,"junit", "mongodb"};
       // assertArrayEquals(expectedArray,actualArray);
        assertTrue(Arrays.equals(expectedArray,actualArray));
    }

}
