package Profesor;

import java.util.Calendar;

public class ProfesorTest {

	public static void main(String[] args) {
		Calendar fecha1 = Calendar.getInstance();
		fecha1.set(2024,9,12);
		Calendar fecha2 = Calendar.getInstance();
		fecha1.set(2024,11,21);
		
		//creamos dos interinos y dos titulares
		ProfesorInterino profInter1 = new ProfesorInterino("87654321B","Juan","López Martínez",40,ProfesorQuinteroParra.modulo.BBDD,fecha1);
		profInter1.importeNomina(1500,100);
        System.out.println(profInter1.toString());
		
        ProfesorInterino profInter2 = new ProfesorInterino("12345678A","María","González Pérez",35,ProfesorQuinteroParra.modulo.Marcas,fecha2);
		profInter2.importeNomina(1400, 100);
        System.out.println(profInter2.toString());
		
        ProfesorTitular profTitular1 = new ProfesorTitular("12345678A","Ana","Martínez López",45,ProfesorQuinteroParra.modulo.Interfaces,15);
        profTitular1.importeNomina(2100, 200);
        System.out.println(profTitular1.toString());
        
        ProfesorTitular profTitular2 = new ProfesorTitular("87654321B","Carlos","García Pérez",50,ProfesorQuinteroParra.modulo.Programacion,20);
        profTitular2.importeNomina(2200, 300);
        System.out.println(profTitular2.toString());
	}

}
