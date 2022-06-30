package dio.padroes.service.providers;

import dio.padroes.model.Genre;
import dio.padroes.model.GenreRepository;
import dio.padroes.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GenreServiceProvider implements GenreService {
    @Autowired
    GenreRepository genreRepository;

    @Override
    public Iterable<Genre> findAll() {
        genreRepository.findAll();
        return null;
    }

    @Override
    public Genre findById(String id) {
        Optional<Genre> genre = genreRepository.findById(id);
        return genre.get();
    }

    @Override
    public void insert(Genre genre) {
        genreRepository.save(genre);
    }

    @Override
    public void update(String id, Genre genre) {
        Optional<Genre> genreId = genreRepository.findById(id);
        if(genreId.isPresent()){
            genreRepository.save(genre);
        }
    }
}
