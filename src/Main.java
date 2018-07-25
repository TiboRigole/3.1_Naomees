import java.util.Scanner;

public class Main {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		//om de input te verwerken
		int aantalSetsWoorden = Integer.parseInt(sc.nextLine());
		String letterGreep;
		final int aantalWoorden = 5;
		//variabelen
		String woord;

		//om lettergrepen te vergelijken met elkaar

		//per set van 5
		for(int a=0; a<aantalSetsWoorden; a++) {
		StringBuilder antwoord = new StringBuilder();
		antwoord.append(a+1 +" ");
		
		//overlopen van de 5 woorden in de set
		for(int x=0 ; x<aantalWoorden ; x++) {
			
			woord = sc.nextLine();
			
			//behandeling per woord
			
			//converteren
			StringBuilder sb = new StringBuilder();
			
			//omzetten in tekens met 1 karakter
			for(int i=0; i<woord.length() ; i++) {
				letterGreep = woord.substring(i, i+2);
				i++;
				if(letterGreep.equals("ba")) {sb.append("A");}
				else if(letterGreep.equals("du")) {sb.append("B");}
				else if(letterGreep.equals("di")) {sb.append("C");}
				else {System.out.println("fout, lettergreep niet herkend");}
			}
			
			//System.out.println(sb.toString());
			
			StringBuilder omgekeerdWoord = sb.reverse();
			//System.out.println(omgekeerdWoord.toString());
			
			//vergelijke de charachters
			//omgekeerde woord zit in omgekeerdWoord;
			//echte woord zit in sb
			boolean echtWoord = true;
			
			for(int i=0; i<sb.length(); i++) {
				if(sb.charAt(i) != omgekeerdWoord.charAt(sb.length()-1-i)) {
					echtWoord = false;
				}
			}
			
			if(echtWoord) {antwoord.append("naomees");}
			else {antwoord.append("onzin");}
			
			if(x != aantalWoorden) {antwoord.append(" ");}

			
			
		}
		System.out.println(antwoord.toString());
		}
	}
}
