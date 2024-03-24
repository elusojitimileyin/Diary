package africa.semicolon.Diary.data.Repository;

import africa.semicolon.Diary.data.model.Diary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DiaryRepository extends MongoRepository<Diary,String> {
    Optional<Diary> findByUsername(String username);

//    Diary save(Diary diary);
//    List<Diary> findAll();
//
//    Diary findById(String username);
//    long count();
//    void delete(String username);
//    void delete(Diary diary);

}