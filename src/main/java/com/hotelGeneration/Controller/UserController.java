package com.hotelGeneration.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelGeneration.Entity.User;
import com.hotelGeneration.Service.UserService;

/**
 * 
 * @author GustavMG
 * El controller es quien lleva todo el peso referente a las solicitudes HTTP(es el mesero de nuestro restaurante).
 * Aqui sucede la manipulación de los metodos HTTP (GET, POST, PUT, DELET)
 * 
 * Para poder decirle a JAVA que esta clase es un controller, necesitamos usar la anotación @RestController.
 * Esto nos ayudará a poder manejar solicitudes HTTP y ademas con esta anotación podremos manejar el fetch que tengamos en nuestro FRONT
 *
 */

@RequestMapping(path = "/hotelGeneration/users")	//Construí la ruta de nuestra API	

@RestController	//Usamos esta anotación para decirle que es una API del tipo Rest(que trabaja con metodos HTTP)
public class UserController {
	
	// Creamos una instancia de la clase UserService para que el controlador sepa la información del servicio
	private final UserService userService;
	
	@Autowired
	
	//Creamos un constructor para mi UserController, tomará como argumento la instancia del UserService
	public UserController(UserService userService) {
		this.userService = userService;
	}//Constructor que utiliza la instancia del Service como parámetro
	/**
	 * Ya que mi Controller depende de mi Service (con la instancia de UserService dentro de UserController), podre establecer los
	 * metodos HTTP que disparan las operaciones del CRUD (controller-Service)
	 */
	
	//Metodos HTTP
	/**
	 * Es un metodo GET que toma la lista de usuarios creada en el userService y que se muestra cuando se activa
	 */
	@GetMapping
	public List<User> getUsuarios(){
		return userService.readUsuarios();
	}
}
