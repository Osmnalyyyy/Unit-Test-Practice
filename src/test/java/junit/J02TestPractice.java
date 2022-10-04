package junit;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
public class J02TestPractice {
    String str;
    @Test
    void  testArray(TestInfo info){
        //testini yaptiginiz array in test ismini konsola yazidiriniz
        String[] actualArr=str.split(" ");

        String[] expected={"hibernate", "mvc" ,"boot" ,"junit", "mongodb"};
        System.out.println("info.getDisplayName() = " + info.getDisplayName()+" basladı");
        assertTrue(Arrays.equals(expected,actualArr));

    }
    @BeforeEach
    void beforeEach(){
        str="hibernate";
        System.out.println("beforeEach calisti");
    }
    @AfterEach
    void afterEach(){
        System.out.println("afterEach calisti");
    }

    @Test
    void testStringLength(TestInfo info){
        int actualLength=str.length();
        int expectedLength=9;
        assertEquals(expectedLength,actualLength);
        System.out.println("info.getDisplayName() = " + info.getDisplayName()+" basladı");

    }


}
