package exercici1;

/* Crea tres variables string e inicialitzales con los datos pertinentes (nombre, cognom1, cognom2).
Crea tres variables int e inicialitzales con los datos pertinentes (día, mes, año).
Muestra por pantalla las variables string concatenándolas en este orden (cognom1 + cognom2, + nombre).
Muestra por pantalla las variables int concatenándolas con “/” entre cada una de ellas.*/


public class Exercise1 {
	public static void  main(String args[]) {
		String name = "Pedro";
		String surname1 = "Rodríguez";
		String surname2 = "Valverde";
		
		int day = 12;
		int month = 07;
		int year = 1986;
		
		System.out.println(surname1 + " " + surname2 +  " " + name);
		System.out.println(day + "/" + month + "/" + year);
	
	
		final int yourYear = 1948;
	    int birthYear = 1988;
	    int numLeapYears = 0;
	    int listOfLeap = 0;
	   
	    for(int i = yourYear; i < birthYear; i++) {
	    	if(i % 4 == 0 && 100 != 0) {
	    		listOfLeap = i;
	    		System.out.println("- " + listOfLeap);
	    		numLeapYears++;
	    	}
	    }
	    System.out.println("   ");
	    System.out.println(numLeapYears + " leap years from 1948 to my birth year.");
	    
	    
	    System.out.println("   ");
	    
	    boolean leapYear = true;
	   
	    String messageTrue = "";
	    String messageFalse = "";
	
	     for(int i = listOfLeap; i < birthYear; i++){
	
	         if(i == birthYear ){
	        	 leapYear = true;
	        	 messageTrue =  birthYear + " it's a leap year.";
	        } else {
	        	leapYear = false;
	        	messageFalse = birthYear + " it's not a leap year.";
	        }
	    }
	
	     if(leapYear){
	         System.out.println(messageTrue);
	     } else {
	         System.out.println(messageFalse);
	     }
     
	}
}

