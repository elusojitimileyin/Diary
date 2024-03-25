package africa.semicolon.Diary.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UpdateEntryRequest {
    public LocalDateTime getDateCreated;
    private String username;
    private String title;
    private String body;
    private String Author;
    private String id;
}
