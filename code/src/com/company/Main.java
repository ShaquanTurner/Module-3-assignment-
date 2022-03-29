package com.company;
import  java.time.format.DateTimeFormatter;
import  java.time.LocalDateTime;

import java.io.*;
import java.io.File;
import  java.io.FileWriter;

import java.io.IOException;

public class Main {


    public static void main(String[] args) {

        StringBuilder contents = new StringBuilder();
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("paystub.txt ", true))){
            writer.write("\n\tPayment Amount is : $2500.00"+"\n\t First name is Joe "+"\n\tLast name is robinson");

        } catch (IOException e) {
            System.out.println("Error occurred writing to file.");
            e.printStackTrace();
        }
        try(BufferedReader reader = new BufferedReader(new FileReader("paystub.txt "))){
            String currentLine;
            while ((currentLine = reader.readLine()) != null){
                contents.append(currentLine).append("\n\t First name is Joe "+"\n\tLast name is robinson");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(contents);



    }
}
