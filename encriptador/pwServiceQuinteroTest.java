package pio.daw.jagd.encriptador;

public class pwServiceQuinteroTest {

	public static void main(String[] args) {
		pwServiceMpilar servicio = new pwServiceMpilar();
		
		String password = "superPassword";
		String passwordEncriptada = servicio.encriptarContrasena(password);
		System.out.println("Prueba de alumno María Pilar Quintero");
		System.out.println("La contraseña encriptada es: " + passwordEncriptada);
		
		//verificacion de la contraseña
		boolean esValida = servicio.verificarContrasena(password, passwordEncriptada);
		System.out.println("La contraseña encriptada es válida: " + esValida);
	
	}

}
