package org.example.JavaConcept.FileSystem;

import java.io.File;
import java.io.FileWriter;
import java.io.Reader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            File file = new File("myText.txt");
            if(file.createNewFile()) {
                System.out.println("File created!!");
            } else{
                System.out.println("File already exist!!");
            }

            System.out.println("File absolute path ===>" + file.getAbsolutePath());

            // start writing something in file
            FileWriter fileWriter = new FileWriter("myText.txt");
            fileWriter.write("This is Rk Singh who is trying to add text in this file 1. ");
            fileWriter.append("This is Rk Singh who is trying to add text in this file. ");
            fileWriter.append("\n This is newline one. ");
            fileWriter.append("\n This is newline two. ");
            fileWriter.append("\n This is newline three. ");
            fileWriter.append("\n This is newline four. ");
            fileWriter.flush();

            System.out.println("Successfully written in file");

            System.out.println("---Trying to read the data from file----");

            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
