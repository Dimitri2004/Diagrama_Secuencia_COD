import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ViewTest {
    @Test
    @DisplayName( "Test de View")
    public void testView() {
        // Arrange
        String modelo = "LaFerrari";
        String matricula = "SBC 1234";
        Model.crearCoche(modelo, matricula);
        int velocidad = 100;
        Model.cambiarVelocidad(matricula, velocidad);
        View.muestraVelocidad(matricula, velocidad);

        // Asserts equals
        Coche coche = Model.getCoche(matricula);
        assertEquals(modelo, coche.modelo);
        assertEquals(matricula, coche.matricula);
        assertEquals(velocidad, coche.velocidad);

    }

}
