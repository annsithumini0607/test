package com.mycompany.multithreading;

public class Multithreading 
{
    public static void main(String[] args) 
    {
        
        RedLightThread RedLightThread=new RedLightThread();
        GreenLightThread GreenLightThread=new GreenLightThread();
        YellowLightThread yellowLightThread = new YellowLightThread();

        RedLightThread.start();
        yellowLightThread.start();
        GreenLightThread.start();
        
        
    }
}
