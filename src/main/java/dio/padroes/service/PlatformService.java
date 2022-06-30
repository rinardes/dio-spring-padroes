package dio.padroes.service;

import dio.padroes.model.Game;
import dio.padroes.model.Platform;

public interface PlatformService {

    Iterable<Platform> findAll();
    Platform findById(String id);
    void insert(Platform platform);
    void update(String id, Platform platform);
}
