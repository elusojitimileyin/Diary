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
        myDiaryRepositoryImp.save(diary);
        assertEquals(1L,myDiaryRepositoryImp.count());

    }

}
