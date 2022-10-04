package repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MessageRepository {
    // database im bu list olsun
    private List<String> list = Arrays.asList("hello", "mockito", "cok guzel");

    public void addMessage(String message) {
        list.add(message);// liste ekleme yani datebase e ekleme yapılan yer
    }

    public List<String> getMessages()throws SQLException {


        return list;
    }

}
