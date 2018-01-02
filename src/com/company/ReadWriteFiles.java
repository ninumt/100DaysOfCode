package com.company;

import java.io.*;

/**
 * Created by thoni82 on 1/1/18.
 */
public class ReadWriteFiles {

    public static void readFiles(String readDirPath, String writeFilePath) {

        try {
            File readf = new File(readDirPath);
            File writef = new File(writeFilePath);

            //System.out.println(readf.getAbsolutePath());
            //System.out.println(writef.getAbsolutePath());

            File[] list = readf.listFiles();

            //FileReader fr=null;
            //BufferedReader br=null;
            String st;

            for (File f : list) {
                if (f.isFile() && f.getName().equals("Read1.txt")) {

                    System.out.println("Reading Read1.txt :"+f.getAbsolutePath());

                    BufferedReader br=new BufferedReader(new FileReader(readf));
                    while ((st = br.readLine()) != null) {
                        System.out.println("going to write");
                        writeFile(st.replace("bad","good"), writeFilePath);
                    }
                    br.close();
                }
                if (f.isFile() && f.getName().equals("Read2.txt")) {
                    BufferedReader br=new BufferedReader(new FileReader(readf));
                    while ((st = br.readLine()) != null) {
                        writeFile(st.replace("1234","0000"),writeFilePath);
                    }
                    br.close();
                }

            }
            //fr.close();
            //br.close();

        } catch(IOException e){
            System.out.println("No Read file found");
            e.printStackTrace();
        } finally {

        }
    }

    public static void writeFile(String line, String writeDirPath){
        try {
            File write = new File(writeDirPath);
            FileWriter fr = new FileWriter(write);
            BufferedWriter bw = new BufferedWriter(fr);
            bw.write(line);
            bw.newLine();
            fr.close();
            bw.close();
        } catch(IOException e){
            e.printStackTrace();
            System.out.println("No Write file found");
        }

    }

    public static void main(String[] args){
        readFiles("Read","Write/Write1.txt");
    }
}


