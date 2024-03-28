package africa.semicolon.Diary.Services;

import africa.semicolon.Diary.data.Repository.DiaryRepository;
import africa.semicolon.Diary.data.model.Diary;
import africa.semicolon.Diary.Dtos.request.LoginRequest;
import africa.semicolon.Diary.Dtos.request.LogoutRequest;
import africa.semicolon.Diary.Dtos.request.RegisterRequest;
import africa.semicolon.Diary.Dtos.request.RemoveUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiaryServiceImp implements DiaryService {

    @Autowired
    private DiaryRepository diaryRepository;

    @Override
    public void registerUser(RegisterRequest registerRequest) {
        if (validateRegistration(registerRequest)) {
            Diary user = new Diary();
            user.setUsername(registerRequest.getUsername());
            user.setPassword(registerRequest.getPassword());

            diaryRepository.save(user);
        } else {
            throw new IllegalArgumentException("Registration failed");
        }
    }

    private boolean validateRegistration(RegisterRequest registerRequest) {
        return validateUsername(registerRequest.getUsername()) &&
                validatePassword(registerRequest.getPassword()) &&
                validateExistingUsername(registerRequest.getUsername());
    }

    private boolean validateUsername(String username) {
        return username != null && !username.isEmpty();
    }

    private boolean validatePassword(String password) {
        return password != null && !password.isEmpty();
    }

    private boolean validateExistingUsername(String username) {
        return diaryRepository.findByUsername(username).isEmpty();
    }

    @Override
    public void login(LoginRequest loginRequest) {
        Optional<Diary> userOptional = diaryRepository.findByUsername(loginRequest.getUsername());
        userOptional.filter(user -> user.getPassword().equals(loginRequest.getPassword()));
    }


    @Override
    public void logout(LogoutRequest logoutRequest) {
        Optional<Diary> userOptional = diaryRepository.findByUsername(logoutRequest.getUsername());
        userOptional.filter(user -> user.getPassword().equals(logoutRequest.getPassword()));
    }



    @Override
    public long getNumberOfUsers() {
        return diaryRepository.count();
    }

    @Override
    public Diary findDiaryBy(String username) {
//        return diaryRepository.findByUsername(username).orElse(null);
    username = username.toLowerCase();
    Optional<Diary> foundDiary = diaryRepository.findByUsername(username.toLowerCase());
    if (foundDiary.isEmpty()){
        throw new IllegalArgumentException("User not found");
    }
    return foundDiary.get();
    }

    @Override
    public List<Diary> getAllDiaries() {
        return diaryRepository.findAll();
    }

    @Override
    public void RemoveUser(RemoveUserRequest request) {
      Diary diary = findDiaryBy(request.getUsername().toLowerCase());
      if(diary.isLocked()) throw new IllegalArgumentException("login to access this platform");

      if (isPasswordIncorrect(diary, request.getPassword()))
            throw new IllegalArgumentException("password is wrong");
      diary.setDeleted(true);
      diaryRepository.save(diary);
    }

    private boolean isPasswordIncorrect(Diary diary, String password) {
        return !diary.getPassword().equals(password);
    }

}
