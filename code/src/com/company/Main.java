package com.company;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import  java.time.format.DateTimeFormatter;
import  java.time.LocalDateTime;

import java.io.*;
import java.io.File;
import  java.io.FileWriter;

import java.io.IOException;
import java.util.Date;

//Shaquan Turner 1817001436 //Chevon McIntosh 2017001610 //Jahvaughn Binns 2017001833
public class Main {



    public static void main(String[] args) {
        Employee empw = new Employee();
        empw.setFirstName(empw.firstName);
        empw.setLastName(empw.lastName);
        DecimalFormat df = new DecimalFormat("0.0");
        Date date= new  Date();

        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyy");
        String strDate  =formatter.format(date);





        StringBuilder contents = new StringBuilder();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("paystub.txt ", true))) {
            String firstname = empw.getFirstName();
            String lastname = empw.getLastName();
            double pay_amount =empw.getPaymentAmount();

            //writer.write("\n\t First name is Joe "+"\n\tLast name is Robinson");

            writer.write("\n\tfirst name is " + firstname);
            writer.newLine();

            writer.write("\n\tlast name is " + lastname);
            writer.newLine();
            writer.write("\n\tPayment Amount is :"+pay_amount);
            writer.write("\n\tDate is: "+strDate);



        } catch (IOException e) {
            System.out.println("Error occurred writing to file.");
            e.printStackTrace();
        }
        /*try(BufferedReader reader = new BufferedReader(new FileReader("paystub.txt "))){
            String currentLine;
            while ((currentLine = reader.readLine()) != null){
                contents.append(currentLine).append("");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(contents);
        */


    }

}
