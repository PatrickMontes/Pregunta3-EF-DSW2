package pe.edu.cibertec.dswii_efcache_patrickmontesdeocaromero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DswiiEfCachePatrickMontesDeOcaRomeroApplication {

    public static void main(String[] args) {
        SpringApplication.run(DswiiEfCachePatrickMontesDeOcaRomeroApplication.class, args);
    }

}
