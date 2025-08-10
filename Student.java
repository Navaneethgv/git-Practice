package com.example;

public class Student {

   private Writer writer;
//
//    public Writer getWriter() {
//        return writer;
//    }
//
//    public void setWriter(Writer writer) {
//        this.writer = writer;
//    }
//
//    private int age;
//
//    public int getRno() {
//        return rno;
//    }
//
//    public void setRno(int rno) {
//        this.rno = rno;
//    }
//
//    private int rno;
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        if(age<0){
//            age=0;
//        }else{
//            System.out.println("Spring framework is calling the setter method");
//            this.age = age;
//        }
//    }
//
//    public void show(){
//        System.out.println("In show method");
//    }
//    private Pen pen;
//
//    public Pen getPen() {
//        return pen;
//    }
//
//    public void setPen(Pen pen) {
//        this.pen = pen;
//    }
//
   public void writeExam() {
       writer.write();
   }
    private int age;
    private int rno;
    private Writer write;

    public Student(int age,int rno,Writer writer) {
        System.out.println("Para constructor called...");
        this.age=age;
        this.rno=rno;
        this.writer=writer;
    }
}

