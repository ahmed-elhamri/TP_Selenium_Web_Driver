import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Activite6Test {

    @Test   
    public void testConnexionSuccess() {
        String result = Activite6.testConnexion("user", "password");
        Assertions.assertEquals("Connexion réussie !", result);
    }

    @Test
    public void testConnexionWrongPassword() {
        String result = Activite6.testConnexion("user", "wrongPassword");
        Assertions.assertEquals("Nom d'utilisateur ou mot de passe incorrect.", result);
    }

    @Test
    public void testConnexionEmptyFields() {
        String result = Activite6.testConnexion("", "");
        Assertions.assertEquals("Nom d'utilisateur ou mot de passe incorrect.", result);
    }
}