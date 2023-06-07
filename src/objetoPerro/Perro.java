package objetoPerro;

public class Perro {
    private String nombre;
    private int edad;
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setRaza(raza);
    }
    
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public String getNombre() {
		return nombre;
	}
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
}
