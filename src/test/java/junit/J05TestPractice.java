package junit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class J05TestPractice {

    @ParameterizedTest
    @ValueSource(strings = {"qwert", "wert", "null", "qwe"})
    void testLength(String str) {
        assertTrue(str.length() > 0);
    }

    @ParameterizedTest
    @CsvSource(value = {"true,junit,u","false,mvc,z"})// comma-separated values annotations
    // csv annotation 3 degeri contains methodu mantıgı ile test eder
    @DisplayName("csv Display ile verildi")
    void testCvsSource(Boolean b,String str1,String str2){
        assertEquals(b,str1.contains(str2));
    }
    
    @RepeatedTest(10)
    @Disabled// bu test calışmaz
    void testRepeat(){
        String[] str={"hibernate", "mvc" ,"boot" ,"junit" ,"mongodb"};
       // assertEquals("mvc","mvc spring bir framework".substring(0,3));
        for (int i = 0; i <str.length ; i++) {
            assertEquals(str[0],str[i]);
        }
    }



    
    
    
    
    
    
}
