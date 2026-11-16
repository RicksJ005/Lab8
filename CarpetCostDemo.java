import java.util.Scanner;
/**
 * A driver to that allows the user to input a room's name, length, width,
 * cost per square foot, and then uses the other classes to compute 
 *
 * @author Jacob Ricketts
 * @since 11/15/2026
 * @version 1.0
 */
public class CarpetCostDemo
{
    public static void main (String[] args){
        String name, clear;
        double length, width, cost;
        Scanner keyboard = new Scanner(System.in);
        //Master Room
        System.out.print("Enter Room Name: ");
        name = keyboard.nextLine();
        
        System.out.print("Enter room length: ");
        length = keyboard.nextDouble();
        
        System.out.print("Enter room width: ");
        width = keyboard.nextDouble();
        
        System.out.print("Enter cost per square foot: ");
        cost = keyboard.nextDouble();
        
        RoomSize room = new RoomSize(name, length, width);
        // instance variables - replace the example below with your own
        CarpetCost masterRoom = new CarpetCost(room, cost);
        
        System.out.println(masterRoom);
        keyboard.nextLine();
        // Living Room
        System.out.print("Enter Room Name: ");
        name = keyboard.nextLine();
        
        System.out.print("Enter room length: ");
        length = keyboard.nextDouble();
        
        System.out.print("Enter room width: ");
        width = keyboard.nextDouble();
        
        System.out.print("Enter cost per square foot: ");
        cost = keyboard.nextDouble();
        
        RoomSize livingroom = new RoomSize(name, length, width);
        // instance variables - replace the example below with your own
        CarpetCost livingroom1 = new CarpetCost(livingroom, cost);
        
        System.out.println(livingroom1);
    }

    
}