package africa.semicolon.Diary.Controller;

import africa.semicolon.Diary.Services.DiaryService;
import africa.semicolon.Diary.request.CreateEntryRequest;
import africa.semicolon.Diary.request.RegisterRequest;
import africa.semicolon.Diary.request.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class DiaryController {
    @Autowired
    private DiaryService diaryService;

    @PostMapping("/register")
    public String registerUser(@RequestBody RegisterRequest registerRequest) {
        try {
            diaryService.registerUser(registerRequest);
            return "User registered successfully";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest){
        try {

            diaryService.login(loginRequest);
            return "User login successfully";
        }catch (IllegalArgumentException e){
            return e.getMessage();
        }
    }
//    @PostMapping("create entry")
//    public void createEntry(@RequestBody CreateEntryRequest request){
//        try {
//            entrySerices.createEntry(crea)
//        }
//    }

}
