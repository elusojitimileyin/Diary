package DiaryRepositoryImpTest;

import data.Repository.DiaryRepositoryImp;
import data.Repository.EntryRepositoryImp;
import data.model.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryRepositoryImpTest {

    private DiaryRepositoryImp myDiaryRepositoryImp;
    @BeforeEach
    void setUp() {
        myDiaryRepositoryImp = new DiaryRepositoryImp();
    }

    @Test
    public void checkForEmptyDiary(){
        Diary diary =new Diary();
        assertEquals(0,myDiaryRepositoryImp.count());

    }
    @Test
    public void checkThatDiaryIsOccupied(){
        Diary diary =new Diary();
        myDiaryRepositoryImp.save(diary);
        assertEquals(1,myDiaryRepositoryImp.count());

    }
    @Test
    public void checkThatDiaryIsOccupied_saveMoreThanOneDiary(){
        Diary diary =new Diary();
        myDiaryRepositoryImp.save(diary);
        myDiaryRepositoryImp.save(diary);
        assertEquals(2,myDiaryRepositoryImp.count());

    }
    @Test
    public void checkThatDiaryIsOccupied_saveMoreThanOneDiary_deleteDiary(){
        Diary diary =new Diary();
        myDiaryRepositoryImp.save(diary);

        myDiaryRepositoryImp.save(diary);
        myDiaryRepositoryImp.save(diary);
        assertEquals(3,myDiaryRepositoryImp.count());
        myDiaryRepositoryImp.delete("eee");


    }
}
