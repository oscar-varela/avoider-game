import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Avoider extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Avoider()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        // se usa el falce  en la super clase para objetos fuera de la clase y acer escrool
        super(600, 400, 1 , false); 
    }
    
    public void act()
    { if(Greenfoot.getRandomNumber(100) < 2)
        {
            Enemy e = new Enemy();
            int x = Greenfoot.getRandomNumber();
            int y = 0;
            
        }
    }
    
}
