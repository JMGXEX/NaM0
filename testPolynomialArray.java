package dalim.sw.software.ljm;

public class testPolynomialArray {
	 public static void main(String[] args) {
	      // f1(x) = 3x^5 + 7x^4 + 10x^3 + 4x^2 - 5x
	      int [] a = new int[] { 3, 7, 10, 4, -5, 0 };
	      // f2(x) = x^3 + x^2 + x + 1
	      int [] b = new int[] { 1, 1, 1, 1 };
	      
	      PolynomialArray f1 = new PolynomialArray(a);
	      PolynomialArray f2 = new PolynomialArray(b);   
	      
	      System.out.println("f1(x) = " + f1);
	      System.out.println("f2(x) = " + f2);
	      
	      f2 = f2.neg();
	      System.out.println("f2(x) = " + f2);
	      
	      System.out.println("f1(x) + f2(x)  = " + f1.add(f2));
//	      System.out.println("f2(x) - f1(x)  = " + f2.sub(f1));   
//	      System.out.println("f2(x) + -f1(x) = " + f2.add(f1.neg()));
	   }

}
