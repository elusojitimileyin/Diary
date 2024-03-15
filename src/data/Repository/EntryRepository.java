package data.Repository;

import data.model.Diary;
import data.model.Entry;

import java.util.List;

public interface EntryRepository {
    Entry save(Entry entry);
    List<Entry> findAll();

    Entry findById(int id);
    long count();
    void delete(int id);
    void delete(Entry entry);

}
