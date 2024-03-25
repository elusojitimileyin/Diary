package africa.semicolon.Diary.request;

import lombok.Data;
@Data

public class RemoveUserRequest {
    private String username;
    private String password;
}
