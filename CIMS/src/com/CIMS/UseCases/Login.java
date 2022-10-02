package com.CIMS.UseCases;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String id="sudarshan";
		String pass="12345678";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
        String newid=sc.next();
        System.out.println("ENter password");
        String password=sc.next();
        sc.close();
        
        if(id==newid&&pass==password) {
        	System.out.println("welcome to crime information managemnet");
        	System.out.println(" enter 1 : register criminal");
        	System.out.println(" enter 2 : register crime");
        	System.out.println(" enter 3 : register victim");
        	System.out.println(" enter 4 : get all criminal");
        	System.out.println(" enter 5 : get all criminal");
        	System.out.println(" enter 6 : get all victims");
        	
        	
        	
        	
        }else {
        	System.out.println("please check username or password");
        }
	}

}
