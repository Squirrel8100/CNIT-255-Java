/**
 *
 * @author logan
 * Lab Section 009
 * 
 */
import java.util.*;
import java.text.NumberFormat;

public class Lab1Fish {
    
    public static void main(String args[])
{
// Create a Scanner to read from user input
Scanner in = new Scanner(System.in);

double radius = 0.0;
while(radius < 10.0 || radius > 15.0)
{
System.out.print("Please enter the radius of the fountain (10.0 to 15.0): ");
radius = in.nextDouble();
if(radius < 10.0 || radius > 15.0)
    {
        System.out.print("(INCORRECT VALUE DETECTED. Please enter a value between 10.0 and 15.0) ");   
        radius = in.nextDouble();
    }
    
}

double width1 = 0.0;
while(width1 < 2.0 || width1 > 8.0)
{
    System.out.print("Please enter the rectangular pedestal’s x-axis width (2.0 to 8.0 feet):");
    width1 = in.nextDouble();
    if(width1 < 2.0 || width1 > 8.0)
    {
        System.out.print("(INCORRECT VALUE DETECTED. Please enter a value between 2.0 and 8.0) ");   
        width1 = in.nextDouble();
    }
}
    

double width2 = 0.0;
while(width2 < 2.0 || width2 > 8.0)
{
System.out.print("Please enter the rectangular pedestal’s y-axis width (2.0 to 8.0 feet):");
 width2 = in.nextDouble();
 if(width2 < 2.0 || width2 > 8.0)
    {
        System.out.print("(INCORRECT VALUE DETECTED. Please enter a value between 2.0 and 8.0) ");   
        width2 = in.nextDouble();
    }
}


double depth = 0.0;
while(depth < 1.0 || depth > 3.0)
{
System.out.print("Please enter the water’s depth when full (1.0 and 3.0 feet): ");
    depth = in.nextDouble();
    if(depth < 1.0 || depth > 3.0)
    {
        System.out.print("(INCORRECT VALUE DETECTED. Please enter a value between 1.0 and 3.0)");
        depth = in.nextDouble();
    }
}

double Volume1 = 0.0;
double Volume2 = 0.0;
double VolumeF = 0.0;
double VolumeG = 0.0;
double CostG = 0.0;
//Volume of a Cylinder
Volume1 = ((radius*radius)*(Math.PI)*(depth));

// Volume of a rectangular cube. 
Volume2 = (width1*width2*depth);

//Final Volume in ft. 
VolumeF = (Volume1 - Volume2);

//Convert Volume in Cubic Feet to gallons
VolumeG = (VolumeF*7.481);

//Cost per gallon rounded to nearest gallon in cost
CostG = (Math.ceil(VolumeG)*.10);
System.out.print("Water Volume in Cubic Feet: " + VolumeF + "\n" + "Water Volume in Gallons: " + 
        VolumeG + "\n" + "That amount of water will cost: " + NumberFormat.getCurrencyInstance().format(CostG) + "\n");




}

}
