/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2.phuong_thuc_tinh_de_quy_tong;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Bai2Phuong_thuc_tinh_de_quy_tong {
    
    public static int sum(int n){
        if(n == 1)
        {
            return 1;
        }
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        
        sum(n);
        
        System.out.print("Tong tu 1 den " + n + " = " + sum(n));
    }
}
