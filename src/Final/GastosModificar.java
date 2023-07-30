package Final;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GastosModificar extends JPanel {
	private JTextField TFID;
	private JTextField TFNombre;
	private JTextField TFC;
	private JTextField TFFG;

	/**
	 * Create the panel.
	 */
	public GastosModificar() {
		setLayout(null);
		
		JPanel PanelCenter = new JPanel();
		PanelCenter.setLayout(null);
		PanelCenter.setBorder(null);
		PanelCenter.setBackground(new Color(30, 30, 30));
		PanelCenter.setBounds(0, 0, 780, 684);
		add(PanelCenter);
		
		JLabel lblGastosmodificar = new JLabel("Gastos/Modificar");
		lblGastosmodificar.setHorizontalAlignment(SwingConstants.CENTER);
		lblGastosmodificar.setForeground(Color.WHITE);
		lblGastosmodificar.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 28));
		lblGastosmodificar.setBackground(new Color(30, 30, 30));
		lblGastosmodificar.setBounds(0, 0, 780, 68);
		PanelCenter.add(lblGastosmodificar);
		
		JLabel lblId = new JLabel("ID del gasto a modificar");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setForeground(new Color(240, 255, 255));
		lblId.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		lblId.setBounds(172, 208, 165, 30);
		PanelCenter.add(lblId);
		
		TFID = new JTextField();
		TFID.setText("Introduzca el ID");
		TFID.setHorizontalAlignment(SwingConstants.CENTER);
		TFID.setForeground(new Color(240, 255, 255));
		TFID.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFID.setColumns(10);
		TFID.setBorder(null);
		TFID.setBackground(new Color(30, 30, 30));
		TFID.setBounds(172, 249, 145, 20);
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
		separator.setBounds(172, 280, 151, 2);
		PanelCenter.add(separator);
		
		JLabel LabelNombre = new JLabel("Nombre");
		LabelNombre.setHorizontalAlignment(SwingConstants.CENTER);
		LabelNombre.setForeground(new Color(240, 255, 255));
		LabelNombre.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelNombre.setBounds(166, 325, 145, 30);
		PanelCenter.add(LabelNombre);
		
		TFNombre = new JTextField();
		TFNombre.setText("Introduzca el Nombre");
		TFNombre.setHorizontalAlignment(SwingConstants.CENTER);
		TFNombre.setForeground(new Color(240, 255, 255));
		TFNombre.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFNombre.setColumns(10);
		TFNombre.setBorder(null);
		TFNombre.setBackground(new Color(30, 30, 30));
		TFNombre.setBounds(166, 366, 145, 20);
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
		separator_1.setBounds(166, 397, 151, 2);
		PanelCenter.add(separator_1);
		
		JLabel lblCosto = new JLabel("Costo");
		lblCosto.setHorizontalAlignment(SwingConstants.CENTER);
		lblCosto.setForeground(new Color(240, 255, 255));
		lblCosto.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		lblCosto.setBounds(447, 208, 145, 30);
		PanelCenter.add(lblCosto);
		
		TFC = new JTextField();
		TFC.setText("Introduzca el costo");
		TFC.setHorizontalAlignment(SwingConstants.CENTER);
		TFC.setForeground(new Color(240, 255, 255));
		TFC.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFC.setColumns(10);
		TFC.setBorder(null);
		TFC.setBackground(new Color(30, 30, 30));
		TFC.setBounds(447, 249, 145, 20);
		TFC.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFC.getText().equals("Introduzca el costo")) 
				{
					TFC.setText("");
					TFC.setForeground(Color.WHITE);
				}
			}
		});
		PanelCenter.add(TFC);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(Color.BLACK);
		separator_1_1_1.setBackground(SystemColor.controlDkShadow);
		separator_1_1_1.setBounds(447, 280, 151, 2);
		PanelCenter.add(separator_1_1_1);
		
		JLabel LabelCed = new JLabel("Fecha de Gasto");
		LabelCed.setHorizontalAlignment(SwingConstants.CENTER);
		LabelCed.setForeground(new Color(240, 255, 255));
		LabelCed.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelCed.setBounds(441, 325, 145, 30);
		PanelCenter.add(LabelCed);
		
		TFFG = new JTextField();
		TFFG.setText("Introduzca la fecha");
		TFFG.setHorizontalAlignment(SwingConstants.CENTER);
		TFFG.setForeground(new Color(240, 255, 255));
		TFFG.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		TFFG.setColumns(10);
		TFFG.setBorder(null);
		TFFG.setBackground(new Color(30, 30, 30));
		TFFG.setBounds(441, 366, 145, 20);
		TFFG.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) 
			{
				if(TFFG.getText().equals("Introduzca la fecha")) 
				{
					TFFG.setText("");
					TFFG.setForeground(Color.WHITE);
				}
			}
		});
		PanelCenter.add(TFFG);
		
		JSeparator separator_1_1_1_1 = new JSeparator();
		separator_1_1_1_1.setForeground(Color.BLACK);
		separator_1_1_1_1.setBackground(SystemColor.controlDkShadow);
		separator_1_1_1_1.setBounds(441, 397, 151, 2);
		PanelCenter.add(separator_1_1_1_1);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setOrientation(SwingConstants.VERTICAL);
		separator_1_2.setForeground(Color.BLACK);
		separator_1_2.setBackground(SystemColor.controlDkShadow);
		separator_1_2.setBounds(385, 178, 2, 275);
		PanelCenter.add(separator_1_2);
		
		JPanel BTNAgregar = new JPanel();
		BTNAgregar.setLayout(null);
		BTNAgregar.setBorder(null);
		BTNAgregar.setBackground(new Color(30, 30, 30));
		BTNAgregar.setBounds(334, 464, 103, 45);
		PanelCenter.add(BTNAgregar);
		
		JLabel lblModificar = new JLabel("Modificar");
		lblModificar.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificar.setForeground(new Color(240, 255, 240));
		lblModificar.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		lblModificar.setBackground(Color.BLACK);
		lblModificar.setBounds(0, 0, 103, 45);
		BTNAgregar.add(lblModificar);

	}

}
