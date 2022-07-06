package codegym.vn.repository;

import codegym.vn.entity.Music;

import java.util.List;

public interface MusicRepository {

    void create(Music music);
    void update(Music music);
    void delete(String id);
    List<Music> findAll();
    Music findById(String id);
}
