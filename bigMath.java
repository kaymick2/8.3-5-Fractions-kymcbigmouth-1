import java.lang.*;

public class bigMath {
  private int n1;
  private int n2;
  private int d1;
  private int d2;

  public bigMath(int n1, int d1, int n2, int d2) {
    this.n1 = n1;
    this.n2 = n2;
    this.d1 = d1;
    this.d2 = d2;

  }

  public double addition(int n1, int d1, int n2, int d2) {
    double a = ((n1 * d2) + (n2 * d1)) / (d1 * d2);
    return a;

  }

  public double subtraction(int n1, int d1, int n2, int d2) {
    double b = ((n1 * d2) - (n2 * d1)) / (d1 * d2);
    return b;
    // calls x and z, defines b as x - z and tells the program to return b if called
  }

  public double multiplication(int n1, int d1, int n2, int d2) {
    double c = (n1 * n2) / (d1 * d2);
    return c;
    // calls x and z, defines c as x*z, and puts c to be returned if called
  }

  public double division(int n1, int d1, int n2, int d2) {
    double d = (n1 * d2) / (d1 * n2);
    return d;
    // calls x and z, defines d as x/z, and puts d to be returned if method is
    // called. if the method is called, you need to call x and z as parameters (as
    // they are the required parameters), which puts x and z into the method, kind
    // of like a function. return d; says that if you put x and z in, you get d out.
  }

  public double average(int n1, int d1, int n2, int d2) {
    double f = ((double) x + z) / 2;
    return f;

  }

}