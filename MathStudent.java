package com.example;

import org.springframework.stereotype.Component;

@Component
public class MathStudent implements Maanavan{
    @Override
    public int getStudentsCount() {
        return 7;
    }
}
