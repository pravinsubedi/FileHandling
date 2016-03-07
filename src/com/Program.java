/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author pravin
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
       try{
           String line="";
           System.out.println(">");
           while(!reader.readLine().equalsIgnoreCase("Quit")){
           System.out.println(line);
           }
       }
       catch(IOException ioe){
           
       }*/
    try{
        BufferedReader reader=new BufferedReader(new FileReader(new File("d:/hello.txt")));
        String line="";
        while((line=reader.readLine())!=null){
           System.out.println(line);
           }
    }
    catch(FileNotFoundException ex){
       System.out.println("cannot find file");
    }
    catch(IOException ioe){
        System.out.println("IOException");
    }
}
}