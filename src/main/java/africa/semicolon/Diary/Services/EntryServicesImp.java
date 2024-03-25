package africa.semicolon.Diary.Services;

import africa.semicolon.Diary.data.Repository.EntryRepository;
import africa.semicolon.Diary.data.model.Diary;
import africa.semicolon.Diary.data.model.Entry;
import africa.semicolon.Diary.request.CreateEntryRequest;
import africa.semicolon.Diary.request.UpdateEntryRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class EntryServicesImp implements EntryServices {
    @Autowired
    private DiaryService diaryService;

    @Autowired
    private EntryRepository entryRepository;


    @Override
    public void createEntry(CreateEntryRequest request) {
        Diary diary = diaryService.findDiaryBy(request.getUsername().toLowerCase());
        if (diary != null) {
            Entry entry = new Entry();
            entry.setTitle(request.getTitle());
            entry.setBody(request.getBody());
            entry.setUsername(request.getUsername().toLowerCase());
            entry.setDateCreated(LocalDateTime.now());
            entryRepository.save(entry);
        } else {
            throw new IllegalArgumentException("Entry creation failed");
        }
    }


    @Override
    public List<Entry> findAllEntry(String username) {
        return entryRepository.findByAuthor(username);
    }

    @Override
    public void updateEntryBy(UpdateEntryRequest request) {
        Optional<Entry> foundEntry = entryRepository.findById(request.getId());
        if (foundEntry.isPresent()) {
            Entry entry = foundEntry.get();
            entry.setTitle(request.getTitle());
            entry.setBody(request.getBody());
            entry.setAuthor(request.getAuthor());

            entry.setDateCreated(request.getDateCreated);

            entryRepository.save(entry);
        } else {
            throw new IllegalArgumentException("Entry not found");
        }

    }

    @Override
    public void deleteEntryBy(UpdateEntryRequest request) {
        Optional<Entry> foundEntry = entryRepository.findById(request.getId());
        if (foundEntry.isPresent()) {
            Entry entry = foundEntry.get();
            entry.setTitle(request.getTitle());
            entry.setDeleted(true);
            entryRepository.save(entry);
        } else {
            throw new IllegalArgumentException("Entry not found");
        }

    }



}
