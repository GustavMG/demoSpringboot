package com.hotelGeneration.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hotelGeneration.Entity.User;	//Importación de la libreria de Spring

/**
 * Recuerda que la capa de servicios, se encarga de definir la lógica de negocio del lado de JAVA (aqui es donde vamos a definir los metodos
 * enfocados a las operaciones del CRUD que serán "disparados" por los metodos HTTP que se encontraran en el Controller
 * @author GustavMG
 *
 */

// Anotaciones son instrucciones que le damos a Java para que sepa hacer algo (@Test, @Override)

@Service	//Usamos la antocación @Service para decirle a Java que esta clase es un servicio
public class UserService {
	
	//Emular una pequeña base de datos usando un ArrayList (lista de usuarios)
	public List<User> listaDeUsuarios = new ArrayList<User>();
	
	//Creo un metodo llamado UserService que me permita agregar información a mi lista
	public UserService() {
		//Instancia de los usuarios
		listaDeUsuarios.add(new User("Gustavo", "Maldonado", "gmg@gmail.com","9993334444"));
		listaDeUsuarios.add(new User("Felipe", "Maqueda", "felipe@gmail.com","5512345678"));
		listaDeUsuarios.add(new User("Mariana", "Valladolid", "mariana@gmail.com","3312312312"));
	}
	
	//Metodos CRUD para poder iterar sobre esos usuarios
	
	//Metodo para traer a todos los usuarios
	public List<User> readUsuarios(){
		return listaDeUsuarios;
	}

}
