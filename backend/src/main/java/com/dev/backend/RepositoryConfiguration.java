package com.dev.backend;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.dev.backend.models"})
@EnableJpaRepositories(basePackages = {"com.dev.backend.dao"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
