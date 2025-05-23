package Vista;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Cajero extends JFrame {

    public Cajero() {
        setTitle("Gestion cajero");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana

        // Añadir un componente
        JLabel etiqueta = new JLabel("¡Hola, mundo!");
        add(etiqueta);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Cajero();  // Crear e iniciar la ventana
    }
}
