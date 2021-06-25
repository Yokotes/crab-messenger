package com.crab.backend;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class AppConfig {

    public @Bean
    MongoClient getMongoClient() {
        return MongoClients.create("");
    }

    public @Bean
    MongoTemplate getMongoTemplate() {
        return new MongoTemplate(getMongoClient(), "");
    }
}
