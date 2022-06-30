package dio.padroes.controller;

import dio.padroes.model.Game;
import dio.padroes.service.providers.GameServicesProvider;
import dio.padroes.service.providers.GenreServiceProvider;
import dio.padroes.service.providers.PlatformServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("games")
public class GameRestController {

    @Autowired
    GameServicesProvider gameServicesProvider;

    @GetMapping
    public ResponseEntity<Iterable<Game>> getGame(){
        return ResponseEntity.ok(gameServicesProvider.findAll());
    }

    @PostMapping
    public ResponseEntity<String> insertGame(@RequestBody Game jogo){
        gameServicesProvider.insert(jogo);
        return ResponseEntity.ok("Jogo inserido com sucesso");
    }
}
