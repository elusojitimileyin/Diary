//package africa.semicolon.Diary.data.Repository;
//
//import africa.semicolon.Diary.data.model.Diary;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class DiaryRepositoryImp implements DiaryRepository {
//
//        private static int numberOfDiaries;
//        List<Diary> diaries = new ArrayList<>();
//
//        @Override
//        public Diary save(Diary diary) {
//                numberOfDiaries++;
//                diaries.add(diary);
//                return diary;
//        }
//
//        @Override
//        public List<Diary> findAll() { return diaries;
//        }
//
//        @Override
//        public Diary findById(String username) {
//                for (Diary diary : diaries) {
//                        if (diary.getUsername().equals(username)) {
//                                return diary;
//                        }
//                }
//            return null;
//        }
//        @Override
//        public long count() {
//                return (long) diaries.size();
//        }
//
//        @Override
//        public void delete(String username) {
//                diaries.removeIf(diary -> diary.getUsername().equals(username));
//
//        }
//
//        @Override
//        public void delete(Diary diary) {
//                diaries.remove(diary);
//        }
//}
