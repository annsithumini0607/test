package com.mycompany.containerobj;
public abstract class Container 
{
    private double Height;
    private double Radius;
    
    public Container(double Height,double Radius) 
            
    {
        this.Height = Height;
        this.Radius = Radius;
    }

    public void setHeight(double Height) {
        this.Height = Height;
    }

    public void setRadius(double Radius) {
        this.Radius = Radius;
    }

    public double getHeight() {
        return Height;
    }

    public double getRadius() {
        return Radius;
    }
    
    public abstract double calculatevolume();
}

    

