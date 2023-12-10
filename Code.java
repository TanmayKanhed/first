package com.javatpoint;  
import java.io.*;  
public class Code{  
public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("D:\tanmay.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome to javaTpoint.");  
    buffer.close();  
    System.out.println("Success");  
    }  
}  