/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Administrator
 */
public class bai1 {

   
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap he so bac 2,a=");
        float a=scanner.nextFloat();
        System.out.print("Nhap he so bac 2,b=");
        float b=scanner.nextFloat();
                System.out.print("Nhap he so bac 2,c=");
        float c=scanner.nextFloat();
        bai1.giaiptbac2(a, b, c);
    }
    public static void giaiptbac2(float a,float b,float c){
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh vo nghiem!");
            }else{
                System.out.println("Phuong trinh co mot nghiem:"+"x="+(-c/b));
            }
                return;
        }
    
    float delta=b*b-4*a*c;
    float x1;
    float x2;
    if(delta>0){
        x1=(float)((-b+Math.sqrt(delta))/(2*a));
        x2=(float)((-b-Math.sqrt(delta))/(2*a));
        System.out.println("Phuong trinh co 2 nghiem :"+"x1="+x1+"x2="+x2);
        }else if(delta==0){
            x1=(-b/(2*a));
            System.out.println("Phuong trinh co nghiem kep:"+"x1=x2="+x1);
        }else{
            System.out.println("Phuong trinh vo nghiem!");
    }
    
}

    
}
