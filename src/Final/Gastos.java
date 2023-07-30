package Final;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class Gastos extends JPanel {
	private JTable table;
	JPanel PanelCenter;

	private void CambiarPanel(JPanel P) 
	{
		
	    P.setSize(780, 684);
		P.setLocation(0, 0);
		
		PanelCenter.removeAll();
		PanelCenter.add(P,BorderLayout.CENTER);
		PanelCenter.revalidate();
		PanelCenter.repaint();
			
	}
	
	
	public Gastos() {
		setLayout(null);
		
		PanelCenter = new JPanel();
		PanelCenter.setLayout(null);
		PanelCenter.setBorder(null);
		PanelCenter.setBackground(new Color(30, 30, 30));
		PanelCenter.setBounds(0, 0, 780, 684);
		add(PanelCenter);
		
		JLabel lblGastos = new JLabel("Gastos");
		lblGastos.setHorizontalAlignment(SwingConstants.CENTER);
		lblGastos.setForeground(Color.WHITE);
		lblGastos.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 28));
		lblGastos.setBounds(0, 0, 780, 68);
		PanelCenter.add(lblGastos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.BLACK);
		scrollPane.setForeground(Color.WHITE);
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		scrollPane.setBounds(20, 100, 580, 500);
		PanelCenter.add(scrollPane);
		
		table = new JTable();
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
				"ID", "Nombre", "Costo", "FechaGasto"
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
		ImageIcon ICA = new ImageIcon("Media/GastosAgregar.png");
		JLabel LabelAg = new JLabel("Agregar");
		LabelAg.setHorizontalAlignment(SwingConstants.CENTER);
		LabelAg.setForeground(Color.WHITE);
		LabelAg.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelAg.setBounds(0, 0, 120, 45);
		LabelAg.setIcon(new ImageIcon(ICA.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
		BTNAgregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				BTNAgregar.setBackground(new Color(41, 41, 41 ));
				ImageIcon ICA = new ImageIcon("Media/GastosAgregar E.png");
				LabelAg.setIcon(new ImageIcon(ICA.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
				
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				ImageIcon ICA = new ImageIcon("Media/GastosAgregar.png");
				LabelAg.setIcon(new ImageIcon(ICA.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
				BTNAgregar.setBackground(new Color(30,30,30));
			}
			@Override
			public void mousePressed(MouseEvent e) 
			{
				GastosAgregar p = new GastosAgregar();
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
		ImageIcon ICM = new ImageIcon("Media/GastosEditar.png");
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
				ImageIcon ICM = new ImageIcon("Media/GastosEditar E.png");
				LabelMod.setIcon(new ImageIcon(ICM.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
				
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				ImageIcon ICM = new ImageIcon("Media/GastosEditar.png");
				LabelMod.setIcon(new ImageIcon(ICM.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
				BTNMod.setBackground(new Color(30,30,30));
			}
			@Override
			public void mousePressed(MouseEvent e) 
			{
				GastosModificar p = new GastosModificar();
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
		ImageIcon ICE= new ImageIcon("Media/GastosEliminar.png");
		JLabel LabelEL = new JLabel("Eliminar ");
		LabelEL.setHorizontalAlignment(SwingConstants.CENTER);
		LabelEL.setForeground(Color.WHITE);
		LabelEL.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelEL.setBounds(0, 0, 120, 45);
		LabelEL.setIcon(new ImageIcon(ICE.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
		BTNEl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				BTNEl.setBackground(new Color(41, 41, 41 ));
				ImageIcon ICE= new ImageIcon("Media/GastosEliminar E.png");
				LabelEL.setIcon(new ImageIcon(ICE.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
				
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				ImageIcon ICE= new ImageIcon("Media/GastosEliminar.png");
				LabelEL.setIcon(new ImageIcon(ICE.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
				BTNEl.setBackground(new Color(30,30,30));
			}
			@Override
			public void mousePressed(MouseEvent e) 
			{
				GastosEliminar p = new GastosEliminar();
				CambiarPanel(p);
			}
		});
		BTNEl.add(LabelEL);
		PanelCenter.add(BTNEl);

	}
}
