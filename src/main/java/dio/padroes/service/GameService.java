package dio.padroes.service;

import dio.padroes.model.Game;

public interface GameService {

    Iterable<Game> findAll();
    Game findById(long id);
    Game findByGenre(String genre);
    Game findByPlatform(String platform);
    void insert(Game game);
    void delete(long id);
    void update(long id, Game game);
}
