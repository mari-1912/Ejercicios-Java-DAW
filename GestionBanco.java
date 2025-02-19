package pio.daw.tema5.serializa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class GestionBanco {
	
    private static ArrayList<ClienteBanco> clientes = new ArrayList<>();
    private static final String NOMBRE_ARCHIVO = "clientes.dat";
    private static Scanner scanner = new Scanner(System.in);
	
	private static void mostrarMenu() {
        int opcion;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("--- Menú ---");
                System.out.println("1 - Alta de cliente");
                System.out.println("2 - Baja cliente");
                System.out.println("3 - Listar clientes");
                System.out.println("4 - Saldo medio de clientes");
                System.out.println("5 - Salir");
                System.out.print("Seleccione una opción: ");

                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                switch (opcion) {
                    case 1:
                        altaCliente();
                        break;
                    case 2:
                        bajaCliente();
                        break;
                    case 3:
                        listaCliente();
                        break;
                    case 4:
                        saldoMedio(); 
                        break;
                    case 5:
                    	System.out.println("Saliendo del programa...");
                    default:
                        System.out.println("Opción inválida. Inténtalo de nuevo.");
                }

            } while (opcion != 5);
            
        }
            
	}
        
    public static void altaCliente() {
    	System.out.println("Ingrese su DNI: ");
    	String dni = scanner.nextLine();
    	System.out.println("Ingrese su nombre: ");
    	String nombre = scanner.nextLine();
    	System.out.println("Ingrese su fecha de nacimiento: (formato dd/MM/yyyy)");
        String fecha = scanner.nextLine();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = formatoFecha.parse(fecha);
        } catch (ParseException e) {
            System.out.println("Formato de fecha erróneo. Registro cancelado.");
            return;
        }
        System.out.println("Ingrese su saldo inicial: ");
        double saldo = scanner.nextDouble();
    	scanner.nextLine();
    	
    	clientes.add(new ClienteBanco(dni,nombre,fechaNacimiento,saldo));
    	System.out.println("Nuevo cliente agregado correctamente.");
    }
    
    public static void bajaCliente() {
    	System.out.print("Ingrese el DNI del cliente a eliminar: ");
        String dni = scanner.nextLine();

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getDni().equals(dni)) {
                clientes.remove(i);
                System.out.println("Cliente eliminado.");
            }
        }

        System.out.println("Cliente no encontrado.");
    }
    
    public static void listaCliente() {
    	if(clientes.isEmpty()) {
    		System.out.println("No hay clientes registrados.");
    	} else {
    		for(ClienteBanco cliente : clientes) {
    			System.out.println(cliente);
    		}
    		
    	}
    }
    
    public static void saldoMedio() {
    	if(clientes.isEmpty()) {
    		System.out.println("No hay clientes con saldo");
    	}
    	double total = 0;
    	for(ClienteBanco cliente: clientes) {
    		total += cliente.getSaldo();
    	}
    	
    	System.out.println("El saldo medio de los clientes es: " + (clientes.isEmpty() ? 0 : total / clientes.size()));
    }
    
    private static void guardarDatos() {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO))) {
            salida.writeObject(clientes);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    private static void cargarDatos() {
        File archivo = new File(NOMBRE_ARCHIVO);
        if (!archivo.exists()) return; // Si el archivo no existe, no intentamos cargarlo

        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(NOMBRE_ARCHIVO))) {
            clientes = (ArrayList<ClienteBanco>) entrada.readObject();
            System.out.println("Datos cargados correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
        }
    }
        
        

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    cargarDatos();
	    mostrarMenu();
	    guardarDatos();

	} //FIN DEL MAIN
	
	

        
}


