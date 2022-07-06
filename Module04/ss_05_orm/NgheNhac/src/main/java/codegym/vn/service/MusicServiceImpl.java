package codegym.vn.service;

import codegym.vn.entity.Music;
import codegym.vn.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MusicServiceImpl  implements MusicService{

    private MusicRepository musicRepository ;
    @Autowired
    public  MusicServiceImpl (MusicRepository musicRepository){
        this.musicRepository = musicRepository;
    }

    @Override
    public void create(Music music) {
        musicRepository.create(music);
    }

    @Override
    public void update(Music music) {
        musicRepository.update(music);
    }

    @Override
    public void delete(String id) {
        musicRepository.delete(id);

    }

    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public Music findById(String id) {
        return musicRepository.findById(id);
    }
}
