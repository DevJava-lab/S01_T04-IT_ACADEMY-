package Exercici2;

import java.util.*;

public class CalculDni {

		private static final List<String> lletresDNI=new ArrayList<String>(Arrays.asList("T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"));
	

		public static String getLletra (int numDNI){
	    	
	    	int valor = numDNI % 23;
	    	
			return lletresDNI.get(valor);
	    		
	    }
}
	


