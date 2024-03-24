package africa.semicolon.Diary.Services;

import africa.semicolon.Diary.request.RegisterRequest;
import africa.semicolon.Diary.data.Repository.DiaryRepository;
import africa.semicolon.Diary.data.model.Diary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import africa.semicolon.Diary.request.LoginRequest;

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
        Optional<Diary> existingUser = diaryRepository.findByUsername(username);
        return existingUser.isEmpty();
    }

    @Override
    public boolean login(LoginRequest loginRequest) {
        Optional<Diary> userOptional = diaryRepository.findByUsername(loginRequest.getUsername());
        if (userOptional.isPresent()) {
            Diary user = userOptional.get();
            return user.getPassword().equals(loginRequest.getPassword());
        }
        return false;
    }

    @Override
    public long getNumberOfUsers() {
        return diaryRepository.count();
    }

    @Override
    public Diary findDiaryBy(String username) {

        Optional<Diary> userOptional = diaryRepository.findById(username);

        return userOptional.orElse(null);
    }

}
