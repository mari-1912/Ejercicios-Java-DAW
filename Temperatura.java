/*package pio.daw.tema5.serializa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Temperatura {

	private static final String NOMBRE_ARCHIVO = "meteo.dat";
	
	private Scanner scanner;
	private static ArrayList<RegistroTemp> listaTemp;
	
	public static void main(String[] args) {
		final String RUTA_FICH = "src/main/java/pio/daw/tema5/serializa/";

		mostrarMenu();
		
	} //fin main
	
	private static void mostrarMenu() {
		int opcion;
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		do {
			System.out.println("--- Menú ---");
			System.out.println("1 - Registrar nueva temperatura");
			System.out.println("2- Mostrar historial de registros");
			System.out.println("3 - Mostrar media de temperatura");
			System.out.println("4 - Salir");
			opcion =  scanner.nextInt();
			
			switch (opcion) {
			case 1:
                registrarTemperatura();
                break;
            case 2:
                mostrarHistorial();
                break;
            case 3:
                mostrarMedia();
                break;
            case 4:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción inválida. Intentalo de nuevo.");
			}
			
		} while(opcion != 4);
		
	} //fin mostrar menu
	
	private static void registrarTemperatura() {
		//creamos el arraylist donde guardar las temperaturas
		//ArrayList<Double> temperatura = new ArrayList<>();
		//System.out.println("Por favor, introduce una temperatura");
		Scanner scanner = new Scanner(System.in);
		//pedimos por pantalla la temperatura
		System.out.println("Ingresa la ciudad: ");
		String ciudad = scanner.nextLine();
		
		System.out.println("Ingresa la fecha (formato dd/mm/aaaa): ");
		String nuevafecha = scanner.nextLine();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
		try {
			fecha = formatoFecha.parse(nuevafecha);
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("formato de fecha erróneo");
		}
		
		System.out.println("Ingresa la temperatura Max: ");
		double tempMax = scanner.nextDouble();
		
		System.out.println("Ingresa la temperatura Min: ");
		double tempMin = scanner.nextDouble();
		
		RegistroTemp nuevoRegistro = new RegistroTemp(ciudad,fecha,tempMax,tempMin);
		listaTemp.add(nuevoRegistro);
		
        System.out.println("Registro guardado correctamente.");
		//guardamos el registro dentro del arraylist
		//temperatura.add(registro); VOLCAR LOS DATOS AL METEO.DAT
        //bufferedoutput y bufferedinput
        try(ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO + "meteo.dat"))) {
			Object tablaPersonaOut = null;
			salida.writeObject(tablaPersonaOut);
			System.out.println("Objeto serializado correctamente.");
		} catch (IOException ioe) {
			ioe.printStackTrace();
            System.err.println("Error al serializar: " + ioe.getMessage()); //.err para que se quede registrado en los errores en logs
		}
		
		// Deserialización
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(NOMBRE_ARCHIVO + "meteo.dat"))) {
            Persona[] tablaPersonasIn = (Persona[]) entrada.readObject(); //casting para pasar de object a objeto persona
            System.out.println("Objeto deserializado: " + Arrays.deepToString(tablaPersonasIn));
        } catch (IOException | ClassNotFoundException ioe) {
            System.err.println("Error al deserializar: " + ioe.getMessage());
        }
	}
	
	private static void mostrarHistorial() {
		/*leer el arraylist donde estan los registros
		 * ciudad
		 * fecha
		 * tempmax
		 * tempmin
		 * mostrar los datos leidos
		 * */
		/*if (listaTemp.isEmpty()) {
            System.out.println("No hay registros almacenados.");
        } else {
            System.out.println("Historial de registros:");
            for (RegistroTemp registro : listaTemp) {
                System.out.println(registro);
            }
        }
	}
	
	private static void mostrarMedia() {
		/*
		 * leer el arraylist donde estan los registros
		 * extraer los registros de tempmax y tempmin
		 * calcular la media de temperatura
		 * mostrar la media
		 * */
		/*if (listaTemp.isEmpty()) {
            System.out.println("No hay registros para calcular la media.");
            return;
        }

        double suma = 0;
        for (RegistroTemp registro : listaTemp) { //leemos el registro dato por dato
            suma += (registro.getTempMax() + registro.getTempMin()) / 2; //calculamos la media general
        }

        double media = suma / listaTemp.size(); //aplicamos esa media a la longitud de registros del array
        System.out.printf("La temperatura media registrada es: " + media);
        
	}
	
	private static void guardarDatos() {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO))) {
            salida.writeObject(listaTemp);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }
	
	private static void cargarDatos() {
        File archivo = new File(NOMBRE_ARCHIVO);
        if (!archivo.exists()) return; // Si el archivo no existe, no intentamos cargarlo

        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(NOMBRE_ARCHIVO))) {
            listaTemp = (ArrayList<RegistroTemp>) entrada.readObject();
            System.out.println("Datos cargados correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
        }
    }

}*/



// CODIGO CORRECTO 


package pio.daw.tema5.serializa;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Temperatura {

    private static final String NOMBRE_ARCHIVO = "meteo.dat";
    private static ArrayList<RegistroTemp> listaTemp = new ArrayList<>();

    public static void main(String[] args) {
        cargarDatos(); // Cargar datos desde el archivo
        mostrarMenu();
    }

    private static void mostrarMenu() {
        int opcion;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("--- Menú ---");
                System.out.println("1 - Registrar nueva temperatura");
                System.out.println("2 - Mostrar historial de registros");
                System.out.println("3 - Mostrar media de temperatura");
                System.out.println("4 - Salir");
                System.out.print("Seleccione una opción: ");

                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                switch (opcion) {
                    case 1:
                        registrarTemperatura(scanner);
                        break;
                    case 2:
                        mostrarHistorial();
                        break;
                    case 3:
                        mostrarMedia();
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        guardarDatos(); // Guardar datos antes de salir
                        break;
                    default:
                        System.out.println("Opción inválida. Inténtalo de nuevo.");
                }

            } while (opcion != 4);
        }
    }

    private static void registrarTemperatura(Scanner scanner) {
        System.out.print("Ingresa la ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.print("Ingresa la fecha (formato dd/MM/yyyy): ");
        String nuevafecha = scanner.nextLine();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;

        try {
            fecha = formatoFecha.parse(nuevafecha);
        } catch (ParseException e) {
            System.out.println("Formato de fecha erróneo. Registro cancelado.");
            return;
        }

        System.out.print("Ingresa la temperatura máxima: ");
        double tempMax = scanner.nextDouble();

        System.out.print("Ingresa la temperatura mínima: ");
        double tempMin = scanner.nextDouble();

        listaTemp.add(new RegistroTemp(ciudad, fecha, tempMax, tempMin));
        System.out.println("Registro guardado correctamente.");
    }

    private static void mostrarHistorial() {
        if (listaTemp.isEmpty()) {
            System.out.println("No hay registros almacenados.");
        } else {
            System.out.println("Historial de registros:");
            for (RegistroTemp registro : listaTemp) {
                System.out.println(registro);
            }
        }
    }

    private static void mostrarMedia() {
        if (listaTemp.isEmpty()) {
            System.out.println("No hay registros para calcular la media.");
            return;
        }

        double suma = 0;
        for (RegistroTemp registro : listaTemp) {
            suma += (registro.getTempMax() + registro.getTempMin()) / 2;
        }

        double media = suma / listaTemp.size();
        System.out.printf("La temperatura media registrada es: %.2f°C\n", media);
    }

    private static void guardarDatos() {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO))) {
            salida.writeObject(listaTemp);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    private static void cargarDatos() {
        File archivo = new File(NOMBRE_ARCHIVO);
        if (!archivo.exists()) return; // Si el archivo no existe, no intentamos cargarlo

        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(NOMBRE_ARCHIVO))) {
            listaTemp = (ArrayList<RegistroTemp>) entrada.readObject();
            System.out.println("Datos cargados correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
        }
    }
}



