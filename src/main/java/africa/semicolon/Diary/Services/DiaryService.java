package africa.semicolon.Diary.Services;

import africa.semicolon.Diary.request.LogoutRequest;
import africa.semicolon.Diary.request.RegisterRequest;
import africa.semicolon.Diary.data.model.Diary;

import africa.semicolon.Diary.request.LoginRequest;
import africa.semicolon.Diary.request.RemoveUserRequest;

import java.util.List;


public interface DiaryService {
    void registerUser(RegisterRequest registerRequest);
    void login(LoginRequest loginRequest);

    void logout(LogoutRequest logoutRequest);
    long getNumberOfUsers();
    Diary findDiaryBy(String username);

    List<Diary> getAllDiaries();

    void RemoveUser(RemoveUserRequest request);

}
