/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1.phuong_thuc_kiem_tra_snt;

/**
 *
 * @author Admin
 */
public class Bai1Phuong_thuc_kiem_tra_snt {
    
    public static boolean isPrime(int n)
    {
        if(n < 2)
        {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        
        System.out.println("Cac so nguyen to nho hon 100: ");
        
        for(int i = 0; i < 100; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
    }
}
