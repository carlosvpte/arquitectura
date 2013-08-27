package formato;

public class formato {

	int edad,numero_de_telefono;

 String sexo,nombre_de_la_persona,mayor,menor;

formato(String nombre_de_la_persona,int edad){
	this.nombre_de_la_persona=nombre_de_la_persona;
	this.edad=edad;
	
}

	

formato(String nombre_de_la_persona,int edad ,String sexo){

this.nombre_de_la_persona=nombre_de_la_persona;
this.edad=edad;
this.sexo=sexo;



}

String comprobar () {
		if (edad<=17){
			return"menor de edad";}
		
		else{
			return"mayor de edad";}
		
		
		}

public static void main (String N2 []  ){
	formato N1=new formato ("carlos martinez",24);
	System.out.println(N1.comprobar());
	N1.comprobar (24,"carlos martinez");
void
	
	
	
}




}
