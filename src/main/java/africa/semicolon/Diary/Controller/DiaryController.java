package africa.semicolon.Diary.Controller;

import africa.semicolon.Diary.Services.DiaryService;
import africa.semicolon.Diary.Services.EntryServices;
import africa.semicolon.Diary.data.model.Diary;
import africa.semicolon.Diary.data.model.Entry;
import africa.semicolon.Diary.request.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class DiaryController {
    @Autowired
    private DiaryService diaryService;
    @Autowired
    private EntryServices entryServices;

    @PostMapping("/register")
    public String registerUser(@RequestBody RegisterRequest registerRequest) {
        try {
            diaryService.registerUser(registerRequest);
            return "User registered successfully";
        } catch (RuntimeException e) {
            return e.getMessage();
        }
    }
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest){
        try {

            diaryService.login(loginRequest);
            return "User login successfully";
        }catch (RuntimeException e){
            return e.getMessage();
        }
    }
    @PostMapping("/logout")
    public String logout(@RequestBody LogoutRequest logoutRequest){
        try {
            diaryService.logout(logoutRequest);
            return "User logout successfully";
        }catch (RuntimeException e){
            return e.getMessage();
        }
    }    @PostMapping("remove user")
    public String removeEntry(@RequestBody RemoveUserRequest request) {
        try {
            diaryService.RemoveUser(request);
            return "removed successfully";
        } catch (RuntimeException e) {
            return e.getMessage();
        }
    }
    @GetMapping("/getDiaries")
    public List<Diary> getAllDiaries(){
       return diaryService.getAllDiaries();
    }

    @PostMapping("/create")
    public String createEntry(@RequestBody CreateEntryRequest request) {
        try {
            entryServices.createEntry(request);
            return "Entry created successfully";
        } catch (RuntimeException e) {
            return e.getMessage();
        }
    }

    @PutMapping("update")
    public String updateEntry(@RequestBody UpdateEntryRequest request) {
        try {
            entryServices.updateEntryBy(request);
            return "Entry update successfully";
        } catch (RuntimeException e) {
            return e.getMessage();
        }
    }

    @PostMapping("delete")
    public String deleteEntry(@RequestBody UpdateEntryRequest request) {
        try {
            entryServices.deleteEntryBy(request);
            return "Entry deleted successfully";
        } catch (RuntimeException e) {
            return e.getMessage();
        }
    }
    @GetMapping
    public List<Entry> getEntries(@RequestParam String username){
        return entryServices.findAllEntry(username);
    }

}
