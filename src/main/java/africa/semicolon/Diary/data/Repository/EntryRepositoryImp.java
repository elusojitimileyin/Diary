//package africa.semicolon.Diary.data.Repository;
//
//import africa.semicolon.Diary.data.model.Entry;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class EntryRepositoryImp implements EntryRepository {
//
//    List<Entry> entries = new ArrayList<>();
//    @Override
//    public Entry save(Entry entry) {
//        if (isNew(entry)) saveNew(entry);
//        else newUpdate(entry);
//        return entry;
//    }
//
//    private void newUpdate(Entry entry) {
//        Entry foundEntry = findById(entry.getId());
//        entries.remove(foundEntry);
//        entries.add(entry);
//
//        entry.setDateCreated(foundEntry.getDateCreated());
//
//    }
//
//    private void saveNew(Entry entry) {
//        entry.setId(entries.size() + 1 );
//        entries.add(entry);
//    }
//
//    private boolean isNew(Entry entry) {
//        return entry.getId() == 0;
//    }
//
//    @Override
//    public List<Entry> findAll() {
//        return entries;
//    }
//
//    @Override
//    public Entry findById(int id) {
//        for (Entry entry:entries)
//            if (entry.getId() == id)
//                return entry;
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return entries.size();
//    }
//
//    @Override
//    public void delete(int id) {
//        entries.removeIf(entry -> entry.getId() == id);
//    }
//
//    @Override
//    public void delete(Entry entry) {
//        entries.remove(entry);
//    }
//}
