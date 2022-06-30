package dio.padroes.service.providers;

import dio.padroes.model.Game;
import dio.padroes.model.GameRepository;
import dio.padroes.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GameServicesProvider implements GameService {

    @Autowired
    GameRepository gameRepository;

    @Override
    public Iterable<Game> findAll() {
        return gameRepository.findAll();
    }

    @Override
    public Game findById(long id) {
        Optional<Game> game = gameRepository.findById(id);
        return game.get();
    }

    @Override
    public Game findByGenre(String genre) {
        return null;
    }

    @Override
    public Game findByPlatform(String platform) {
        return null;
    }

    @Override
    public void insert(Game game) {
        gameRepository.save(game);
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void update(long id, Game game) {
        Optional<Game> gameId = gameRepository.findById(id);
        if(gameId.isPresent()){
            gameRepository.save(game);
        }
    }
}
