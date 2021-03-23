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
public class bai3 {
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
              System.out.print("Nhap m dong:");
              int m=scanner.nextInt();
               System.out.print("Nhap n cot:");
              int n=scanner.nextInt();
              int[][] a=new int[m][n];
              Random rd=new Random();
              for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    a[i][j]=(int)(Math.random()*100);
                }
              }
              XuatMang(a,m,n);
              System.out.print("Nhap dong thu k:");
              int k=scanner.nextInt();
              if(k-1>=m){
                  System.out.println("Dong khong ton tai");
              }else{
                  int tong=0;
                  for(int j=0;j<n;j++)
                  {
                      tong+=a[k-1][j];
                  }
                  System.out.println("Tong phan tu dong thu k:"+tong);
              }
        }
        public static void XuatMang(int a[][],int m,int n){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.printf("%d",a[i][j]);
                }
                System.out.println();
            }
        }
}
