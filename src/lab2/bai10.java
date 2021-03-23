/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai10 {
    public static void main(String[] args) throws Exception{
        String fileName="";
        File f=new File("");
        fileName=f.getAbsolutePath()+"\\src\\data.txt";
        f=new File(fileName);
        if (f.exists()){
            System.out.println("File da ton tai");
            System.exit(0);
        }
        PrintWriter pw=new PrintWriter(f);
        pw.print("Copyright by Duong Thanh Phet-");
        pw.println(2015);
        pw.print("http://thayphet.net");
        System.out.println("Da ghi file xong");
        Scanner inp=new Scanner(f);
        while(inp.hasNext())
        {
            String ten=inp.next();
            System.out.print(ten+"");
            int maso=inp.nextInt();
            System.out.println(maso);
        }
    }
}
