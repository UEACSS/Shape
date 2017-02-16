package shape;

public class Rectangle extends Shape
{
  public Rectangle(double w, double h)
  {
    width = w;
    height = h;
  }

  /**
   * Returns true if this rectangle hapens to be a square
   * @return true if square, false otherwise
   */
  public boolean isSquare() { return getWidth() == getHeight(); }

  /**
   * The width of this rectangle
   * @return the width
   */
  public double getWidth() { return width; }
  /**
   * The height of this rectangle
   * @return the height
   */
  public double getHeight() { return height; }

  /**
   * The maximum radius of this rectangle
   * More specifically, it'll be the hypotenuse of half the length and half
   * the width, which will always be the longest totally internal line you can
   * draw from the midpoint
   * @return the maximum radius of the rectangle
   */
  public double maxRadius() { return Math.hypot(width/2.0, height/2.0); }
  /**
   * The minimum radius of this rectangle
   * More specifically, it'll be whichever is smallest of height and width,
   * divided by 2.0
   * @return the minimum radius of the rectangle
   */
  public double minRadius() { return Math.min(width/2.0, height/2.0); }

  /**
   * The area of the rectangle, simply the width * height
   * @return the area of the rectangle
   */
  public double area() { return getWidth() * getHeight(); }

  /**
   * The type of this shape, which is always Shape.Type.RECTANGLE
   * @return Shape.Type.RECTANGLE
   */
  public Shape.Type type() { return Shape.Type.RECTANGLE; }

  @Override
  public String toString()
  {
    return "Rectangle(" + width + ", " + height + ")";
  }

  // the width and height, pretty simple
  private double width;
  private double height;
}
