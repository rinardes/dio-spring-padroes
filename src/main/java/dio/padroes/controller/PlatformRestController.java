package dio.padroes.controller;

import dio.padroes.model.Platform;
import dio.padroes.service.PlatformService;
import dio.padroes.service.providers.PlatformServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("platforms")
public class PlatformRestController {

    @Autowired
    PlatformServiceProvider platformServiceProvider;

    @PostMapping("/{platform}")
    ResponseEntity<String> insertPlatform(@RequestBody Platform platform){
        platformServiceProvider.insert(platform);
        return ResponseEntity.ok("Plataforma inserida com sucesso");
    }
}
