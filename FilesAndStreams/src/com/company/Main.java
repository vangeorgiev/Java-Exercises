package com.company;
import java.io.*;
import java.util.*;


public class Main  {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        File file = new File("C:\\Users\\vangel.georgiev\\Desktop\\myTestFile.txt");

        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String text = null;

            int line = 0;

            while((text = br.readLine()) != null){
                if(line % 2 == 0){
                    System.out.println(text);
                }
                line++;
            }

            br.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

