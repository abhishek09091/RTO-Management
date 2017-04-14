package com.rto.utils;

import java.util.Random;

public class RandPasswordGenerator {
	public static String generatePassword()
	{
		Random r=new Random();
		char chars[]={'a','b','c','d','e','f','g','h','i','j',
				'k','l','m','n','o','p','q','r','s','t',
				'u','v','w','x','y','z','A','B','C','D','E','F','G',
				'H','I','J','K','L','M','N','O','P','Q','R','S','T',
				'U','V','W','X','Y','Z','0','1','2','3',
				'4','5','6','7','8','9','#','$','%','&','*'};
		String s="";
		for(int i=0;i<7;i++)
		{
			s+=chars[r.nextInt(chars.length)];
		}
		return s;
	}
	
}
