/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai3.phuong_thuc_de_quy_tim_fibonancci;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Bai3Phuong_thuc_de_quy_tim_fibonancci {

    public static int fibonancci(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        if(n == 1)
        {
            return 1;
        }
        
        return fibonancci(n - 1) + fibonancci(n - 2);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        
        fibonancci(n);
        
        System.out.println("So fibonancci thu " + n + " la " + fibonancci(n));
    }
}
