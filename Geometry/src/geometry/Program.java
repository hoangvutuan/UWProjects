/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author vutuanhoang
 */
public class Program {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.print("hh");
     //   MyPoint3D pointA = new MyPoint3D(-2, -4, 5);
      //  MyPoint3D pointB = new MyPoint3D(0, 0, 1);
       // MyPoint3D pointC = new MyPoint3D(1, 1, 1);        
        MyPoint3D pointA = new MyPoint3D(0, 1.5, 0);
        MyPoint3D pointB = new MyPoint3D(3, 0, 0);
        MyPoint3D pointC = new MyPoint3D(2, 2, 0);
        Geometry g = new Geometry();
        MyPoint3D pointC1 = Geometry.getClosestPointOnSegment(pointA, pointB, pointC);
        System.out.println(pointC1.getX() + ", " + pointC1.getY() + ", " +  pointC1.getZ());
    }
    
}
