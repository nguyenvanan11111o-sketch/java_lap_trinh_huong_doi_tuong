/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lap_trinh_huong_doi_tuong;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class MainRectangle {
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap chieu cao: ");
        int a = sc.nextInt();
        
        System.out.print("Nhap chieu rong: ");
        int b = sc.nextInt();
     
        Rectangle hcn = new Rectangle(a,b);
        hcn.display();
    }
}
