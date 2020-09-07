package com.stocker;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;

@SpringBootApplication
@EnableReactiveElasticsearchRepositories
@RequiredArgsConstructor
public class StockerApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockerApplication.class, args);
    }
}
