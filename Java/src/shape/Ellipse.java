package shape;

public class Ellipse extends Shape
{
  public Ellipse(double rx, double ry)
  {
    radiusX = rx;
    radiusY = ry;
  }

  /**
   * Returns true if the ellipse happens to be a circle
   * @return true if circle, false otherwise
   */
  public boolean isCircle() { return radiusX == radiusY; }

  /**
   * Returns the width of this ellipse, that is the horizontal diameter
   * @return the ellipse's width
   */
  public double getWidth() { return radiusX*2.0; }
  /**
   * Returns the height of this ellipse, that is the verticle diameter
   * @return the ellipse's height
   */
  public double getHeight() { return radiusY*2.0; }

  /**
   * Returns the maximum radius
   * @return The maximum radius of the ellipse
   */
  public double maxRadius() { return Math.max(radiusX, radiusY); }
  /**
   * Returns the minimum radius
   * @return The minimum radius of the ellipse
   */
  public double minRadius() { return Math.min(radiusX, radiusY); }

  /**
   * Returns the area of this ellipse.
   * @return THe ellipse's area
   */
  public double area() { return Math.PI * radiusX * radiusY; }

  /**
   * The type of this shape, which is always Shape.Type.ELLIPSE
   * @return Shape.Type.ELLIPSE
   */
  public Shape.Type type() { return Shape.Type.ELLIPSE; }

  @Override
  public String toString()
  {
    return "Ellipse(" + getWidth() + ", " + getHeight() + ")";
  }

  // the radius of the ellipse in each direction
  private double radiusX;
  private double radiusY;
}
