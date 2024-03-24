package africa.semicolon.Diary.Services;

import africa.semicolon.Diary.data.Repository.EntryRepository;
import africa.semicolon.Diary.data.model.Entry;
import africa.semicolon.Diary.request.CreateEntryRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryServicesImp implements EntryServices {

    @Autowired
    private EntryRepository entryRepository;


    @Override
    public void createEntry(CreateEntryRequest request) {
        if (validateEntryCreation(request)) {
            Entry entry = new Entry();
            entry.setTitle(request.getTitle());
            entry.setBody(request.getBody());
            entry.setAuthor(request.getAuthor());

            entryRepository.save(entry);
        } else {
            throw new IllegalArgumentException("Entry creation failed");
        }
    }

    private boolean validateEntryCreation(CreateEntryRequest request) {
        return request != null &&
                request.getTitle() != null && !request.getTitle().isEmpty() &&
                request.getBody() != null && !request.getBody().isEmpty() &&
                request.getAuthor() != null && !request.getAuthor().isEmpty();
    }

    @Override
    public void deleteEntry(Entry entry) {
        entryRepository.delete(entry);
    }

    @Override
    public List<Entry> findAllEntry() {
        return entryRepository.findAll();
    }

    @Override
    public void save(Entry entry) {
        entryRepository.save(entry);
    }
}
