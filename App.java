package com.wolken.hackerrank;

/**
 * Hello world!
 *
 */

import java.util.Scanner;

import com.wolken.hackerrank.dto.LoginDTO;
import com.wolken.hackerrank.dto.UserDTO;
import com.wolken.hackerrank.service.RegistrationService;
import com.wolken.hackerrank.service.RegistrationServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Scanner sc=new Scanner(System.in);
    		RegistrationService service=new RegistrationServiceImpl();
    		
    		
    		String ans;
    		do {
    			System.out.println("enter choice");
    			System.out.println("1. register");
    			System.out.println("2. login");
    			System.out.println("3. forgot password");
    			int choice=sc.nextInt();
    			if(choice==1) {
    				UserDTO dto=new UserDTO();
    				System.out.println("enter id");
    				int id=sc.nextInt();
    				sc.nextLine();
    				System.out.println("enter name");
    				String name=sc.nextLine();
    				System.out.println("enter email");
    				String email=sc.nextLine();
    				System.out.println("enter password");
    				String password=sc.nextLine();
    				System.out.println("confirm password");
    				String conPassword=sc.nextLine();
    				System.out.println("enter contact");
    				long contact=sc.nextLong();
    				
    				dto.setId(id);
    				dto.setUsername(name);
    				dto.setEmail(email);
    				dto.setPassword(password);
    				dto.setConpassword(conPassword);
    				dto.setContactNumber(contact);
    				
    				String result=service.validateandsave(dto);
    				System.out.println(result);
    			}
    			
    			else if(choice==2)
    			{
    				LoginDTO ldto=new LoginDTO();
    				sc.nextLine();
    				System.out.println("enter email id");
    				String email=sc.nextLine();
    				System.out.println("enter password");
    				String password=sc.nextLine();
    				
    				ldto.setEmail(email);
    				ldto.setPassword(password);
    				
    				String result1=service.validateandLogin(ldto);
    				System.out.println(result1);
    			}
    			
    			else if(choice==3)
    			{
    				LoginDTO ldto=new LoginDTO();
    				sc.nextLine();
    				System.out.println("enter email id");
    				String email=sc.nextLine();
    				
    				ldto.setEmail(email);
    				String result3=service.validateandUpdatePassword(email);
    				System.out.println(result3);
    			}
    			
    			sc.nextLine();
    			System.out.println("do u want to continue");
    			ans=sc.nextLine();
    			}while(ans.equals("yes"));
    			
    	}
    	
    
    	}
    
    
