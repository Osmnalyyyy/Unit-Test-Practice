package junit;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
public class J03TestPractice {
    @BeforeAll
   static void beforeAll(TestInfo info){
        System.out.println("info.getDisplayName() = " + info.getDisplayName()+" calisti");
    }
    @AfterAll
    static void afterAll(TestInfo info){
        System.out.println("info.getDisplayName() = " + info.getDisplayName()+" calisti");
    }
    @Test
     void testArray(TestInfo info){
        String str="hibernate mvc boot junit mongodb";
        String[] actualArray=str.split(" ");
        String[] expectedArray={"hibernate", "mvc" ,"boot" ,"junit", "mongodb"};

        assertArrayEquals(expectedArray,actualArray,"array eslesmedi");
        System.out.println("info.getDisplayName() = " + info.getDisplayName()+" calisti");

    }






}
