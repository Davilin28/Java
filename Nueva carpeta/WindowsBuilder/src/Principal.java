import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Principal {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] { "elemento1", "elemento2", "elemento3", "elemento4", "elemento5",
					"elemento6", "elemento7", "elemento8" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		frame.getContentPane().add(list, BorderLayout.WEST);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "New column", "New column", "New column", "New column" }));
		frame.getContentPane().add(table, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.EAST);
		panel.setLayout(new GridLayout(3, 1, 0, 0));

		JButton btnCargar = new JButton("Cargar");
		panel.add(btnCargar);

		JButton btnGuardar = new JButton("Guardar");
		panel.add(btnGuardar);

		JButton btnSalir = new JButton("Salir");
		panel.add(btnSalir);

		JLabel lblNewLabel = new JLabel("Imagenes de prueba");
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
	}

}
