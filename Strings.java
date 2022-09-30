package com.qa.java.stringmain;


public class Strings {
		String word;
		
		Strings(String stri) {
			this.word=stri;
		}
		public int countString(String strings) {
			int countString=0;
			char[] c=new char[strings.length()];
			for(int i=0;i<strings.length();++i) {
				c[i]=strings.charAt(i);
				if((i>0)) {
					if((c[i]==' ')&& (c[i-1]==' '))
						continue;
					else countString++;
				}
			}
			return countString;
			
		}
		
}

