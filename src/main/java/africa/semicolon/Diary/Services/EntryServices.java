package africa.semicolon.Diary.Services;

import africa.semicolon.Diary.data.model.Entry;
import africa.semicolon.Diary.Dtos.request.CreateEntryRequest;
import africa.semicolon.Diary.Dtos.request.UpdateEntryRequest;

import java.util.List;

public interface EntryServices {

    void createEntry(CreateEntryRequest request);


    List<Entry> findAllEntry(String username);


    void deleteEntryBy(UpdateEntryRequest request);

    void updateEntryBy(UpdateEntryRequest request);
}
