
import java.util.Scanner;

/**
 * Clase encargada de la interacción con el usuario
 */
public class View {
    /**
     * Menu inicial que dependiendo de la opción acceda a mecanicas del Controller
     *
     * @return resultado por terminal
     */
    public static void menu() {
        System.out.println("1.mostrar coches parking con velocidad");
        System.out.println("2.Mostrar velocidad");
        System.out.println("3.Cambiar velocidad");
        System.out.println("4.Buscar coche");
        System.out.println("5.Deposito");
        System.out.println("6.Salir");

        Scanner sc = new Scanner(System.in);
        System.out.println("Elige opcion");
        int op = sc.nextInt();

        //repetir menu hasta que el usuario elija salir
        while (op != 8) {
            switch (op) {
                case 1:
                    Controller2.crearCoche();
                    break;
                case 2:
                    for (Coche e : Model.parking) {
                        // Mostrar la velocidad de cada coche
                        Controller2.visualizarVelocida(e.matricula);
                    }

                    break;
                case 3:
                    System.out.println("Introduce la velocidad a aumentar(1) o reducir(2)");
                    int op2 = sc.nextInt();
                    if (op2 == 1) {
                        //Emplear del controller2 el aumentarVel()
                        Controller2.aumentarVel();
                        System.out.println("Velocidad aumentada: " + Model.getVelocidad("SBC1234"));
                    } else if (op2 == 2) {
                        // Disminuir la velocidad
                        Controller2.disminuirVel() ;
                        System.out.println("Velocidad disminuida: " + Model.getVelocidad("SBC1234"));

                    }
                    break;

                case 4:
                    //pedimos datos por terminal para realizar busqueda
                    System.out.println("Dime la matricula a buscar :");
                    String mat=sc.next();

                    System.out.println("El modelo del coche encontrado es : "+Controller2.buscarCoche(mat));
                    break;
                case 5:
                    System.out.println("Cuanta gasolina te queda :");
                    int g= sc.nextInt();
                    System.out.println("Gastaste esta cantidad de gasolina : "+ Controller2.depositoGastado(g));
                    break;
                case 6:
                    System.out.println("De que coche quieres saber lo que avanzaste, dime su matricula :");
                    String mat3= sc.next();
                    System.out.println("Durante cuanto tiempo estuviste moviendote en (h)");
                    int t=sc.nextInt();

                    System.out.println("Avanzaste :"+Controller2.metrosAvanzados(mat3,t)+ " m");
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

    /**
     * Metodo que devuelve la matricula y velocidad del coche dado
     * @param matricula
     * @param velocidad
     * @return matricula y velocidad (en caso de haberse modificado apareceran actualizadas)
     */
    public static boolean muestraVelocidad( String matricula, int velocidad) {
        //muestra velocidad
        System.out.println("La velocidad del coche con matricula " + matricula + " es: " + velocidad + "km/hr");
        return true;
    }
}
