package dio.padroes.service.providers;

import dio.padroes.model.Platform;
import dio.padroes.model.PlatformRepository;
import dio.padroes.service.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlatformServiceProvider implements PlatformService {
    @Autowired
    PlatformRepository platformRepository;

    @Override
    public Iterable<Platform> findAll() {
        return platformRepository.findAll();
    }

    @Override
    public Platform findById(String id) {
        Optional<Platform> platform = platformRepository.findById(id);
        return platform.get();
    }

    @Override
    public void insert(Platform platform) {
        platformRepository.save(platform);
    }

    @Override
    public void update(String id, Platform platform) {
        Optional<Platform> platformId = platformRepository.findById(id);
        if(platformId.isPresent()){
            platformRepository.save(platform);
        }
    }
}
