package com.hotelGeneration.Entity;

public class User {
	/**
	 * Utilizamos el atributo static ya que será convertido en una variable de instancias, esto significa que la variable le pertenece
	 * a la clase y NO al objeto que la instancia, esto nos ayuda a tener un mejor control del contador y que independientemente de la instancia,
	 * este valor siempre lo otorga la clase, asi evitamos id repetidos o saltados.
	 */
	//Propiedades o atributos
	private static Long id = 0L;
	public String nombre;
	public String apellido;
	public String email;
	public String telefono;
	
	/**
	 * Utilizamos un contador id++ dentro del constructor para poder emular el atributo autoincrementable de nuestra columna id de la BBDD.
	 * Cuando conectemos la BBDD ya no necesitaremos este dato en el constructor
	 * 
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param email
	 * @param telefono
	 */
	//Constructor 
	public User(String nombre, String apellido, String email, String telefono) {
		id++;	//simulamos el autoincremento de usuarios de la base de datos
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
	}

	//Getters y Setters
	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
