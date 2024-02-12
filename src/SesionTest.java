package ejercicio3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SesionTest {
    @Test
    public void testLoginSuccess1() {
        Sesion sesion = new Sesion();
        assertTrue(sesion.login("dmunuera", "123456"));
    }

    @Test
    public void testLoginSuccess2() {
        Sesion sesion = new Sesion();
        assertTrue(sesion.login("pepe", "654321"));
    }

    @Test
    public void testLoginFailure1() {
        Sesion sesion = new Sesion();
        assertFalse(sesion.login("dmunuera", "contraseñaIncorrecta"));
    }

    @Test
    public void testLoginFailure2() {
        Sesion sesion = new Sesion();
        assertFalse(sesion.login("usuarioInexistente", "contraseñaInexistente"));
    }
}
