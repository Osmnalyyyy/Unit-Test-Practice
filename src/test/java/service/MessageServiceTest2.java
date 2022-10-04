package service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import repository.MessageRepository;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MessageServiceTest2 {

    @Mock//mocklanacak kısım mocklandı ve bu classa verildi
    MessageRepository repository;

    @InjectMocks//service instance oluşturup ve yukarıdaki her objeyi bu classa enjekte eder
    MessageService service;

    @Test
    void testMessage() {

        try {
            when(repository.getMessages()).thenReturn(Arrays.asList("asd", "sda"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        List<String> actualList = service.getMessage();
     //   assertNotNull(actualList);
        assertEquals(2 ,actualList.size());
    }

}
