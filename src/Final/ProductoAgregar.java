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

public class ProductoAgregar extends JPanel {
	private JTextField TFID;
	private JTextField TFNombre;
	private JTextField TFStock;
	private JTextField TFP;

	/**
	 * Create the panel.
	 */
	public ProductoAgregar() {
		setLayout(null);
		
		JPanel PanelCenter = new JPanel();
		PanelCenter.setLayout(null);
		PanelCenter.setBorder(null);
		PanelCenter.setBackground(new Color(30, 30, 30));
		PanelCenter.setBounds(0, 0, 780, 684);
		add(PanelCenter);
		
		JLabel lblProductoagregar = new JLabel("Producto/Agregar");
		lblProductoagregar.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductoagregar.setForeground(Color.WHITE);
		lblProductoagregar.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 28));
		lblProductoagregar.setBackground(new Color(30, 30, 30));
		lblProductoagregar.setBounds(0, 0, 780, 68);
		PanelCenter.add(lblProductoagregar);
		
		JLabel LabelID = new JLabel("ID");
		LabelID.setHorizontalAlignment(SwingConstants.CENTER);
		LabelID.setForeground(new Color(240, 255, 255));
		LabelID.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelID.setBounds(200, 140, 145, 30);
		PanelCenter.add(LabelID);
		
		TFID = new JTextField();
		TFID.setText("Introduzca el ID");
		TFID.setHorizontalAlignment(SwingConstants.CENTER);
		TFID.setForeground(new Color(240, 255, 255));
		TFID.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFID.setColumns(10);
		TFID.setBorder(null);
		TFID.setBackground(new Color(30, 30, 30));
		TFID.setBounds(200, 181, 145, 20);
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
		separator.setBounds(200, 212, 151, 2);
		PanelCenter.add(separator);
		
		JLabel LabelNombre = new JLabel("Nombre");
		LabelNombre.setHorizontalAlignment(SwingConstants.CENTER);
		LabelNombre.setForeground(new Color(240, 255, 255));
		LabelNombre.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelNombre.setBounds(194, 257, 145, 30);
		PanelCenter.add(LabelNombre);
		
		TFNombre = new JTextField();
		TFNombre.setText("Introduzca el Nombre");
		TFNombre.setHorizontalAlignment(SwingConstants.CENTER);
		TFNombre.setForeground(new Color(240, 255, 255));
		TFNombre.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFNombre.setColumns(10);
		TFNombre.setBorder(null);
		TFNombre.setBackground(new Color(30, 30, 30));
		TFNombre.setBounds(194, 298, 145, 20);
		TFNombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFNombre.getText().equals("Introduzca el Nombre")) 
				{
					TFNombre.setText("");
					TFNombre.setForeground(Color.WHITE);
				}
			}
		});
		PanelCenter.add(TFNombre);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(SystemColor.controlDkShadow);
		separator_1.setBounds(194, 329, 151, 2);
		PanelCenter.add(separator_1);
		
		JLabel lblStcok = new JLabel("Stock");
		lblStcok.setHorizontalAlignment(SwingConstants.CENTER);
		lblStcok.setForeground(new Color(240, 255, 255));
		lblStcok.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		lblStcok.setBounds(194, 377, 145, 30);
		PanelCenter.add(lblStcok);
		
		TFStock = new JTextField();
		TFStock.setText("Introduzca el  Stock");
		TFStock.setHorizontalAlignment(SwingConstants.CENTER);
		TFStock.setForeground(new Color(240, 255, 255));
		TFStock.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFStock.setColumns(10);
		TFStock.setBorder(null);
		TFStock.setBackground(new Color(30, 30, 30));
		TFStock.setBounds(164, 418, 187, 20);
		TFStock.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFStock.getText().equals("Introduzca el  Stock")) 
				{
					TFStock.setText("");
					TFStock.setForeground(Color.WHITE);
				}
			}
		});
		PanelCenter.add(TFStock);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBackground(SystemColor.controlDkShadow);
		separator_1_1.setBounds(194, 449, 151, 2);
		PanelCenter.add(separator_1_1);
		
		JLabel LabelDir = new JLabel("Precio");
		LabelDir.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDir.setForeground(new Color(240, 255, 255));
		LabelDir.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelDir.setBounds(481, 140, 145, 30);
		PanelCenter.add(LabelDir);
		
		TFP = new JTextField();
		TFP.setText("Introduzca la Direccion");
		TFP.setHorizontalAlignment(SwingConstants.CENTER);
		TFP.setForeground(new Color(240, 255, 255));
		TFP.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFP.setColumns(10);
		TFP.setBorder(null);
		TFP.setBackground(new Color(30, 30, 30));
		TFP.setBounds(481, 181, 145, 20);
		TFP.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFP.getText().equals("Introduzca la Direccion")) 
				{
					TFP.setText("");
					TFP.setForeground(Color.WHITE);
				}
			}
		});
		PanelCenter.add(TFP);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(Color.BLACK);
		separator_1_1_1.setBackground(SystemColor.controlDkShadow);
		separator_1_1_1.setBounds(481, 212, 151, 2);
		PanelCenter.add(separator_1_1_1);
		
		JLabel LabelCed = new JLabel("Suplidor");
		LabelCed.setHorizontalAlignment(SwingConstants.CENTER);
		LabelCed.setForeground(new Color(240, 255, 255));
		LabelCed.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelCed.setBounds(475, 257, 145, 30);
		PanelCenter.add(LabelCed);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setOrientation(SwingConstants.VERTICAL);
		separator_1_2.setForeground(Color.BLACK);
		separator_1_2.setBackground(SystemColor.controlDkShadow);
		separator_1_2.setBounds(422, 140, 2, 311);
		PanelCenter.add(separator_1_2);
		
		JPanel BTNAgregar = new JPanel();
		BTNAgregar.setLayout(null);
		BTNAgregar.setBorder(null);
		BTNAgregar.setBackground(new Color(30, 30, 30));
		BTNAgregar.setBounds(495, 406, 103, 45);
		PanelCenter.add(BTNAgregar);
		
		JLabel LabelAg = new JLabel("Agregar");
		LabelAg.setHorizontalAlignment(SwingConstants.CENTER);
		LabelAg.setForeground(new Color(240, 255, 240));
		LabelAg.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelAg.setBackground(Color.BLACK);
		LabelAg.setBounds(0, 0, 103, 45);
		BTNAgregar.add(LabelAg);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(475, 301, 151, 17);
		PanelCenter.add(comboBox);

	}

}
