package lab;

import lab.model.BuddyInfo;
import lab.repositories.BuddyInfoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class Lab {
    public static void main(String[] args) {
        SpringApplication app =  new SpringApplication(Lab.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8081"));
        app.run(args);
    }

    @Bean
    public CommandLineRunner demo(BuddyInfoRepository repository) {
        return (args) -> {
            // save a few customers
            repository.save(new BuddyInfo("Jack", "address", "1234643"));
            repository.save(new BuddyInfo("Chloe", "O'Brian", "246346"));
            repository.save(new BuddyInfo("Kim", "Bauer", "234643776"));
            repository.save(new BuddyInfo("David", "Palmer", "num3474ber"));
            repository.save(new BuddyInfo("Michelle", "Dessler", "347367"));
        };
    }
}