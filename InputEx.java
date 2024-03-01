package com.batch.assignments;

public class InputEx {
    public static void main(String[] args) {
    	int a = Integer.parseInt(args[0]);
    	int b = Integer.parseInt(args[1]);
    	int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
    	int e = Integer.parseInt(args[4]);
    	int sum = a+b+c+d+e;
    	float average =sum/5;
    System.out.println("the sum of 5 numbers is:"+ sum);
    System.out.println("average is:"+ average);
    }

}
