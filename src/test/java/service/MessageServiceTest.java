package service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;


public class MessageServiceTest {

    @Test
    void addMessageTest() {
        MessageService messageService = Mockito.mock(MessageService.class);
        messageService.addMessage("selam");
        messageService.addMessage("mockito");
        //   mockito diye bir String bir obje veya parametre addMessage
        //   servisine verilmiş mi verilmemiş mi onu kontrol ediyoruz
        verify(messageService).addMessage("mockito");
        verify(messageService,times(1)).addMessage("mockito");
    }






}
