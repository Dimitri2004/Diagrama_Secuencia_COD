public class Controller2 {
    /**
     * Metodo que llama al model para crear coche
     */
    public static void  crearCoche() {
        Model.crearCoche( "LaFerrari", "SBC1234",200);
        Model.crearCoche( "Lamborghini", "SRG3456",200);
    }
    /**
     * Metodo para poder ver la velocidad del coche creado
     * @param matricula
     * Despues de pedir velocidad al model lo devolvemos a la view para sacarla por terminal
     */
    public static void visualizarVelocida(String matricula) {
        //Saca coche con mstriculs
        int velocidad = Model.getVelocidad(matricula);
        View.muestraVelocidad(matricula, velocidad);
    }
        public static void aumentarVel() {
        // Aumentar la velocidad del coche1
        String matricula = Model.parking.get(0).matricula;
        int aumento = 20;
        int velocidadAumentada = Model.aumentarVelocidad(matricula, aumento);

        View.muestraVelocidad(matricula, velocidadAumentada);
        }
    public static void disminuirVel() {
        // Disminuir la velocidad del coche1
        String matricula = Model.parking.get(0).matricula;
        int reducir = 10;
        int velocidadDisminuida = Model.reducirVelocidad(matricula, reducir);
        View.muestraVelocidad(matricula, velocidadDisminuida);
    }

    /**
     * @param matricula
     * @return null en caso de que coche no exista
     */
    public static Object buscarCoche(String matricula){
        //Creamos un coche con la matricula recibida
        //Si coche existe, que es el caso, nos movemos por parking y seleccionamos el modelo del coche
        for (Coche coche:Model.parking) {
            if (coche.matricula.equals(matricula)){
                return coche.modelo;
            }
        }
        return null;
    }
    //aplique un int restante para asi cuando me de los datos de la matricula y modelo yo devuelva el deposito inicialmente lleno y posteriromente le quite lo que le queda y le diga lo que gasto en la view
    public static Integer depositoGastado(int restante){
        String modelo=Model.parking.get(0).modelo;
        String matricula=Model.parking.get(0).matricula;
        return Model.getGasolina(modelo,matricula,Model.getGasolina(modelo,matricula,200)-restante);

    }
    public static Integer metrosAvanzados(String matricula,int tiempo){
        int velocidad=Model.getVelocidad(matricula);
        if (velocidad==0){
            return 0;
        }
        return velocidad*tiempo;
    }
}
