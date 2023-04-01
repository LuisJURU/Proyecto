import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista_Ingredientes extends JFrame {

	private JPanel contentPane;
	private JTable Tabla;
	private JTextField txtID;
	private JTextField txtNom;
	private JTextField txtPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista_Ingredientes frame = new Vista_Ingredientes();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vista_Ingredientes() {
		

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos Ingredientes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 212, 405);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 50, 74, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre:\r\n");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(10, 75, 66, 14);
		panel.add(lblNombre);
		
		JLabel lblPrecio = new JLabel("Precio:\r\n\t\t");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrecio.setBounds(10, 100, 74, 14);
		panel.add(lblPrecio);
		
		txtID = new JTextField();
		txtID.setBounds(100, 49, 102, 20);
		panel.add(txtID);
		txtID.setColumns(10);
		
		txtNom = new JTextField();
		txtNom.setColumns(10);
		txtNom.setBounds(100, 74, 102, 20);
		panel.add(txtNom);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(100, 99, 102, 20);
		panel.add(txtPrecio);
		
		JButton btnGuardar = new JButton("GUARDAR\r\n");
		btnGuardar.setBounds(10, 220, 192, 23);
		panel.add(btnGuardar);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
		});
		
		btnEliminar.setBounds(10, 268, 192, 23);
		panel.add(btnEliminar);
		
		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(10, 320, 192, 23);
		panel.add(btnModificar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Listade Ingredientes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(232, 11, 402, 405);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
	
		
		Tabla = new JTable();
		Tabla.setBounds(10, 21, 382, 373);
		panel_1.add(Tabla);
		Ingredientes objetoIngredientes = new Ingredientes();
		objetoIngredientes.MostarIngredientes(Tabla);
	}
	
}
