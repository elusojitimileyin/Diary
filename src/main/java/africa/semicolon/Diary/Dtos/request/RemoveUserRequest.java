package africa.semicolon.Diary.Dtos.request;

import lombok.Data;
@Data

public class RemoveUserRequest {
    private String username;
    private String password;
}
