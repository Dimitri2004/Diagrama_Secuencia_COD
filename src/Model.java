import java.util.ArrayList;

/**
 * Clase encargada de manejar los datos
 */
public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche y lo mete en el parking
     * @param modelo del coche
     * @param matricula identificador unico
     * @return el coche creado
     */
    public static Coche crearCoche(String modelo, String matricula,Integer gasolina){
        Coche aux = new Coche(modelo, matricula,gasolina);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca coche segun matricula
     * @param matricula a buscar
     * @return coche o null si no existe
     */
    public static Coche getCoche(String matricula){
        Coche aux = null;
        // recorre el array buscando por matricula
        for (Coche e: parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }
    //Actualice la clase Coche añdiendole una nueva variable llamada deposito y a esta se la asigne al nuevo coche que se cree
    public static Integer getGasolina(String modelo ,String matricula,Integer gasolina){
        Coche aux= new Coche(modelo,matricula,gasolina);
            if (aux.matricula.equals(matricula)) {
                return gasolina;
            }
            else return null;

    }

    /**
     * Cambia la velocidad de un coche
     * @param matricula
     * @param v nueva velocidad
     * @return velocidad modificada
     */
    public static int cambiarVelocidad(String matricula, Integer v) {
        // busca el coche
        getCoche(matricula).velocidad = v;
        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }

    /**
     * Ddevuelve la velocidad segun la matricula
     * @param matricula
     * @return v aumentada o disminuida
     */
    public static int getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }
    public static int aumentarVelocidad(String matricula,int aumento){
        // busca el coche
        Coche aux = getCoche(matricula);
        // aumenta la velocidad
        aux.velocidad += aumento;
        // retorna la nueva velocidad
        return aux.velocidad;
    }
    public static int reducirVelocidad(String matricula,int decremento){
        // busca el coche
        Coche aux = getCoche(matricula);
        // reduce la velocidad
        aux.velocidad -= decremento;
        // si la velocidad es menor que 0, se pone a -1
        if (aux.velocidad < 0) {
            aux.velocidad = -1;
        }
        // retorna la nueva velocidad
        return aux.velocidad;
    }

}
