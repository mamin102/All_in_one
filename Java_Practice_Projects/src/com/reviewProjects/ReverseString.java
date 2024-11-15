package com.reviewProjects;
public class ReverseString {
	public void reverse() {
			String s= "  !!!! enoyreve  esirprus";
		for (int i = s.length()-1; i>=0; i-- ) {
			char rev= s.charAt(i); //casting the data from string to char
			System.out.print(rev);
		}
	}
	public void stringBuffer () {
		String s = "??? no gniog stahw";
			StringBuffer bf = new StringBuffer();
		bf.append(s);
		bf.reverse();
		bf.toString();
		System.out.println(bf);
	}
	public void stringBuffer2 () {
			String s = "!!! gnillihc m'I";
		String bf = new StringBuffer(s).reverse().toString();
		System.out.println(bf);
	}
	public static void main(String[] args) {
		ReverseString rs= new ReverseString();
			rs.reverse();
			rs.stringBuffer();
			rs.stringBuffer2();
	}
}
