package junit;
import org.junit.jupiter.api.*;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
public class J04TestPractice {
    //Test ettğimiz kodun bizim beklediğimiz exceptionu fırlattı mı test örneği gosteriniz?
    @Test
    @DisplayName("test exception hata firlatmasi kontrol ediliyor")
    void testException(){
        String str="java";

        assertThrows(NumberFormatException.class,()->{
            Integer.valueOf(str);
        });
    }
    @Test
    @DisplayName("test exception sifira bolunme kontrol ediliyor")
    void testException1(){
        int x=21;
        int y=0;
        assertThrows(ArithmeticException.class,()->bolumIslem(x,y));


    }
    @Test
    @DisplayName("test exception 2 Display ile verildi")
    void testException2(){
        int age=-5;
        assertThrows(IllegalArgumentException.class,()-> checkAge(age));
    }

    private void checkAge(int age) {// sart ile belirlenen bir age in testi yapıldı
        if (age<0){
            throw  new IllegalArgumentException();
        }else{
            System.out.println(age);
        }
    }

    private int bolumIslem(int x, int y) {
        return x/y;
    }



}
