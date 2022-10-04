package service;

import repository.MessageRepository;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class MessageService {

    // bu class da repository'e erişim methodları yazılır yani bussiness logic yapıldıgı yer
    // testi yapılacak class burasıdır
    private  MessageRepository messageRepository;

    public MessageService (MessageRepository messageRepository){
        this.messageRepository=messageRepository;
    }

    public void addMessage(String message){// esas test edeceğim bu methodun calısıp calısmadıgı
         messageRepository.addMessage(message);// iste test'te test edilecek kısım tam olarak burası
    }

    public List<String> getMessage(){
        try {
            return messageRepository.getMessages();
        } catch (SQLException e) {
            return Arrays.asList();
        }
    }
}
