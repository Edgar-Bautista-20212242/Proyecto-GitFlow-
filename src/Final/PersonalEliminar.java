package Final;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;

public class PersonalEliminar extends JPanel {
	private JTextField TFID;

	Connection Con = null;
	Statement STM= null; 
	ResultSet rs = null; 
	Conexion conexion = new Conexion();

	public PersonalEliminar() {
		setLayout(null);
		
		JPanel PanelCenter = new JPanel();
		PanelCenter.setLayout(null);
		PanelCenter.setBorder(null);
		PanelCenter.setBackground(new Color(30, 30, 30));
		PanelCenter.setBounds(0, 0, 780, 684);
		add(PanelCenter);
		
		JLabel lblPersonalmodificar = new JLabel("Personal/Eliminar");
		lblPersonalmodificar.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonalmodificar.setForeground(Color.WHITE);
		lblPersonalmodificar.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 28));
		lblPersonalmodificar.setBackground(new Color(30, 30, 30));
		lblPersonalmodificar.setBounds(0, 0, 780, 68);
		PanelCenter.add(lblPersonalmodificar);
		
		JLabel LabelEliminar = new JLabel("ID del personal a Eliminar");
		LabelEliminar.setHorizontalAlignment(SwingConstants.CENTER);
		LabelEliminar.setForeground(new Color(240, 255, 255));
		LabelEliminar.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelEliminar.setBounds(295, 222, 184, 30);
		PanelCenter.add(LabelEliminar);
		
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
		

		PanelRound BTNEliminar = new PanelRound();
		BTNEliminar.setRoundBottomLeft(30);
		BTNEliminar.setRoundBottomRight(30);
		BTNEliminar.setRoundTopLeft(30);
		BTNEliminar.setRoundTopRight(30);
		BTNEliminar.setLayout(null);
		BTNEliminar.setBorder(null);
		BTNEliminar.setBackground(new Color(30, 30, 30));
		BTNEliminar.setBounds(323, 333, 103, 45);
		BTNEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				Personal p =new Personal();
				p.setID(Integer.parseInt(TFID.getText()));
				String Query= "Delete From Personal where IdPersonal="+p.getID()+" ";
				try {			
					Con= conexion.conexion(); 
					STM= Con.createStatement();
					STM.executeUpdate(Query); 
					 
					JOptionPane.showMessageDialog(null, "El personal se ha eliminado con exito", "Exito!!", JOptionPane.INFORMATION_MESSAGE);
				} catch (SQLException e1) {
				}finally 
				{
					try {
					if (Con!=null) 
					{
						Con.close();
					}if (STM!=null) 
					{
							STM.close();
						
					}if (rs!=null) 
					{
						rs.close();
					}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}	
				}
				TFID.setText("Introduzca el ID");
			}
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				BTNEliminar.setBackground(new Color(41, 41, 41 ));
			
				
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
			
				BTNEliminar.setBackground(new Color(30,30,30));
			}
		});
		PanelCenter.add(BTNEliminar);
		
		JLabel LabelE = new JLabel("Eliminar");
		LabelE.setHorizontalAlignment(SwingConstants.CENTER);
		LabelE.setForeground(new Color(240, 255, 240));
		LabelE.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelE.setBackground(Color.BLACK);
		LabelE.setBounds(0, 0, 103, 45);
		BTNEliminar.add(LabelE);

	}

}
