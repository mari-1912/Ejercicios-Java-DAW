package EstudioEnCasa;

public class estudiantesPooTest {

	public static void main(String[] args) {
		
		EstudiantesPoo estudiante1 = new EstudiantesPoo("María Pilar","A005",23);
		
		estudiante1.setNotas(5, 8, 7);
		
		estudiante1.calcularMedia();
		
		estudiante1.mostrarInfo();
		
		EstudiantesPoo estudiante2 = new EstudiantesPoo("Alberto Pérez","A021",24);
		
		estudiante2.setNotas(4, 4, 7);
		
		estudiante2.calcularMedia();
		
		estudiante2.mostrarInfo();

	}

}
