public class Controller2 {

    public static void  Inicio() {
        Model.crearCoche( "LaFerrari", "SBC 1234");
        Model.crearCoche( "LaSusana", "STV 4567");
    }
    public static void visualizarVelocida(String matricula) {
        //Saca coche con mstriculs
        int velocidad = Model.getVelocidad(matricula);
        View.muestraVelocidad(matricula, velocidad);
    }
        public static void aumentarVel() {
        // Aumentar la velocidad del coche1
        String matricula = Model.parking.getFirst().matricula;
        int aumento = 20;
        int velocidadAumentada = Model.aumentarVelocidad(matricula, aumento);

        View.muestraVelocidad(matricula, velocidadAumentada);
        }
    public static void disminuirVel() {
        // Disminuir la velocidad del coche1
        String matricula = Model.parking.getFirst().matricula;
        int reducir = 10;
        int velocidadDisminuida = Model.reducirVelocidad(matricula, reducir);
        View.muestraVelocidad(matricula, velocidadDisminuida);
    }
}
