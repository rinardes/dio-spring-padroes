package dio.padroes.controller;

import dio.padroes.model.Genre;
import dio.padroes.service.providers.GenreServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("genres")
public class GenreRestController {

    @Autowired
    GenreServiceProvider genreServiceProvider;

    @PostMapping("/{genre}")
    ResponseEntity<Genre> insertGenre(@RequestBody Genre genre){
        genreServiceProvider.insert(genre);
        return ResponseEntity.ok(genreServiceProvider.findById(genre.getName()));
    }

}
