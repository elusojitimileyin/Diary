//package DiaryServiceImpTest;
//
//import africa.semicolon.Diary.request.RegisterRequest;
//import africa.semicolon.Diary.Services.DiaryServiceImp;
//import africa.semicolon.Diary.Services.EntryServices;
//import africa.semicolon.Diary.Services.EntryServicesImp;
//import africa.semicolon.Diary.data.Repository.DiaryRepository;
//import africa.semicolon.Diary.data.Repository.DiaryRepositoryImp;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//public class DiaryServiceImpTest {
//
//    private DiaryServiceImp diaryService;
//    private DiaryRepository diaryRepository;
//
//    @BeforeEach
//    public void setUp() {
//        diaryRepository = new DiaryRepositoryImp();
//        EntryServices entryServices = new EntryServicesImp();
//        diaryService = new DiaryServiceImp(diaryRepository, entryServices);
//    }
//
//    @Test
//    public void testRegisterUser_Success() {
//
//        RegisterRequest registerRequest = new RegisterRequest();
//        registerRequest.setUsername("testUser");
//        registerRequest.setPassword("password");
//        diaryService.registerUser(registerRequest);
//        assertEquals(1, diaryService.getNumberOfUsers());
//    }
//
//    @Test
//    public void testRegisterUser_Failure_UsernameExists() {
//        RegisterRequest registerRequest = new RegisterRequest();
//        registerRequest.setUsername("existingUser");
//        registerRequest.setPassword("password1");
//        registerRequest.setUsername("existingUser");
//        registerRequest.setPassword("password2");
//        diaryService.registerUser(registerRequest);
//        diaryService.registerUser(registerRequest);
//        assertEquals(1, diaryService.getNumberOfUsers());
////        assertThrows()
//
//    }
//}