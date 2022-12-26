package com.teamproject.petapet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@EnableJpaAuditing
@EnableScheduling
@SpringBootApplication
public class TeamPetApetApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamPetApetApplication.class, args);
    }

    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter(){return new HiddenHttpMethodFilter();}

}
