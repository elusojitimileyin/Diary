package africa.semicolon.Diary.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Data
@Document
public class Entry {
    private String id ;
    private String title;
    private String body;
    private LocalDateTime dateCreated = LocalDateTime.now();
    private String author;

}
