package com.mycompany.containerobj;
public class Containerobj 
{

    public static void main(String[] args) 
    {
       CylinderContainer c=new CylinderContainer(7,5);
       double calculatevolume=c.calculatevolume();
       
        System.out.println("Volume is :"+calculatevolume);
       
    }
}
