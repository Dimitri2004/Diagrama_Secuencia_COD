public class Coche {
    String matricula;
    String modelo;
    Integer velocidad;
    Integer deposito;

    /**
     * Metodo que genera coche con modelo y matricula tipo String y establece velocidad inicial a 0
     * @param modelo
     * @param matricula
     */
    public Coche(String modelo, String matricula,Integer deposito) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
        this.deposito = deposito;
    }
}
