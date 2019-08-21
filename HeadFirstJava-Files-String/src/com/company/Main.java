package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File file = new File("MyTestFile.txt");

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            bw.write("Hello, from other file\n");
            bw.write("Hello, from other file, again");

            bw.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line = null;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                String[] result = line.split(" ");

                for (int i = 0; i < result.length; i++) {
                    System.out.println(result[i]);
                }
            }

            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
