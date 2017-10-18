package br.com.ferreiracosta.pedidofcweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by trinity on 16/10/2017.
 */
@SpringBootApplication
public class Initializer extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Initializer.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Initializer.class);
    }
}
