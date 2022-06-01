package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Task2 {

    public static void main(String[] args) throws IOException {
        List<String> EMP = new ArrayList<>();
        try (BufferedReader Bf = new BufferedReader(new FileReader("data.txt"))) {

            String Li;
            while ((Li = Bf.readLine()) != null) {
                EMP.add(Li);
            }
        } catch (IOException H) {
            H.printStackTrace();
        }
        System.out.println("The Size of collection is : "+EMP.size());
        System.out.println("--------------------------------------------- ");
        for (String employee:EMP)
         {
            System.out.println(employee);
        }
        HashSet<String> HS = new HashSet<String>(EMP);
        List<String> newli = new ArrayList<String>(HS);
        System.out.println("--------------------------------------------- ");
        System.out.println("List after removing duplicate elements:");
        for (Object ob: newli)
            System.out.println(ob);
    }
}