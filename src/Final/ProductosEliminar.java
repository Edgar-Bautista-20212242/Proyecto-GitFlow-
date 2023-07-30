package Final;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ProductosEliminar extends JPanel {
	private JTextField TFID;

	/**
	 * Create the panel.
	 */
	public ProductosEliminar() {
		setLayout(null);
		
		JPanel PanelCenter = new JPanel();
		PanelCenter.setLayout(null);
		PanelCenter.setBorder(null);
		PanelCenter.setBackground(new Color(30, 30, 30));
		PanelCenter.setBounds(0, 0, 780, 684);
		add(PanelCenter);
		
		JLabel lblProductoeliminar = new JLabel("Producto/Eliminar");
		lblProductoeliminar.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductoeliminar.setForeground(Color.WHITE);
		lblProductoeliminar.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 28));
		lblProductoeliminar.setBackground(new Color(30, 30, 30));
		lblProductoeliminar.setBounds(0, 0, 780, 68);
		PanelCenter.add(lblProductoeliminar);
		
		JLabel lblIdDelProducto = new JLabel("ID del producto a Eliminar");
		lblIdDelProducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdDelProducto.setForeground(new Color(240, 255, 255));
		lblIdDelProducto.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		lblIdDelProducto.setBounds(295, 222, 184, 30);
		PanelCenter.add(lblIdDelProducto);
		
		TFID = new JTextField();
		TFID.setText("Introduzca el ID");
		TFID.setHorizontalAlignment(SwingConstants.CENTER);
		TFID.setForeground(new Color(240, 255, 255));
		TFID.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFID.setColumns(10);
		TFID.setBorder(null);
		TFID.setBackground(new Color(30, 30, 30));
		TFID.setBounds(301, 263, 145, 20);
		TFID.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFID.getText().equals("Introduzca el ID")) 
				{
					TFID.setText("");
					TFID.setForeground(Color.WHITE);
				}
			}
		});
		PanelCenter.add(TFID);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(SystemColor.controlDkShadow);
		separator.setBounds(301, 294, 151, 2);
		PanelCenter.add(separator);
		
		JPanel BTNModificar = new JPanel();
		BTNModificar.setLayout(null);
		BTNModificar.setBorder(null);
		BTNModificar.setBackground(new Color(30, 30, 30));
		BTNModificar.setBounds(323, 333, 103, 45);
		PanelCenter.add(BTNModificar);
		
		JLabel LabelModificar = new JLabel("Eliminar");
		LabelModificar.setHorizontalAlignment(SwingConstants.CENTER);
		LabelModificar.setForeground(new Color(240, 255, 240));
		LabelModificar.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelModificar.setBackground(Color.BLACK);
		LabelModificar.setBounds(0, 0, 103, 45);
		BTNModificar.add(LabelModificar);

	}

}
