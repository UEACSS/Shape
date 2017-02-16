package shape;

public abstract class Shape
{
  /**
   * An enum for types of shapes
   */
  public enum Type
  {
    RECTANGLE,
    ELLIPSE,
    TRIANGLE
  };

  /**
   * The width of this shape
   * @return the width of the shape
   */
  public abstract double getWidth();

  /**
   * The height of this shape
   * @return the height of the shape
   */
  public abstract double getHeight();

  /**
   * The maximum radius of this shape
   * See subclass documentation for specifics
   * @return the maximum radius of the shape
   */
  public abstract double maxRadius();
  /**
   * The minimum radius of this shape
   * See subclass documentation for specifics
   * @return the minimum radius of the shape
   */
  public abstract double minRadius();

  /**
   * The area occupied by the shape
   * @return the area of the shape
   */
  public abstract double area();

  /**
   * Returns the type of the shape
   * @return the shape type
   */
  public abstract Shape.Type type();

  /**
   * A string representation of the shape
   * @return string description of the shape
   */
  @Override
  public abstract String toString();
}
