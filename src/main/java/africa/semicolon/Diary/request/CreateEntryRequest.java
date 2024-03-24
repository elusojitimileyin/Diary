package africa.semicolon.Diary.request;

import lombok.Data;

@Data
public class CreateEntryRequest {
    private String title;
    private String body;
    private String Author;
    private String getUsername;
}
