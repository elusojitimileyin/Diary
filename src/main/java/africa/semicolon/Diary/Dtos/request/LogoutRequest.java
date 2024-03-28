package africa.semicolon.Diary.Dtos.request;

import lombok.Data;

@Data
public class LogoutRequest {
    private String username;
    private String password;
}
