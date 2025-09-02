package org.example.JavaConcept.DesignPattern.CreationalDesignPattern.BuilderPattern;

public class Runner {

    public static void main(String[] args) {
        Email email = new Email.Builder("rajesh@gmail.com", "abc@gmail.com")
                .cc("xyz@gmail.com")
                .subject("This is builder design pattern i want to explore the world. Late is never")
                .build();

        System.out.println("Email  object ===");
        System.out.println(email.toString());
    }
}
