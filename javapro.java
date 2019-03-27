package basicjavapro;









class Sample {
	short a = 2019;   short b = 2020;   int m; protected int g=100;  protected int h=200;   double d;  
	float f;   boolean y=true;   boolean z=false; private  int r; private String n;
	  static String company = "PERFICIENT"; 
	//DEFAULT CONSTRUCTOR
	  Sample(){
		  System.out.println("Default Constructor");
		this.n="viji";
		this.r=005;
	  }
	//PARAMETERIZED CONSTRUCTOR
	  Sample(int roll, String name, String company) {
		this.r=roll;
		this.n=name;
		this.company=company;}
		    void show() {
		       System.out.println("Parameterized Constructor and this & static keyword");
		       System.out.println("roll= " + this.r + "; name= " + this.n + "; company= "+company);
	       if (a % 4 == 0) {
	          System.out.println("It is the leap year");
	      } else if (a == b) {
	         System.out.println("a==b : " + y); 
	     } else {
	         System.out.println("a==b : " + z);
	       }
	       int arr[] = {10, 20, 30, 40, 50};{
	    	   System.out.println("Print the array elements using enhanced for loop");  
	    	   for(int k:arr) {
	    	     System.out.println(k);
	    	   } }
	      for(int i = 0; i <= 5; ++i) {
	          for(int j = 0; j <= i; ++j) {
	           System.out.print("*");
	       }
	        System.out.println(" ");      }}
	 void meth(int a, int b) {
	       System.out.println("METHOD OVERLOADING AND OVERRIDING : " + (a + b));
	 }
	   void meth(int a, int b, int c) {
	  System.out.println("METHOD OVERLOADING");
	       System.out.println(a + b + c); 
	} void disp() {
		class inner{
			void disp() {
				System.out.println("INNER CLASS : "+r);
			}
		}inner object =new inner();
		object.disp();
	}
	   }
	public class javapro extends  Sample{
	    public void finalize() {
	       System.out.println("Finalize method");
	    }   void meth(int a, int b) {
	       System.out.println("METHOD OVERRIDING : " + a + b);
	   }   void fun(Sample obj1) {
	       obj1.g =obj1.g-50;
	   }
	    static int fact(int n) {
	    	if(n==1)
	       return  1 ;
	    	else
	    		  return fact(n - 1) * n;
	    	
	    }
	    static void display1(String... name) {
	       System.out.println("Variable Argument");  
	       for(String s:name)
	         System.out.println(s);      }
	    
	    
	    
	       public static void main(String[] args) {
	     Sample obj = new Sample();
	       Sample obj2 = new Sample(2, "vijay","TCS");
	      obj2.show();
	     
	       obj.meth(5, 5, 5);
	    obj.meth(6, 4);
	      //System.gc();
	    javapro obj1 = new javapro();
	    obj1.disp();
	       System.out.println("before changing the value : " + obj1.g);
	     obj1.fun(obj1);
	     System.out.println("after changing the value : " + obj1.g);
	       System.out.println("Factorial of 5 : " + fact(5));
	     display1();
	      display1("hello,hai");
	       display1("hai,hello,welcome");
	}

}
