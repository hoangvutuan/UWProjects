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
public class Geometry {
      public static MyPoint3D getClosestPointOnSegment(MyPoint3D ss, MyPoint3D se, MyPoint3D p)
      {
          return getClosestPointOnSegment(ss.getX(), ss.getY(), ss.getZ(), se.getX(), se.getY(), se.getZ(), p.getX(), p.getY(), p.getZ());
      }
      
       public static MyPoint3D getClosestPointOnSegment(double sx1, double sy1, double sz1, double sx2, double sy2, double sz2, double px, double py, double pz)
        {
          double xDelta = sx2 - sx1;
          double yDelta = sy2 - sy1;
          double zDelta = sz2 - sz1;

          if ((xDelta == 0) && (yDelta == 0) &&(zDelta == 0))
          {
            throw new IllegalArgumentException("Segment start is the same as segment end.");
          }

          double u = ((px - sx1) * xDelta + (py - sy1) * yDelta +  (pz - sz1) * zDelta) /  (xDelta * xDelta + yDelta * yDelta + zDelta * zDelta);

          final MyPoint3D closestPoint;
          if (u < 0)
          {
            closestPoint = new MyPoint3D(sx1, sy1, sz1);
          }
          else if (u > 1)
          {
            closestPoint = new MyPoint3D(sx2, sy2, sz2);
          }
          else
          {
            closestPoint = new MyPoint3D( sx1 + u * xDelta, sy1 + u * yDelta, sz1 + u * zDelta);
          }

          return closestPoint;
        }
}
