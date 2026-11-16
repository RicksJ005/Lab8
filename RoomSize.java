/**
 * This class sets the name, length, and width of the room.
 *
 * @author Jacob Ricketts
 * @version 1.0
 * @since 11/15/2026
 */
public class RoomSize
{
    // instance variables - replace the example below with your own
    private String name;
    private double length;
    private double width;
    
    /**
     * A constructor to create a RoomSize object with a name, length, and width
     * 
     * @param name the name of the room
     * @param length the length of the room
     * @param width the width of th eroom
     */
    public RoomSize(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }
    
    
    /**
     * Creates a copy of a RoomSize object
     * 
     * @param object2 the object to copy.
     */
    public RoomSize(RoomSize object2){
        name = object2.name;
        length = object2.length;
        width = object2.width;
        
    }
    
    /**
     * Calculates and returns the area of the room
     * 
     * @return the room's area
     */
    public double getArea(){
        return length * width;
    }
    
    /**
     * Returns a string that has the room's name, length, width, and area
     * 
     * @return a string with the room's information.
     */
    public String toString(){
        String str = String.format("\nRoom Name: %s\nLength: %.1f\nWidth: %.1f\nArea: %.2f",name, length, width, getArea());
        return str;
    }
}