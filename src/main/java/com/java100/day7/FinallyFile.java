package com.java100.day7;

import java.io.FileReader;
import java.io.IOException;

public class FinallyFile {
    public static void main(String[] args) {
        FileReader reader = null;
        try{
            reader = new FileReader("example.txt");
            int data;
            while ((data = reader.read()) != -1) {

            }
        }  catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (reader!=null){
                    reader.close();
                }
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
