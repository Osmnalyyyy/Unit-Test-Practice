package junit;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class J06TestPractice {

    @Nested
    class NestedTest{
        @ParameterizedTest
        @CsvSource(value = {"27,9,3","-21,-7,3"})
        // methoda parameterizedTest annotation ile bu parametreli value olarak verir
        void testCarpSonuc(int sonuc,int y,int z){
            assertEquals(sonuc,Math.multiplyExact(y,z));
        }
        @ParameterizedTest
        @CsvSource(value = {"0,9,0","0,-7,0"})
        void testCarpSonucSifir(int sonuc,int y,int z){
            assertEquals(sonuc,Math.multiplyExact(y,z));
        }



    }
}
