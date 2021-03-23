/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */

public class bai2 {
          public static void main(String[] args){
              int[] a;
              int n;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap so phan tu");
        n=scanner.nextInt();
        a=new int[n];
        nhap(a,n);
        System.out.print("So nguyen to la:");
        for(int i=0;i<n;i++){
            if(check(a[i]))
                System.out.print(a[i]+"");
        }
        System.out.println("");
        sapxep(a,n);
       }
         public static void nhap(int a[],int n){
             Random rd=new Random();
             for(int i=0;i<n;i++)
                 a[i]=rd.nextInt(40);
         }
         public static void xuat(int a[],int n){
             for(int i=0;i<n;i++)
                 System.out.print("\t"+a[i]);
         }
         
         public static boolean check(int n){
             if(n<=1) return false;
             for(int i=2;i<=Math.sqrt(n);i++)
                 if(n%i==0) return false;
             return true;
         }
         public static void sapxep(int a[],int n){
             for(int i=0;i<n;i++)
                 for(int j=0;j<n-1;j++){
                     if(a[j]> a[j+1]){
                         int temp=a[j];
                         a[j]=a[i];
                         a[i]=temp;
                     }
                 }
         }

   
}



