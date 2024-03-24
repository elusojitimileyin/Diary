package africa.semicolon.Diary.Services;

import africa.semicolon.Diary.request.RegisterRequest;
import africa.semicolon.Diary.data.model.Diary;

import africa.semicolon.Diary.request.LoginRequest;


public interface DiaryService {
    void registerUser(RegisterRequest registerRequest);
    boolean login(LoginRequest loginRequest);
    long getNumberOfUsers();
    Diary findDiaryBy(String username);


}
