package com.neotechlabs.librarymgmtservice.config;

import com.neotechlabs.librarymgmtservice.document.Books;
import com.neotechlabs.librarymgmtservice.repository.BooksRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = BooksRepository.class)
@Configuration
public class LibraryDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(BooksRepository booksRepository) {
        return strings -> {
            booksRepository.save(new Books(1, "One Up on Wall Street", "Peter Lynch", "Simon & Schuster", 9780743200400L));
            booksRepository.save(new Books(2, "The Intelligent Investor", "Benjamin Graham", "Harper Business", 9780062312686L));
        };
    }
}
