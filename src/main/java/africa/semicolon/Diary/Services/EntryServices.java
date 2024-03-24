package africa.semicolon.Diary.Services;

import africa.semicolon.Diary.data.model.Entry;
import africa.semicolon.Diary.request.CreateEntryRequest;
import java.util.List;

public interface EntryServices {

    void createEntry(CreateEntryRequest request);

    void deleteEntry(Entry entry);

    List<Entry>findAllEntry();


    void save(Entry entry);
}
