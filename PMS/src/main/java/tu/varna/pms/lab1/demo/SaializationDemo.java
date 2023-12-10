package tu.varna.pms.lab1.demo;

import java.io.*;

public class SaializationDemo {
    public static void main(String args[]){
        String filename="file.ser";
        Person p = new Person ("Ching","KOng","Sang");

        FileOutputStream fos=null;
        ObjectOutputStream out=null;

        try{
            fos=new FileOutputStream(filename);
            out=new ObjectOutputStream(fos);
            out.writeObject(p);

            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        FileInputStream fis=null;
        ObjectInputStream in=null;

        try{
            fis= new FileInputStream(filename);
            in=new ObjectInputStream(fis);
            p=(Person) in.readObject();

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        System.out.println(p);
    }
}

