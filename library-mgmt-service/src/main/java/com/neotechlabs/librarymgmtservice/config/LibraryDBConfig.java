package com.neotechlabs.librarymgmtservice.config;

import com.neotechlabs.librarymgmtservice.document.Book;
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
        booksRepository.deleteAll();
        return strings -> {
            booksRepository.save(new Book(1, "The Intelligent Investor", "Benjamin Graham", "Harper Business", "0062312685", 9780062312686L));
            booksRepository.save(new Book(2, "Learn to Earn: A Beginner's Guide to the Basics of Investing and Business", "Peter Lynch", "Simon & Schuster", "0684811634", 9780684811635L));
            booksRepository.save(new Book(3, "One Up on Wall Street", "Peter Lynch", "Simon & Schuster", "0743200403", 9780743200400L));
        };
    }
}
