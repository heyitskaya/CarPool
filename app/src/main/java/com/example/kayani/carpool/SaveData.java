package com.example.kayani.carpool;
import java.io.*;


public final class SaveData { //cannot be extended

    private SaveData(){ //only purpose of the constructor is to stop
        //instantiation

    }

    public static void writeToFile(String content){

        try{
            FileWriter fileWriter= new FileWriter("SaveDataExample.txt");
            BufferedWriter writer= new BufferedWriter(fileWriter);

            writer.write(content);
            writer.newLine();
            writer.write("kaya");
            writer.newLine();
            writer.write("lololol");


//			/writer.flush();
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void readFromFile(){
        try{
            File myFile= new File("SaveDataExample.txt");
            FileReader fileReader= new FileReader(myFile);
            BufferedReader reader= new BufferedReader(fileReader);
            String line=null;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }



    /**public static void main(String[] args){
     SaveData.writeToFile("This is the beginning");
     SaveData.readFromFile();
     } **/


}
