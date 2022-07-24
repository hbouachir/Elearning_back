package com.ines.elearning;

import com.ines.elearning.Entity.Role;
import com.ines.elearning.Entity.User;
import com.ines.elearning.Repository.UserRepository;
import com.ines.elearning.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ElearningApplication {

    private static final Logger log = LoggerFactory.getLogger(ElearningApplication.class);

    public static void main(String[] args) {



        SpringApplication.run(ElearningApplication.class, args);



    }


    @Bean
    public CommandLineRunner demo(UserRepository repository) {
        return (args) -> {
            User u = new User();
            u.setAge(32);
            u.setFirstName("hamza");
            u.setEmail("bouachirhamza@gmail.com");
            u.setLastName("Bouachir");
            u.setPassword("123456789");
            u.setPasswordConfirm("123456789");
            u.setTel("123456789");
            u.setRole(Role.ENSEIGNANT);

            // save a few customers
            repository.save(u);


            // fetch all customers

            log.info("-------------------------------");

            log.info("User added");
        };

        };
}
