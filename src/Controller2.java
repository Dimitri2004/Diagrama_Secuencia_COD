public class Controller2 {

    public static void  crearCoche() {
        Model.crearCoche( "LaFerrari", "SBC1234");
    }
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
    public static void buscarCoche(String matricula){
        //Creamos un coche con la matricula recibida
        Coche coche=Model.getCoche(matricula);
        //Si coche existe, que es el caso, nos movemos por parking y seleccionamos el modelo del coche
        if (coche!=null){
            System.out.println("Coche encontrado : "+coche.modelo);
        }else{
            System.out.println("Coche no encontrado");
        }

    }

}
