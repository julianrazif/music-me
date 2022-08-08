package julian.razif.figaro.music.me.artists_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.EnableWebFlux;

import java.util.TimeZone;

@EnableWebFlux
@SpringBootApplication
public class ArtistsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtistsServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return args -> {
            TimeZone.setDefault(TimeZone.getTimeZone("Asia/Bangkok"));
        };
    }
}
