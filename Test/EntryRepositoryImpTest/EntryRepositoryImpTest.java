//package EntryRepositoryImpTest;
//
//import africa.semicolon.Diary.data.Repository.EntryRepositoryImp;
//import africa.semicolon.Diary.data.model.Entry;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class EntryRepositoryImpTest {
//
//    private EntryRepositoryImp entryRepositoryImp;
//    @BeforeEach
//    void setUp() {
//        entryRepositoryImp = new EntryRepositoryImp();
//    }
//
//    @Test
//    void checkForEmptyEntry(){
//        Entry entry =new Entry();
//        assertEquals(0,entryRepositoryImp.count());
//    }
//
//    @Test
//    void checkThatEntryIsOccupied(){
//        Entry entry =new Entry();
//        entryRepositoryImp.save(entry);
//        assertEquals(1,entryRepositoryImp.count());
//    }
//    @Test
//    void checkThatEntryIsOccupied_EnterMoreThanOneEntry(){
//        Entry entry =new Entry();
//        Entry entry1 =new Entry();
//        Entry entry2 =new Entry();
//        entryRepositoryImp.save(entry);
//        entryRepositoryImp.save(entry1);
//        entryRepositoryImp.save(entry2);
//        assertEquals(3,entryRepositoryImp.count());
// }
//    @Test
//    void checkThatEntryIsOccupied_EnterMoreThanOneEntry_DeleteEntry(){
//        Entry entry =new Entry();
//        Entry entry1 =new Entry();
//        Entry entry2 =new Entry();
//        entryRepositoryImp.save(entry);
//        entryRepositoryImp.save(entry1);
//        entryRepositoryImp.save(entry2);
//        assertEquals(3,entryRepositoryImp.count());
//        entryRepositoryImp.delete(entry1);
//        assertEquals(2, entryRepositoryImp.count());
//    }
//
//    @Test
//    void checkThatEntryIsOccupied_EnterMoreThanOneEntry_DeleteEntry_findEntry(){
//        Entry entry =new Entry();
//        Entry entry1 =new Entry();
//        Entry entry2 =new Entry();
//        entryRepositoryImp.save(entry);
//        entryRepositoryImp.save(entry1);
//        entryRepositoryImp.save(entry2);
//        assertEquals(3,entryRepositoryImp.count());
//        entryRepositoryImp.delete(entry1);
//        assertEquals(2, entryRepositoryImp.count());
//        entryRepositoryImp.findById(3);
//        assertEquals(entry2,entryRepositoryImp.findById(3));
//    }
//    @Test
//    void checkThatEntryIsOccupied_EnterMoreThanOneEntry_DeleteEntry_findAll(){
//        Entry entry =new Entry();
//        Entry entry1 =new Entry();
//        Entry entry2 =new Entry();
//        entryRepositoryImp.save(entry);
//        entryRepositoryImp.save(entry1);
//        entryRepositoryImp.save(entry2);
//        assertEquals(3,entryRepositoryImp.count());
//        entryRepositoryImp.delete(entry1);
//        assertEquals(2, entryRepositoryImp.count());
//        entryRepositoryImp.findAll();
//        assertEquals(2,entryRepositoryImp.count());
//    }
//    @Test
//    void checkThatEntryIsOccupied_EnterMoreThanOneEntry_DeleteEntry_findAll_Update(){
//        Entry entry =new Entry();
//        Entry entry1 =new Entry();
//        Entry entry2 =new Entry();
//        entryRepositoryImp.save(entry);
//        entryRepositoryImp.save(entry1);
//        entryRepositoryImp.save(entry2);
//        assertEquals(3,entryRepositoryImp.count());
//        entryRepositoryImp.delete(entry1);
//        assertEquals(2, entryRepositoryImp.count());
//        entryRepositoryImp.findAll();
//        assertEquals(2,entryRepositoryImp.count());
//        Entry entry4 =new Entry();
//        entryRepositoryImp.save(entry4);
//        assertEquals(3,entryRepositoryImp.count());
//    }
//
//}