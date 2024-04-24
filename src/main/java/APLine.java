public class APLine
{
  /* your code here */
  private int a,b,c;
  public APLine(int a1, int b1, int c1){
    a=a1;
    b=b1;
    c=c1;
  }
  public double getSlope(){
    if (b != 0) {
      return (double) a / b;
    } else {
      return Double.POSITIVE_INFINITY; 
    }
  }
  public boolean isOnLine(int x, int y){
    return a * x + b * y + c == 0;
  }
}
