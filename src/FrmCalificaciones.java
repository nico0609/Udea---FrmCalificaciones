import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;


public class FrmCalificaciones extends JFrame {

    private JTable tabla;
    private DefaultTableModel modelo;

    // metodo constructor
    public FrmCalificaciones() {
        setSize(500, 300);
        setTitle("Calificaciones");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel lblNombre = new JLabel("Estudiante:");
        lblNombre.setBounds(10, 10, 100, 20);
        getContentPane().add(lblNombre);

        JLabel lblNota = new JLabel("Porcentaje:");
        lblNota.setBounds(310, 10, 100, 20);
        getContentPane().add(lblNota);

        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(10,40,150,20);
        getContentPane().add(txtNombre);

        JTextField txtNota = new JTextField();
        txtNota.setBounds(310,40,150,20);
        getContentPane().add(txtNota);

        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(10, 70, 80, 20);
        getContentPane().add(btnAgregar);

        JButton btnQuitar = new JButton("Quitar");
        btnQuitar.setBounds(100, 70, 80, 20);
        getContentPane().add(btnQuitar);

        JButton btnAgregar2 = new JButton("Agregar");
        btnAgregar2.setBounds(290, 70, 80, 20);
        getContentPane().add(btnAgregar2);

        JButton btnQuitar2 = new JButton("Quitar");
        btnQuitar2.setBounds(380, 70, 80, 20);
        getContentPane().add(btnQuitar2);

        // Definir modelo de la tabla con encabezados
        modelo = new DefaultTableModel();
        modelo.addColumn("Estudiante");
        modelo.addColumn("Porcentaje");

        // Crear la tabla con el modelo
        tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla); // Para que tenga barra de desplazamiento
        scroll.setBounds(10, 100, 450, 100);
        getContentPane().add(scroll);

        JButton btnPromedio = new JButton("Promedio");
        btnPromedio.setBounds(10, 210, 100, 20);
        getContentPane().add(btnPromedio);

        JButton btnPromediog = new JButton("Promedio General");
        btnPromediog.setBounds(150, 210, 150, 20);
        getContentPane().add(btnPromediog);

        JTextField txtPromedio = new JTextField();
        txtPromedio.setBounds(320,210,100,20);
        getContentPane().add(txtPromedio);

        JButton btnEstudiante = new JButton("Estudiante Mayor Promedio");
        btnEstudiante.setBounds(10,240, 200, 20);
        getContentPane().add(btnEstudiante);

        JTextField txtEstudiante = new JTextField();
        txtEstudiante.setBounds(230,240,210,20);
        getContentPane().add(txtEstudiante);



}

}