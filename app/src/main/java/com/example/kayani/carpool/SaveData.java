package com.example.kayani.carpool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by kayani on 4/16/16.
 */

public final class SaveData {
    public static final String filePath="/Users/kayani/Desktop/Carpool"; //wrond dir bitch

    private SaveData(){ //only purpose of this constructor is to stop instantiation

    }
    public static void WriteToFile(String content){
        File file = new File(filePath);
        try {
            // if file doesnt exists, then create it
            if (!file.exists()) {

                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("Done");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void ReadFromFile(){
        String line=null;
        try{
            FileReader fileReader= new FileReader(filePath);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("File not found");
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("There is an IOException");
        }

    }
}
