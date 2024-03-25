package africa.semicolon.Diary.request;

import lombok.Data;

@Data
public class LogoutRequest {
    private String username;
    private String password;
}
