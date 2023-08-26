package com.java11.lambda;

public class VarInLambda {

	public static void main(String[] args) {
		FuncInter f =(var a, var b) -> a+b; 
		
		//System.out.println(f.myfunc("3"));
	}

}
interface FuncInter{
	int myfunc(int a, int b);
}