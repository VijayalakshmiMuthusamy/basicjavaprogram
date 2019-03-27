package basicjavapro;

class Sample {
// INSTANCE VARIABLE
	  protected int g=100;  protected int h=200;    
   boolean y=true;   boolean z=false; private  int r; private String n;
	char[] ch= {'P','E','R','F','I','C','I','E','N','T'};
	String s=String.copyValueOf(ch);
	//STATIC KEYWORD
	static String company = "PERFICIENT"; 
	byte c=10;byte d=20;
	float tot=(d%c)+(d/c);long l =(++d)-(++c);double e=(d<<c)*c;
	//BOOLEAN LOGICAL OPERATOR
	boolean boo=(c>d &&d>c);
	int ter=(c>d)?c:d;
	void data() {
	System.out.println( "DATA TYPES AND OPERATORS : FLOAT = "+tot+" ; LONG = "+l+" ; DOUBLE = "+e+ " ; CHAR = "+s);
	System.out.println("BITWISE OPERATOR : "+boo+" TERNARY OPERATOR = "+ter);
	System.out.println("ASSIGNMENT OPERATOR : a = "+(c/=10)+" b = "+(d*=5)+" c = "+(c%=2));
	}
	 
	//DEFAULT CONSTRUCTOR
	  Sample(){
		  System.out.println("Default Constructor");
	 n="viji";
		r=005;
		System.out.println("name = " +n +" roll = "+r);
	 }
	//PARAMETERIZED CONSTRUCTOR
	  Sample(int roll, String name) {
		this.r=roll;
		this.n=name;
		company=company;}
		    void show() {
		   //LOCAL VARIABLE	
		    short a = 2019;   short b = 2020;
		       System.out.println("Parameterized Constructor and this & static keyword");
		       System.out.println("roll= " + this.r + "; name= " + this.n + "; company= "+company);
	       int age=20;
	       if (age<17) {
	          System.out.println("school student");
	      } else if (age<=20) {
	         System.out.println("college student"); 
	     } else {
	         System.out.println("professional");
	       }
	       switch(age) {
	       case 19:System.out.println("before teen age");
	      break; 
	       case 20:System.out.println("after teen age");
	      break;}
	      for(int i = 0; i < 5; ++i) {
	          for(int j = 0; j <=i; ++j) {
	           System.out.print("*");
	       }
	        System.out.println(" ");      }
	      int i=1;  
	      while(i<=10){  
	      System.out.print(i);  
	      i++;  
	      }  System.out.println();
	    int j=10; 
	    do {
	    	  System.out.print(  j);
	    	  j--;}
	    	  while(j>=1);
	      int arr[] = {10, 20, 30, 40, 50};{
	    	   System.out.println("\n Print the array elements using enhanced for loop");  
	    	   for(int k:arr) {
	    	     System.out.println(k);
	    	   } }
	      int ar[][]= {{1,2,3},{2,3,1},{3,1,2}};
	    	  for(i=0;i<3;i++) {
	    		  for(j=0;j<3;j++) {
	    	  System.out.print(ar[i][j]+" ");
	      }
	    		  System.out.println();}
	      
	      }
	      
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
	 class javaprog extends  Sample{
	    public void finalize() {
	       System.out.println("Finalize method");
	    }   void meth(int a, int b) {
	       System.out.println("METHOD OVERRIDING : " + a + b);
	   }   void fun(Sample obj1) {
	       obj1.g =obj1.g-50;
	   }
	   
	   }
	public class javapro{ 
		static void display1(String... name) {
	       System.out.println("Variable Argument");  
	       for(String s:name)
	         System.out.println(s);      }
	 static int fact(int n) {
	    	if(n==1)
	       return  1 ;
	    	else
	    		  return fact(n - 1) * n;
	    	
	    }
	   
	    public static void main(String[] args) {
	     Sample obj = new Sample();
	     obj.data();
	       Sample obj2 = new Sample(2, "vijay");
	      obj2.show();
	     //CALL BY VALUE
	       obj.meth(5, 5, 5);
	    obj.meth(6, 4);
	    javaprog obj1 = new javaprog();
	    obj1.disp();
	       System.out.println("before changing the value : " + obj1.g);
	     //CALL BY REFERENCE
	       obj1.fun(obj1);
	     System.out.println("after changing the value : " + obj1.g);
	       System.out.println("Factorial of 5 : " + fact(5));
	     display1();
	      display1("hello,hai");
	       display1("hai,hello,welcome");
	       javapro displayy=new javapro();
	       System.gc();
	}

}
