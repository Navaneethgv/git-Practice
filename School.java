package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.example")
public class School {
    private final Maanavan maanavan;

    @Autowired
    public School(Maanavan maanavan) {
        this.maanavan = maanavan;
    }

    public void DisplayStudentCount() {
        int count=maanavan.getStudentsCount();
            System.out.println(count);
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(School.class);
        context.refresh();
        School school=context.getBean(School.class);
        school.DisplayStudentCount();
    }
    }
