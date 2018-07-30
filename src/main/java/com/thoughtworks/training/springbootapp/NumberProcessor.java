package com.thoughtworks.training.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NumberProcessor implements Processor{

    private List<Processor> processers;
    @Autowired
    NumberProcessor(List<Processor> processers){
        this.processers=processers;
    }
    @Override
    public List<Integer> process(List<Integer> list) {
        for(Processor processer:processers){
            list = processer.process(list);
        }
        return list;
    }
}
