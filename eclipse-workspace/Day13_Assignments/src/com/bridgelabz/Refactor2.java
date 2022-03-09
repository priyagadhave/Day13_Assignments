package com.bridgelabz;

public class Refactor2<T extends Comparable<T>>{
    T a,b,c;

	public static void main(String[] args) {
		
        System.out.println("Welcome to Java Core - Generics Test Maximum");        
        Refactor2<Integer> integerComparison = new Refactor2(90,120,190);					//Creating Generic Integer Object for Integer Comparison
        System.out.println("Maximum from 3 Integer Object : "+integerComparison.compareTo());
        Refactor2<Float> floatComparison = new Refactor2(90.0F,120.0F,190.0F);					//Creating Generic Float Object for Float Comparison
        System.out.println("Maximum from 3 Float Object : "+floatComparison.compareTo());
        Refactor2<String> stringComparison = new Refactor2("Apple","Peach","Banana");		//Creating Generic String Object for String Comparison
        System.out.println("Maximum from 3 String Object : "+stringComparison.compareTo());
    	}	        
	Refactor2(T a, T b, T c) {								    //Generic Constructor for Handling Different Type Object
        this.a = a;
        this.b = b;
        this.c = c;
    	}	    
    public T compareTo() {												//compareTo method for Checking Maximum from 3 Integer Object
        if(a.compareTo(b) > 0){
            if(a.compareTo(c) > 0) {
                return a;
            	} 
	            else {
	                return c;
	            	}
	        } 
	        else {
		            if(b.compareTo(c) > 0) {
		                return b;
		            } 
		            else {
		                return c;
		            	}
    			}
    	}

	

}
