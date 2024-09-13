public class Problem2
{
  public static void main(String[] args)
  {
    // insert code here
    double val1 = 57.39;
    double val2 = 22.52;
    System.out.println("The original numbers are: ");
    System.out.println(val1);
    System.out.println(val2);

    int val1Rounded = (int) (val1 + 0.5);
    int val2Rounded = (int) (val2 + 0.5);

    int answer = val1Rounded + val2Rounded;
    System.out.println("Answer: " + answer);

  }
}
