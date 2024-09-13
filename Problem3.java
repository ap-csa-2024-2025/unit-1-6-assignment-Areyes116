public class Problem3
{
  public static void main(String[] args)
  {
    // insert code here
    double val1 = 67.3424;
    System.out.println("Decimal number: " + val1);

    int betterVal = (int) (val1 * 1000);
    System.out.println(betterVal % 10);
    betterVal = betterVal / 10;
    System.out.println(betterVal % 10);
    betterVal = betterVal / 10;
    System.out.println(betterVal % 10);
  }
}
