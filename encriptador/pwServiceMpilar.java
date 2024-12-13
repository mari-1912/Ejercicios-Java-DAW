package pio.daw.jagd.encriptador;

import org.jasypt.util.password.BasicPasswordEncryptor;

import sun.security.util.Password;

public class pwServiceMpilar {
	private BasicPasswordEncryptor passwordEncryptor;
	
	public pwServiceMpilar() {
		this.passwordEncryptor = passwordEncryptor;
	}
	
	public String encriptarContrasena(String contrasena) {
		BasicPasswordEncryptor encriptador = new BasicPasswordEncryptor();
        return encriptador.encryptPassword(contrasena);
		
	}
	
	public boolean verificarContrasena(String contrasena, String contrasenaEncriptada) {
		BasicPasswordEncryptor encriptador = new BasicPasswordEncryptor();
        return encriptador.checkPassword(contrasena, contrasenaEncriptada);
	}
	
}
