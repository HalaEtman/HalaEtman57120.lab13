package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {

    public static void main(String[] args) throws IOException {
        List<String> emp = new ArrayList<>();
        try (BufferedReader bf = new BufferedReader(new FileReader("data.txt"))) {

            String Li;
            while ((Li = bf.readLine()) != null) {
                emp.add(Li);
            }
        } catch (IOException H) {
            H.printStackTrace();
        }

        System.out.println("The Size of collection is : "+emp.size());
        System.out.println("---------------------for loop------------------------ ");
        for (int i = 0; i < emp.size(); i++) {
            System.out.println(emp.get(i));
        }
        System.out.println("---------------------forEach------------------------ ");
        for (String employee:emp)
        {
            System.out.println(employee);
        }
        System.out.println("--------------------- Iterator interface------------------------ ");
        Iterator<String> ITE = emp.iterator();
        while (ITE.hasNext()) {
            System.out.println(ITE.next());
        }


    }
}