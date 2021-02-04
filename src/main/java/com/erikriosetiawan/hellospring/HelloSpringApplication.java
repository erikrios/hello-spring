package com.erikriosetiawan.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloSpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(HelloSpringApplication.class, args);
        int[] numbers = new int[]{3, 5, 9};
        int findNumber = 9;
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        int result = binarySearch.binarySearch(numbers, findNumber);
        System.out.println(result);
    }
}
