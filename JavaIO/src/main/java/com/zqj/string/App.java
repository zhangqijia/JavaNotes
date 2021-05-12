package com.zqj.string;

import java.io.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
           /* RandomAccessFile rw = new RandomAccessFile("./a.txt", "rw");
            long filePointer = rw.getFilePointer();
            System.out.println(filePointer);
            rw.writeUTF("first line");
            rw.close();
*/
            /*RandomAccessFile randomAccessFile = new RandomAccessFile("./a.txt", "rw");
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.writeUTF("nihao a");
            randomAccessFile.writeBytes("abc我");*/

            /*Apple apple = new Apple("Red", "sweet");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("./apple.txt"));
            objectOutputStream.writeObject(apple);
            objectOutputStream.close();*/

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("./apple.txt"));
            Object o = objectInputStream.readObject();
            if (o instanceof Apple)
                System.out.println(o);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
