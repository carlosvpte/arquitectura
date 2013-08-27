
public class clase2 {
	static double A=5,B=12,C=9;
	public static void main (String T []) {
		
		if(A%2==0)
				System.out.println("A es par");
		else
				System.out.println("A es impar");
													
		if(Math.sqrt(A)*Math.sqrt(A)==A)
			
				System.out.println("La raiz de A es exacta");
			else
				System.out.println("La raiz de A no es exacta");
			
				System.out.println("La raíz cuadrada de " + A + " es " + Math.sqrt(A));
					
		if(B%2==0)
			
				System.out.println("B es par");
		else
				System.out.println("B es impar");
						
		if(Math.sqrt(B)*Math.sqrt(B)==B)
			
			System.out.println("La raiz de B es exacta");
		else
			System.out.println("La raiz de B no es exacta");
		
				System.out.println("La raíz cuadrada de " + B + " es " + Math.sqrt(B));
		
		if(C%2==0)
			
				System.out.println("C es par");
		else
				System.out.println("C es impar");
		
		if(Math.sqrt(C)*Math.sqrt(C)==C)
			
			System.out.println("La raiz de C es exacta");
		else
			System.out.println("La raiz de C no es exacta");
		
				System.out.println("La raíz cuadrada de " + C + " es " + Math.sqrt(C));
		
		
		if(A>B)
			if(A>C)
				if(B>C)
					System.out.println("" +A+" "+B+" "+C);
						else
							System.out.println(""+A+" "+C+" "+B);
						else
							System.out.println(""+C+" "+A+" "+B);
		 				else
		 			if(B>C)
		 				if(A>C)
		 					System.out.println(""+B+" "+A+" "+C);
		 				else
		 					System.out.println(""+B+" "+C+" "+A);
		 				else
		 					System.out.println(""+C+" "+B+" "+A);
		
		
		
					
					
	}
	private static void log(String string) {
		// TODO Auto-generated method stub
		
	}
	
}
