//package africa.semicolon.Diary.Controller;
//
//import africa.semicolon.Diary.Services.EntryServices;
//import africa.semicolon.Diary.data.model.Entry;
//import africa.semicolon.Diary.request.CreateEntryRequest;
//import africa.semicolon.Diary.request.RemoveUserRequest;
//import africa.semicolon.Diary.request.UpdateEntryRequest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("api/v1/entry")
//public class EntryController {
//
//    @Autowired
//    private EntryServices entryServices;
//    @PostMapping("/create")
//    public String createEntry(@RequestBody CreateEntryRequest request) {
//        try {
//            entryServices.createEntry(request);
//            return "Entry created successfully";
//        } catch (RuntimeException e) {
//            return e.getMessage();
//        }
//    }
//
//    @PutMapping("update")
//    public String updateEntry(@RequestBody UpdateEntryRequest request) {
//        try {
//            entryServices.updateEntryBy(request);
//            return "Entry update successfully";
//        } catch (RuntimeException e) {
//            return e.getMessage();
//        }
//    }
//
//    @PostMapping("delete")
//    public String deleteEntry(@RequestBody UpdateEntryRequest request) {
//        try {
//            entryServices.deleteEntryBy(request);
//            return "Entry deleted successfully";
//        } catch (RuntimeException e) {
//            return e.getMessage();
//        }
//    }
//    @GetMapping
//    public List<Entry> getEntries(@RequestParam String username){
//        return entryServices.findAllEntry(username);
//    }
//
//}
