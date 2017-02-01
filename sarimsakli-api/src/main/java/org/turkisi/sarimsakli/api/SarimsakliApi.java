package org.turkisi.sarimsakli.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Gökalp Gürbüzer (gokalp.gurbuzer@yandex.com)
 */
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories
@SpringBootApplication
public class SarimsakliApi {

    public static void main(String[] args) {
        SpringApplication.run(SarimsakliApi.class, args);
    }
}
