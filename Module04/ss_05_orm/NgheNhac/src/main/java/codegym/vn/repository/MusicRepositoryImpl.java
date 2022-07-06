package codegym.vn.repository;

import codegym.vn.entity.Music;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class MusicRepositoryImpl implements  MusicRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Modifying
    public void create(Music music) {
        entityManager.persist(music);
    }

    @Override
    @Modifying
    public void update(Music music) {
        entityManager.merge(music);
    }

    @Override
    @Modifying
    public void delete(String id) {

        entityManager.remove( findById(id));
    }

    @Override
    public List<Music> findAll() {
        List<Music> musicList = entityManager
                .createQuery("select p from  Music p ")
                .getResultList();

        return  musicList;
    }

    @Override
    public Music findById(String id) {
        return  entityManager.find(Music.class, id);
    }
}
