package com.thoughtworks.training.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Component
public class SpringBootApp implements ApplicationRunner {
    private NumberProcessor numberProcessor;
    @Autowired
    public SpringBootApp(NumberProcessor numberProcessor){
        this.numberProcessor=numberProcessor;
    }
    @Override
    public void run(ApplicationArguments args){
        List<Integer> list = Arrays.asList(new Scanner(System.in)
                .nextLine().split(" ")).stream()
                .map(Integer::valueOf).collect(Collectors.toList());

        System.out.println(numberProcessor.process(list));
    }
}
