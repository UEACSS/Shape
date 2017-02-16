package shape;

public class Main
{
  public static void main(String[] args) throws Exception
  {
    Shape[] shapes = new Shape[100];
    for (int i = 0; i < 100; ++i)
    {
      // hand picked values to hopefully give some random rectangles
      // note, this is voodoo, don't do it
      int type = Math.abs((i << ((i * 43) % 29)) | (i << ((i * 87) % 15)) + i) % 3;
      switch (type)
      {
        case 0:
          shapes[i] = new Rectangle(((i * 19) + 32) % 13, ((i * 17) + 83) % 23);
        break;
        case 1:
          shapes[i] = new Ellipse(((i * 19) + 32) % 13, ((i * 17) + 83) % 23);
        break;
        case 2:
          shapes[i] = new Triangle(((i * 19) + 32) % 13, ((i * 17) + 83) % 23);
        break;
      }
    }

    // we now have an array of 100 Shapes, which can be triangles, ellipses or
    // rectangles
    // let's collect some statistics on them
    int nR = 0; // number rectangles (inc squares)
    int nS = 0; // number squares
    int nE = 0; // number ellipses (inc circles)
    int nC = 0; // number circles
    int nT = 0; // number triangles (inc equilaterals)
    int nTe = 0; // number equilateral triangles
    double sum = 0.0; // the sum of all the areas

    // for each shape
    for (Shape s : shapes)
    {
      // add the area of this shape to sum
      sum += s.area(); // area is an inherited method
      // the computer knows the actual type of `s', and will look up the correct
      // area() method to call on it to get the correct result.

      // a switch statement is like a bunch of chained if ... else if ... else
      // statements
      switch (s.type()) // using type() to switch on the type of the shape
      {
        // once we've tested the type, we can safely cast
        // casting, if the target type isn't related to the source type can lead
        // to exceptions. There's built in mechanics to test this
        // (the instanceof keyword), but whatever.
        // this also demonstrates casting
        case RECTANGLE:
          ++nR;
          // the `(Rectangle)s' bit is a cast, it takes our instance, `s'
          // and treats it as a Rectangle.
          // we can safely do this because we know it's actually a Rectangle
          // we need to do this because `isSquare()'' only lives in Rectangle.
          // For all other Shape, `isSquare()'' doesn't exist.
          if (((Rectangle)s).isSquare())
            ++nS;
        break;
        case ELLIPSE:
          ++nE;
          if (((Ellipse)s).isCircle())
            ++nC;
        break;
        case TRIANGLE:
          ++nT;
          if (((Triangle)s).isEquilateral())
            ++nTe;
        break;
      }
    }

    System.out.println("The average area of the 100 shapes is " + sum/100.0);
    System.out.println("There are " + nR + " rectangles, of which " + nS + " are squares.");
    System.out.println("There are " + nE + " ellipses, of which " + nC + " are circles.");
    System.out.println("There are " + nT + " triangles, of which " + nTe + " are equilateral.");
  }
}
