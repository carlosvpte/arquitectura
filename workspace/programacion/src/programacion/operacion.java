package programacion;

public class operacion {
	int x,y;
	public static void main (String m[]){
		operacion t=new operacion (); 
		t.x=7;
		t.y=8;
		t.suma();
		t.resta();  
		t.multiplicacion();
		t.division();
	}
	public void suma (){ 
		int r; 
		r= x+y;
		System.out.println("la suma es"+r);
		}

    public void resta (){
    	int c; 
    	c= x-y; 
    	System.out.println("la resta es"+c); 
    };
    public void multiplicacion (){
    	int c; 
    	c= x*y; 
    	System.out.println("la multipliacion es"+c);
    }
    public void division (){
    	int c; 
    	c= x/y; 
    	System.out.println("la division es"+c);
    }
}

        