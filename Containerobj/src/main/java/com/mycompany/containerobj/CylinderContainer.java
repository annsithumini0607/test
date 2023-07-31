package com.mycompany.containerobj;
public class CylinderContainer extends Container 
{
    public CylinderContainer(double Height, double Radius) 
    {
        super(Height, Radius);
    }
    
    @Override
    public double calculatevolume() 
    {
        double calculatevolume = Math.PI *getRadius()*getRadius()*getHeight();
        return calculatevolume;
    }
}
