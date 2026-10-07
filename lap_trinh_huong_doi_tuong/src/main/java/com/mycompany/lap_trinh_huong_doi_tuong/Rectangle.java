/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lap_trinh_huong_doi_tuong;

/**
 *
 * @author Admin
 */
public class Rectangle {
    double width;
    double height;
    
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    
    public double getArea()
    {
        return width * height;
    }
    
    public double getPerimeter()
    {
        return 2 * (width + height);
    }
    
    public void display()
    {
        System.out.println("Chieu rong: " + width);
        System.out.println("Chieu cao: " + height);
        System.out.println("Dien tich: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
    }
}
