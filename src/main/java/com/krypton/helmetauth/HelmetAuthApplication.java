package com.krypton.helmetauth;

import com.krypton.helmetauth.dao.RoleRepository;
import com.krypton.helmetauth.domain.models.ERole;
import com.krypton.helmetauth.domain.models.Role;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class HelmetAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelmetAuthApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(RoleRepository roleRepository) {
        return args -> {


            roleRepository.saveAll(
                    List.of(
                            new Role(ERole.ROLE_USER),
                            new Role(ERole.ROLE_ADMIN),
                            new Role(ERole.ROLE_MODERATOR)
                    )
            );
        };
    }

}
