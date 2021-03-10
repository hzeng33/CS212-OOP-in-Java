/**
 * Fraction.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 13
 * http://www.cstutoringcenter.com
 */
public class Fraction{
    //instance variables for numerator and denominator
    private int n, d;

    //default constructor
    public Fraction(){
        n = 0;
        d = 1;
    }

    //one argument constructor which sets the numerator equal to i
    //and denominator equal to 1 (as the denominator cannot be 0)
    public Fraction(int i){
        n = i;
        d = 1;
    }

    //two argument constructor which sets n = i and d = j
    //it must check if the j = 0 since the denominator must not be 0
    public Fraction(int i, int j){
        if(j == 0) 
        	return;
        n = i;
        d = j;
    }

    //get/set methods
    public int getN(){ return n; }
    public int getD(){ return d; }
        
    public void setN(int i){ n = i; }
    public void setD(int i){ 
	  if(i == 0) return;
	
        d = i; 
    }

    //method to add, then reduce a fraction   
    public Fraction add(Fraction f){
		Fraction t = new Fraction();
		t.n = n * f.d + f.n * d;
		t.d = d * f.d;
      t.reduce();
		return t;
    }

    //method to subtract, then reduce a fraction 
    public Fraction subtract(Fraction f){
	      Fraction t = new Fraction();
		t.n = n * f.d - f.n * d;
		t.d = d * f.d;
	      t.reduce();
		return t;
    }

    //method to multiply, then reduce a fraction   	
    public Fraction multiply(Fraction f){
		Fraction t = new Fraction();
		t.n = n * f.n;
		t.d = d * f.d;
		t.reduce();
		return t;
    }
	
    //method to divide, then reduce a fraction   
    public Fraction divide(Fraction f){
		Fraction t = new Fraction();
		t.n = f.n * d;
		t.d = n * f.d;
	      t.reduce();
		return t;
    }

    public String toString(){
		return n + " / " + d;
    }
	
    public boolean equals(Fraction f){
		return n * f.d == d * f.n;
    }
	
    private int gcf(int a, int b){
		if(b == 0)
			return Math.abs(a);
		else
			return gcf(b, a%b);
    }

    private void reduce(){	
      //the case where it is 0
      if(n == 0){
		     n = 0;
		     d = 1;
      }

      int c = gcf(Math.abs(n), Math.abs(d));
      n /= c;
      d /= c;
    }
} //class
