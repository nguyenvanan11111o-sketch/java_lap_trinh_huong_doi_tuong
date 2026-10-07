/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lap_trinh_huong_doi_tuong;

/**
 *
 * @author Admin
 */
public class Account {
    int id;
    double balance;
    
    public Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
    }
    
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    public void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance -= amount;
        }
        else
        {
            System.out.print("So du khong du!");
        }
    }
    
    public void display()
    {
        System.out.println("ID: " + id);
        System.out.printf("So du: %.1f%n", balance);
    }
}
