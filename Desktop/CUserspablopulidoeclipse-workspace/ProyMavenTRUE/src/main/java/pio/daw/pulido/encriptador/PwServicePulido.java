package pio.daw.pulido.encriptador;

import org.jasypt.util.password.BasicPasswordEncryptor;

public class PwServicePulido {
    private BasicPasswordEncryptor passwordEncryptor;

    public PwServicePulido() {
        passwordEncryptor = new BasicPasswordEncryptor();
    }

    public String encriptarContrasena(String contrasena) {
        return passwordEncryptor.encryptPassword(contrasena);
    }

    public boolean verificarContrasena(String contrasena, String contrasenaEncriptada) {
        return passwordEncryptor.checkPassword(contrasena, contrasenaEncriptada);
    }
}
