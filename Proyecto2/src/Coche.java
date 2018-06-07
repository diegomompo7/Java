import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Coche {
	
	//1. Definir los atributos, es decir, lo que para m�, es un coche
	
	String matricula;
	String marca;
	String modelo;
	int año;
	String color;
	double precio;
	char motor; //D --> Diesel, G --> Gasolina, H --> Hibrido, E --> Electrico
	boolean itv; //true --> La ha pasado, false --> No la ha pasado
		
	//2. Implementar el m�todo constructor
	//p�blico y llevar� el mismo nombre que la clase
	
	public Coche(String matricula, String marca, String modelo, int año, String color, double precio, char motor,
			boolean itv) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.color = color;
		this.precio = precio;
		this.motor = motor;
		this.itv = itv;
	}

	//3. M�todos getter & setter --> Refactorizaci�n
	// Get --> Me sirve para obtener el valor de cada atributo
	// Set --> Me sirva para cambiar el valor a cada atributo
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public char getMotor() {
		return motor;
	}

	public void setMotor(char motor) {
		this.motor = motor;
	}

	public boolean isItv() {
		return itv;
	}

	public void setItv(boolean itv) {
		this.itv = itv;
	}

	//4. M�todo toString
	//Retorna una cadena con los atributos y sus correspondientes valores
	//colocaditos por orden
	
	@Override
	public String toString() {
		return "Coche [MATRICULA=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", color="
				+ color + ", precio=" + precio + ", motor=" + motor + ", itv=" + itv + "]";
	}
	
	// 5. Implementar m�todos 
	// Crear un m�todo que retorne el precio del veh�culo con 21% de IVA
	public double precioIva () {
		return getPrecio()*1.21;
	}
	
	// Crear un m�todo que retorne la edad del Coche
	public int añoCoche () {
		//soluciones Nacho
		Calendar fecha = new GregorianCalendar();
		int añoEnCurso = fecha.get(Calendar.YEAR);
				
		//soluciones Paquito
		LocalDate date = LocalDate.now();
		int añoEnCurso3 = date.getYear();
		
		return añoEnCurso3-getAño();
	}
	
	

}
