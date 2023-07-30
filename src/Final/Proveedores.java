package Final;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Proveedores extends JPanel {
	public JTable table;
	JPanel PanelCenter ;

	private void CambiarPanel(JPanel P) 
	{
		
	    P.setSize(780, 684);
		P.setLocation(0, 0);
		
		PanelCenter.removeAll();
		PanelCenter.add(P,BorderLayout.CENTER);
		PanelCenter.revalidate();
		PanelCenter.repaint();
			
	}
	
	public Proveedores() {
		setLayout(null);
		
		PanelCenter = new JPanel();
		PanelCenter.setLayout(null);
		PanelCenter.setBorder(null);
		PanelCenter.setBackground(new Color(30, 30, 30));
		PanelCenter.setBounds(0, 0, 780, 684);
		add(PanelCenter);
		
		JLabel LabelTop = new JLabel("Proveedores");
		LabelTop.setHorizontalAlignment(SwingConstants.CENTER);
		LabelTop.setForeground(Color.WHITE);
		LabelTop.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 28));
		LabelTop.setBounds(0, 0, 780, 68);
		PanelCenter.add(LabelTop);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.BLACK);
		scrollPane.setForeground(Color.WHITE);
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		scrollPane.setBounds(20, 100, 580, 500);
		PanelCenter.add(scrollPane);
		
		table = new JTable();
		table.setShowVerticalLines(false);
		table.setForeground(Color.WHITE);
		table.setGridColor(Color.WHITE);
		table.setIntercellSpacing(new Dimension(0, 0));
		table.setRowHeight(20);
		table.setRowMargin(0);
		table.setFont(new Font("Poiret One", Font.PLAIN, 16));
		table.setBorder(null);
		table.setBackground(new Color(30,30, 30));
		table.getTableHeader().setBackground(new Color(30,30,30));
		table.getTableHeader().setForeground(Color.WHITE);
		table.getTableHeader().setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		table.getTableHeader().setEnabled(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nombre","RNC", "Telefono", "Direccion"
			}
		));
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		
		PanelRound BTNAgregar = new PanelRound();
		BTNAgregar.setLayout(null);
		BTNAgregar.setRoundTopRight(30);
		BTNAgregar.setRoundTopLeft(30);
		BTNAgregar.setRoundBottomRight(30);
		BTNAgregar.setRoundBottomLeft(30);
		BTNAgregar.setBorder(null);
		BTNAgregar.setBackground(new Color(30, 30, 30));
		BTNAgregar.setBounds(623, 245, 120, 45);
		ImageIcon IAC = new ImageIcon("Media/proveedor.png");
		JLabel LabelAg = new JLabel("Agregar");
		LabelAg.setHorizontalAlignment(SwingConstants.CENTER);
		LabelAg.setForeground(Color.WHITE);
		LabelAg.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelAg.setBounds(0, 0, 120, 45);
		LabelAg.setIcon(new ImageIcon(IAC.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
		BTNAgregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				BTNAgregar.setBackground(new Color(41, 41, 41 ));
				ImageIcon IAC = new ImageIcon("Media/proveedor E.png");
				LabelAg.setIcon(new ImageIcon(IAC.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
				
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				ImageIcon IAC = new ImageIcon("Media/proveedor.png");
				LabelAg.setIcon(new ImageIcon(IAC.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
				BTNAgregar.setBackground(new Color(30,30,30));
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				ProveedorAgregar p = new ProveedorAgregar();
				CambiarPanel(p);
			}
		});
		BTNAgregar.add(LabelAg);
		PanelCenter.add(BTNAgregar);
		
		PanelRound BTNMod = new PanelRound();
		BTNMod.setLayout(null);
		BTNMod.setRoundTopRight(30);
		BTNMod.setRoundTopLeft(30);
		BTNMod.setRoundBottomRight(30);
		BTNMod.setRoundBottomLeft(30);
		BTNMod.setBorder(null);
		BTNMod.setBackground(new Color(30, 30, 30));
		BTNMod.setBounds(623, 314, 120, 45);
		PanelCenter.add(BTNMod);
		ImageIcon ICM= new ImageIcon("Media/ProveedorModificar.png"); 
		JLabel LabelMod = new JLabel("Modificar");
		LabelMod.setHorizontalAlignment(SwingConstants.CENTER);
		LabelMod.setForeground(Color.WHITE);
		LabelMod.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelMod.setBounds(0, 0, 120, 45);
		LabelMod.setIcon(new ImageIcon(ICM.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
		BTNMod.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				BTNMod.setBackground(new Color(41, 41, 41 ));
				ImageIcon ICM= new ImageIcon("Media/ProveedorModificar E.png"); 
				LabelMod.setIcon(new ImageIcon(ICM.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
				
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				ImageIcon ICM= new ImageIcon("Media/ProveedorModificar.png"); 
				LabelMod.setIcon(new ImageIcon(ICM.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
				BTNMod.setBackground(new Color(30,30,30));
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				ProveedorModificar p = new ProveedorModificar();
				CambiarPanel(p);
			}
		});
		BTNMod.add(LabelMod);
		PanelCenter.add(BTNMod);
		
		
		PanelRound BTNEl = new PanelRound();
		BTNEl.setLayout(null);
		BTNEl.setRoundTopRight(30);
		BTNEl.setRoundTopLeft(30);
		BTNEl.setRoundBottomRight(30);
		BTNEl.setRoundBottomLeft(30);
		BTNEl.setBorder(null);
		BTNEl.setBackground(new Color(30, 30, 30));
		BTNEl.setBounds(623, 381, 120, 45);
		ImageIcon ICE = new ImageIcon("Media/ProveedorEliminar.png");
		JLabel LabelEL = new JLabel("Eliminar ");
		LabelEL.setHorizontalAlignment(SwingConstants.CENTER);
		LabelEL.setForeground(Color.WHITE);
		LabelEL.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelEL.setBounds(0, 0, 120, 45);
		LabelEL.setIcon(new ImageIcon(ICE.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH))); 
		BTNEl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				BTNEl.setBackground(new Color(41, 41, 41 ));
				ImageIcon ICE = new ImageIcon("Media/ProveedorEliminar E.png");
				LabelEL.setIcon(new ImageIcon(ICE.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH))); 
				
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				ImageIcon ICE = new ImageIcon("Media/ProveedorEliminar.png");
				LabelEL.setIcon(new ImageIcon(ICE.getImage().getScaledInstance(36, 36, Image.SCALE_SMOOTH))); 
				BTNEl.setBackground(new Color(30,30,30));
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				ProveedorEliminar p = new ProveedorEliminar();
				CambiarPanel(p);
			}
		});
		BTNEl.add(LabelEL);
		PanelCenter.add(BTNEl);
	}
}
