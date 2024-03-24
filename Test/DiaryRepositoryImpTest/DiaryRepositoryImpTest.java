//package DiaryRepositoryImpTest;
//
//import africa.semicolon.Diary.data.Repository.DiaryRepositoryImp;
//import africa.semicolon.Diary.data.model.Diary;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class DiaryRepositoryImpTest {
//
//    private DiaryRepositoryImp myDiaryRepositoryImp;
//    @BeforeEach
//    void setUp() {
//        myDiaryRepositoryImp = new DiaryRepositoryImp();
//    }
//
//    @Test
//    public void checkForEmptyDiary(){
//        Diary diary =new Diary();
//        assertEquals(0,myDiaryRepositoryImp.count());
//
//    }
//    @Test
//    public void checkThatDiaryIsOccupied(){
//        Diary diary =new Diary();
//        myDiaryRepositoryImp.save(diary);
//        assertEquals(1,myDiaryRepositoryImp.count());
//
//    }
//    @Test
//    public void checkThatDiaryIsOccupied_saveMoreThanOneDiary(){
//        Diary diary =new Diary();
//        myDiaryRepositoryImp.save(diary);
//        myDiaryRepositoryImp.save(diary);
//        assertEquals(2,myDiaryRepositoryImp.count());
//
//    }
//    @Test
//    public void checkThatDiaryIsOccupied_saveMoreThanOneDiary_deleteDiary(){
//        Diary diary =new Diary();
//        Diary diary1 =new Diary();
//        Diary diary2 =new Diary();
//        myDiaryRepositoryImp.save(diary);
//        myDiaryRepositoryImp.save(diary1);
//        myDiaryRepositoryImp.save(diary2);
//        assertEquals(3,myDiaryRepositoryImp.count());
//        myDiaryRepositoryImp.delete(diary1);
//        assertEquals(2,myDiaryRepositoryImp.count());
//
//
//    }
//    @Test
//    public void checkThatDiaryIsOccupied_saveMoreThanOneDiary_deleteDiary_findAll(){
//        Diary diary =new Diary();
//        Diary diary1 =new Diary();
//        Diary diary2 =new Diary();
//        myDiaryRepositoryImp.save(diary);
//        myDiaryRepositoryImp.save(diary1);
//        myDiaryRepositoryImp.save(diary2);
//        assertEquals(3,myDiaryRepositoryImp.count());
//        myDiaryRepositoryImp.delete(diary1);
//        assertEquals(2,myDiaryRepositoryImp.count());
//        myDiaryRepositoryImp.findAll();
//        assertEquals(2, myDiaryRepositoryImp.count());
//
//
//    }
//    @Test
//    public void checkThatDiaryIsOccupied_saveMoreThanOneDiary_deleteDiary_findAll_updateDiary(){
//        Diary diary =new Diary();
//        Diary diary1 =new Diary();
//        Diary diary2 =new Diary();
//        myDiaryRepositoryImp.save(diary);
//        myDiaryRepositoryImp.save(diary1);
//        myDiaryRepositoryImp.save(diary2);
//        assertEquals(3,myDiaryRepositoryImp.count());
//        myDiaryRepositoryImp.delete(diary1);
//        assertEquals(2,myDiaryRepositoryImp.count());
//        myDiaryRepositoryImp.findAll();
//        assertEquals(2, myDiaryRepositoryImp.count());
//        Diary diary3 =new Diary();
//        myDiaryRepositoryImp.save(diary3);
//        assertEquals(3, myDiaryRepositoryImp.count());
//
//
//    }
//}
