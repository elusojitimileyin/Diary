package africa.semicolon.Diary.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CreateEntryRequest {
    private String username;
    private String title;
    private String body;
}
