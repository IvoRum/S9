package tu.varna.pms.lab1.utils;

import tu.varna.pms.lab1.demo.Person;
import tu.varna.pms.lab1.domain.Employee;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class EmployeeProcessor {

    static void process(final String fileName){

        Set<Employee> employeesFromFile= new HashSet<>();
        FileInputStream fis=null;
        ObjectInputStream in=null;

        try{
            BufferedReader bf =new BufferedReader()
            fis= new FileInputStream(fileName);
            in=new ObjectInputStream(fis);
            while ()
            p=(Person) in.readObject().;

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        FileOutputStream fos=null;
        ObjectOutputStream out=null;

        try{
            fos=new FileOutputStream(fileName);
            out=new ObjectOutputStream(fos);


            out.writeObject(p);

            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }



        System.out.println(p);
    }
}
