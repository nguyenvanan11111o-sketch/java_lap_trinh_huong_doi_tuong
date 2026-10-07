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
public class MainAccount {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap id: ");
        int a = sc.nextInt();
        
        System.out.print("Nhap so du tai khoan: ");
        double b = sc.nextDouble();
        
        Account acc = new Account( a,b);
        
        acc.display();
        while(true){
            System.out.println("1.Nap tien");
            System.out.println("2.Rut tien");
            System.out.println("0.Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            
            int choose = sc.nextInt();
            
            if(choose == 1)
            {
                System.out.print("Nhap so tien muon nap: ");
                int nap = sc.nextInt();
                
                acc.deposit(nap);
                acc.display();
            }
            else if(choose == 2)
            {
                System.out.print("Nhap so tien muon rut: ");
                int rut = sc.nextInt();
                
                acc.withdraw(rut);
                acc.display();
            }
            else if(choose == 0)
            {
                System.out.print("Da thoat!");
                break;
            }
            else
            {
                System.out.println("Lua chon khong phu hop!");
            }
        }
    }
}
