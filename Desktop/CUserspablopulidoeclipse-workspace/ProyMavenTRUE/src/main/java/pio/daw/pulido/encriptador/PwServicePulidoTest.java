package pio.daw.pulido.encriptador;


public class PwServicePulidoTest {
    public static void main(String[] args) {
        PwServicePulido servicio = new PwServicePulido();
        String password = "miSuperPassword";
        String passwordEncriptada = servicio.encriptarContrasena(password);

        System.out.println("Prueba de alumno Pablo Pulido:");
        System.out.println("La contraseña encriptada es: " + passwordEncriptada);

        // Verificar la contraseña
        boolean esValida = servicio.verificarContrasena(password, passwordEncriptada);
        System.out.println("La contraseña encriptada es válida: " + esValida);
    }

}
