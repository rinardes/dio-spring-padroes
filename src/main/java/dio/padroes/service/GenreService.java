package dio.padroes.service;

import dio.padroes.model.Game;
import dio.padroes.model.Genre;

public interface GenreService {

    Iterable<Genre> findAll();
    Genre findById(String id);
    void insert(Genre genre);
    void update(String id,Genre genre);
}
