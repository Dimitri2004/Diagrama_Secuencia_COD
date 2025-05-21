import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ModelTestTest  {
   @Test
   @DisplayName("Test de crearCoche")
    public void testCrearCoche() {
         // Arrange
         String modelo = "LaFerrari";
         String matricula = "SBC 1234";

         // Act
         Coche coche = Model.crearCoche(modelo, matricula);

         // Assert
         assertNotNull(coche);
         assertEquals(modelo, coche.modelo);
         assertEquals(matricula, coche.matricula);
    }
    @Test
    @DisplayName("Test de getCoche")
    public void testGetCoche() {
        // Arrange
        String modelo = "LaFerrari";
        String matricula = "SBC 1234";
        Model.crearCoche(modelo, matricula);

        // Act
        Coche coche = Model.getCoche(matricula);

        // Assert
        assertNotNull(coche);
        assertEquals(modelo, coche.modelo);
        assertEquals(matricula, coche.matricula);
    }
    @Test
    @DisplayName("Test de cambiarVelocidad")
    public void testCambiarVelocidad() {
        // Arrange
        String modelo = "LaFerrari";
        String matricula = "SBC 1234";
        Model.crearCoche(modelo, matricula);

        // Act
        int nuevaVelocidad = 100;
        int velocidadCambiada = Model.cambiarVelocidad(matricula, nuevaVelocidad);

        // Assert
        assertEquals(nuevaVelocidad, velocidadCambiada);
    }
    @Test
    @DisplayName("Test de getVelocidad")
    public void testGetVelocidad() {
        // Arrange
        String modelo = "LaFerrari";
        String matricula = "SBC 1234";
        Model.crearCoche(modelo, matricula);

        // Act
        int velocidadEsperada = 0;
        int velocidadObtenida = Model.getVelocidad(matricula);

        // Assert
        assertEquals(velocidadEsperada, velocidadObtenida);
    }
    @Test
    @DisplayName("Test de aumentarVelocidad")
    public void testAumentarVelocidad() {
        // Arrange
        String modelo = "LaFerrari";
        String matricula = "SBC 1234";
        Model.crearCoche(modelo, matricula);

        // Act
        int aumento = 20;
        int velocidadAumentada = Model.aumentarVelocidad(matricula, aumento);

        // Assert
        assertEquals(aumento, velocidadAumentada);
    }
    @Test
    @DisplayName("Test de reducirVelocidad")
    public void testReducirVelocidad() {
        // Arrange
        String modelo = "LaFerrari";
        String matricula = "SBC 1234";
        Model.crearCoche(modelo, matricula);

        // Act
        int reducir = 10;
        int velocidadDisminuida = Model.reducirVelocidad(matricula, reducir);

        // Assert
        assertEquals(-1, velocidadDisminuida);
    }
}