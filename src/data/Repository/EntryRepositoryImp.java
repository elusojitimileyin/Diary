package data.Repository;

import data.model.Entry;

import java.util.ArrayList;
import java.util.List;

public class EntryRepositoryImp implements EntryRepository {

    List<Entry> entries = new ArrayList<>();
    @Override
    public Entry save(Entry entry) {
        if (isNew(entry)) saveNew(entry);
        else newUpdate(entry);
        return entry;
    }

    private void newUpdate(Entry entry) {
    }

    private void saveNew(Entry entry) {
    }

    private boolean isNew(Entry entry) {
        return entry;
    }

    @Override
    public List<Entry> findAll() {
        return null;
    }

    @Override
    public Entry findById(int id) {
        for (Entry entry:entries)
            if (entry.getId() == id)
                return entry;
        return null;
    }

    @Override
    public long count() {
        return entries.size();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void delete(Entry entry) {

    }
}
