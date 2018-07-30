package com.thoughtworks.training.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.processing.Processor;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Add implements Processor {
    @Autowired
//    Add(@Value("${processor.add}")){ }
    @Override
    public List<Integer> process(List<Integer> list) {
        return list.stream().map(item->item+2).collect(Collectors.toList());
    }
}
