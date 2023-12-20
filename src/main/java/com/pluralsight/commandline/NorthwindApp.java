package com.pluralsight.commandline;

import com.pluralsight.service.CategoryService;
import org.springframework.boot.CommandLineRunner;

public class NorthwindApp implements CommandLineRunner {

    private final CategoryService categoryService;

    public NorthwindApp(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
