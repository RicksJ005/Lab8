/**
 * This class computes the cost for flooring for the room using its area and cost per square foot.
 * It then returns a string with that information.
 *
 * @author Jacob Ricketts
 * @version 1.0
 * @since 11/15/2026
 */
public class CarpetCost
{
    // instance variables - replace the example below with your own
    private double costPerSqFt;
    
    private RoomSize room;
    
    /**
     * A constructor to create an object with room info and cost per square foot.
     * 
     * @param area the parts containing the rooms name, length, and width
     * @param cost the cost of carpet per square foot.
     */
    public CarpetCost(RoomSize area, double cost){
       room = new RoomSize(area);
       costPerSqFt = cost;
    }
    
    /**
     * A function to compute the cost of the flooring using the room's area and square foot cost
     * 
     * @return the total cost of carpeting the room
     */
    public double getCost(){
        return room.getArea() * costPerSqFt;
    }
    
    /**
     * Returns a string with the room's length, width, area, cost per square foot, and carpeting cost.
     * 
     * @return a string with the room's cost per square foot and total cost.
     */
    public String toString(){
        double totalCost = room.getArea() * costPerSqFt;
        String str = room + String.format("\nThe cost per sq ft is: $%,.2f\nThe total cost is: $%,.2f\n",
        costPerSqFt, totalCost);
        return str;
    }
    

}