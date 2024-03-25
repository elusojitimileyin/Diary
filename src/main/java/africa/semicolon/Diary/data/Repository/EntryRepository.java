package africa.semicolon.Diary.data.Repository;

import africa.semicolon.Diary.data.model.Entry;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EntryRepository extends MongoRepository<Entry, String> {
    List<Entry> findByAuthor(String username);
//    Entry save(Entry entry);
//    List<Entry> findAll();
//
//    Entry findById(int id);
//    long count();
//    void delete(int id);
//    void delete(Entry entry);

}
