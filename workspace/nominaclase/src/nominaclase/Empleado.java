
package nominaclase;

public class Empleado {
	final private String cedula;
	private String apellido;
	private double horasTrabajadas;
	private double sueldoxHoras;
	public Empleado (String Cedula, String apellido, String nombre, double horasTrabajadas, double sueldoxhoras){
		if(cedula! null) this.cedula = cedula;
		else this.cedula ="";
		set Apellido(apellido);
		set Nombre(nombre);
		set SueldoxHoras(SueldoxHoras)
		set HorasTrabahadas(horasTrabajadas);
	}
	public double calcularSalario(){
		return HorasTrabajadas*sueldoxHoras;
	}
	public String getCedula(){
		return Cedula;
	}
	public String getApellido(){
		return Apellido;
	}
	public void setApellido(String apellido){
		if(apellido! null) this.apellido=apellido;
		else this.apellido="";
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(string nombre){
		if(nombre!=null) this.nombre=nombre;
		else this.nombre="";
	}
	public double getHorasTrabajadas(){
		return horasTrabajadas;
		
		empleado.java
		public void set HorasTrabajadas(Double horas){
			if(horastrabajadas>=0) this.horasTrabajadas = horas;
			else this.horasTrabajadas=0;
		}
		public void set sueldoxHoras(double sueldo){
			if(sueldoxHoras<=0) this.sueldoxhotas=sueldo;
			else this .sueldoxHoras=0
		}
	}
	
