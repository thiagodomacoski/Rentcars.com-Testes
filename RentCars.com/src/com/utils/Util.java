package com.utils;

import java.util.Random;

import com.connect.request.CadastrarRequest;

public class Util {

	public static void main(String[] args) {
		 final CadastrarRequest cadastrarRequest = CadastrarRequest.inflate();
		 System.out.println(cadastrarRequest);
	}
	
	
	public static String generateCPF() {
		return (generateInteger(3)+"."+generateInteger(3)+"."+generateInteger(3)+"-"+generateInteger(2));
	}
	
	public static int generateInteger(int dezenas) {
		if(dezenas > 13) {
			return (int)System.currentTimeMillis();
		}
		final Long l = System.currentTimeMillis();
		String number = l.toString();
		number = number.substring((number.length()-dezenas), number.length());
		return Integer.valueOf(number);
	}
	
	public static String generateString(int size) {
		final StringBuilder builder = new StringBuilder();
		int i = 0;
		final Random random = new Random();
		while( i != size) {
			int sort = 0;
			while(sort < 63 || sort > 122) {
				sort = ( random.nextInt(1220)/10 );	
			}
			char item = (char)sort;
			if( (item != '`') & (item != '^') & (item != '\\') & (item != '?') & (item != '[') & (item != ']') & (item != '_') &  (item != '@')) {
				builder.append( item );
				i++;				
			}
		}
		return builder.toString();
	}
	
}
