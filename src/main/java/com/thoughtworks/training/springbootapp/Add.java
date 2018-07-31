package com.thoughtworks.training.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Profile("add")
public class Add implements Processor {
    @Override
    public List<Integer> process(List<Integer> list) {
        return list.stream().map(item -> item + 2).collect(Collectors.toList());
    }
}
