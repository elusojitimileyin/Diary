package EntryRepositoryImpTest;

import data.Repository.EntryRepositoryImp;
import data.model.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryRepositoryImpTest {

    private EntryRepositoryImp entryRepositoryImp;
    @BeforeEach
    void setUp() {
        entryRepositoryImp = new EntryRepositoryImp();
    }

    @Test
    void checkForEmptyEntry(){
        Entry entry =new Entry();
        entryRepositoryImp.save(entry);
        assertEquals(0,entryRepositoryImp.count());
    }
}