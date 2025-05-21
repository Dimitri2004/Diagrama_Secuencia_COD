import java.util.ArrayList;
import java.util.Scanner;

//JavaDoc
/**
 * @author Grupo 1
 * @version 1.0
 * @since 2025-5-25
 * @see Model
 * @see Coche
 * @see Controller
 * @see Controller2
 * @see View
 */





/**
 * Clase encargada de la interacción con el usuario
 */
public class View {
    /**
     * Menu inicial que dependiendo de la opción acceda a mecanicas del Controller
     */
    public static void menu() {
        System.out.println("1.mostrar coches parking con velocidad");
        System.out.println("2.Mostrar velocidad");
        System.out.println("3.Cambiar velocidad");
        System.out.println("4.Salir");

        Scanner sc = new Scanner(System.in);
        System.out.println("Elige opcion");
        int op = sc.nextInt();

        //repetir menu hasta que el usuario elija salir
        while (op != 4) {
            switch (op) {
                case 1:
                    Controller2.crearCoche();
                    for (Coche e : Model.parking) {
                        // Mostrar la velocidad de cada coche
                        System.out.println(e.matricula + ": " + e.velocidad + "km/hr");
                    }
                    // Mostrar la velocidad de cada coche
                    break;
                case 2:

                    Controller2.visualizarVelocida( "SBC 1234");
                    break;
                case 3:
                    System.out.println("Introduce la velocidad a aumentar(1) o reducir(2)");
                    int op2 = sc.nextInt();
                    if (op2 == 1) {
                        //Emplear del controller2 el aumentarVel()
                        Controller2.aumentarVel();
                        System.out.println("Velocidad aumentada: " + Model.getVelocidad("SBC 1234"));
                    } else if (op2 == 2) {
                        // Disminuir la velocidad
                        Controller2.disminuirVel() ;
                        System.out.println("Velocidad disminuida: " + Model.getVelocidad("SBC 1234"));

                    }
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
            System.out.println("Elige opcion");

            op = sc.nextInt();

        }
        System.out.println("Saliendo...");
        sc.close();

    }

    public static boolean muestraVelocidad( String matricula, int velocidad) {
        //muestra velocidad
        System.out.println("La velocidad del coche con matricula " + matricula + " es: " + velocidad + "km/hr");

        return true;
    }
}
