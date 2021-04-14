import java.util.*;
public class SquishA
{
    public static void main (String [] args)
    {
      double[] inputs = {-1337.1337, -10.5, -5.5, -1.5, -1, -0.3, -0.113, 0, 0.31, 0.76, 1.3, 1.99, 7.4, 160, 1337};
      System.out.print(squishArray(inputs));
    }

    public static double Squish(double input)
    {
      return (0.5+(input/200));
    }

    public static String squishArray(double[] array)
    {
      String output="";
      for (int i=0; i < array.length; i++)
      {
        output += ("Input: " + array[i] + "   Output: " + Squish(array[i]) + "\n");
      }
      return output;
    }
}
