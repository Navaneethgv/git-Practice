package com.example;

public class Pencil implements Writer {
    @Override
    public void write() {
        System.out.println("Pencil used to write also");
    }
}
