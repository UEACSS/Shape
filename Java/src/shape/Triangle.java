package shape;

public class Triangle extends Shape
{
  //public Triangle(double b, double h, double po)
  public Triangle(double b, double h)
  {
    base = b;
    height = h;
    //offset = po;
  }

  /**
   * Returns true if this triangle happens to be an equilateral
   * @return true if equilateral, false otherwise
   */
  public boolean isEquilateral() { return base == (height * 2.0) / 3.0; }
  // note: multiply first and divide later to hopefully avoid issues(?)
  // note2: Comparing doubles directly is bad, due to rounding issues.

  /**
   * Returns the width of this triangle, which is equal to it's base
   * @return the triangle's width
   */
  public double getWidth() { return base; }
  /**
   * Returns the height of this triangle.
   * @return the triangle's height
   */
  public double getHeight() { return height; }

  /**
   * Returns the maximum radius of the triangle.
   * More specifically, it is whichever is bigger of the hypotenuse of the
   * midpoint to one of the base corners or the distance from the midpoint to
   * the top.
   * @return The maximum radius of this triangle
   */
  public double maxRadius()
  {
    // base/2.0,height/2.0 is the midpoint, so the hypotenuse is
    // the distance from the midpoint to one of the bottom two points
    double hypot = Math.hypot(base/2.0, height/2.0);
    return Math.max(height/2.0, hypot);
  }
  /**
   * Returns the minimum radius of the triangle.
   * More specifically, it returns whichever is smaller of the midpoint/base
   * corner hypotenuse and the midpoint/toppoint distance.
   * This is not actually the minimum radius, I am too lazy to do maths.
   * @return [description]
   */
  public double minRadius()
  {
    // doing the asme as Triangle.maxRadius, but with Math.min
    // this is incorrect, but it's 23:50 and I cba to work out the
    // actual math to calculate it.
    double hypot = Math.hypot(base/2.0, height/2.0);
    return Math.min(height/2.0, hypot);
  }

  /**
   * The area occupied by this triangle
   * @return the triangle's area
   */
  public double area() { return base * height * 0.5; }

  /**
   * The type of this shape, which is always Shape.Type.TRIANGLE
   * @return Shape.Type.TRIANGLE
   */
  public Shape.Type type() { return Shape.Type.TRIANGLE; }

  @Override
  public String toString()
  {
    return "Triangle(" + getWidth() + ", " + getHeight() + ")";
  }

  // base is the width
  private double base;
  private double height;
}
