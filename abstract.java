/********************************************************************************************
Program     :Employee details using abstract class
Author      :Ajai Sankar Hareesh
Date        :15/12/2021
Version     :1.0
**********************************************************************************************/
package Day3;
abstract class shape{
    public void numberOfSides(){

    }
}
class Triangle extends shape{
    public void numberOfSides(){
        System.out.println("TRIANGLE has 3 sides");
    }
}
class Rectangle extends shape{
    public void numberOfSides(){
        System.out.println("RECTANGLE has 4 sides");
    }
}
class Hexagon extends shape{
    public void numberOfSides(){
        System.out.println("HEXAGON has 6 sides");
    }
}
public class AbstractImplementation {
    public static void main(String[]args){
        Triangle triangle=new Triangle();
        Rectangle rectangle=new Rectangle();
        Hexagon hexagon=new Hexagon();
        triangle.numberOfSides();
        rectangle.numberOfSides();
        hexagon.numberOfSides();
    }
}
