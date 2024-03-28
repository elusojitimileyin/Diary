package africa.semicolon.Diary.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
 @Data
@Document
public class Diary {
    @Id
    private String username;
    private String password;
    private boolean isLocked;
    public boolean deleted;
    @DBRef
   private  List<Entry> entries;


}