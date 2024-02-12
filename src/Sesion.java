package ejercicio3;
import java.io.*;
import java.nio.file.Path;

public class Sesion {
    public boolean login(String username, String password) {
        File file = new File("./assets/usuarios.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("#");
                if (parts[0].equals(username) && parts[1].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
