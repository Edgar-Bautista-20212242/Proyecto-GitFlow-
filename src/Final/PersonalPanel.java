package Final;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PersonalPanel extends JPanel {
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
	public PersonalPanel() {
		setLayout(null);
		
		PanelCenter = new JPanel();
		PanelCenter.setLayout(null);
		PanelCenter.setBorder(null);
		PanelCenter.setBackground(new Color(30, 30, 30));
		PanelCenter.setBounds(0, 0, 780, 684);
		add(PanelCenter);
		
		JLabel LabelTop = new JLabel("Personal");
		LabelTop.setBackground(new Color(30, 30, 30));
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
		table.setForeground(new Color(240, 255, 255));
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
				"ID", "Nombre", "Telefono", "Direccion", "Rol", "Cedula"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		
		
		PanelRound BTNAgregar = new PanelRound();
		BTNAgregar.setRoundBottomLeft(30);
		BTNAgregar.setRoundBottomRight(30);
		BTNAgregar.setRoundTopLeft(30);
		BTNAgregar.setRoundTopRight(30);
		BTNAgregar.setBorder(null);
		BTNAgregar.setBackground(new Color(30,30,30));
		BTNAgregar.setBounds(623, 245, 120, 45);
		BTNAgregar.setLayout(null);
		ImageIcon IAG = new ImageIcon("Media/Agregar.png");
		JLabel LabelAg = new JLabel("Agregar");
		LabelAg.setForeground(Color.WHITE);
		LabelAg.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelAg.setHorizontalAlignment(SwingConstants.CENTER);
		LabelAg.setBounds(0, 0, 120, 45);
		LabelAg.setIcon(new ImageIcon(IAG.getImage().getScaledInstance(32,32, Image.SCALE_SMOOTH)));
		BTNAgregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				BTNAgregar.setBackground(new Color(41, 41, 41 ));
				ImageIcon IAG = new ImageIcon("Media/Agregar E.png");
				LabelAg.setIcon(new ImageIcon(IAG.getImage().getScaledInstance(32,32, Image.SCALE_SMOOTH)));
				
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				ImageIcon IAG = new ImageIcon("Media/Agregar.png");
				LabelAg.setIcon(new ImageIcon(IAG.getImage().getScaledInstance(32,32, Image.SCALE_SMOOTH)));
				BTNAgregar.setBackground(new Color(30,30,30));
			}
			@Override
			public void mousePressed(MouseEvent e) 
			{
				PersonalAgregar p = new PersonalAgregar();
				CambiarPanel(p);
			}
		});
		BTNAgregar.add(LabelAg);
		PanelCenter.add(BTNAgregar);
		
		
		PanelRound BTNMod = new PanelRound();
		BTNMod.setRoundBottomLeft(30);
		BTNMod.setRoundBottomRight(30);
		BTNMod.setRoundTopLeft(30);
		BTNMod.setRoundTopRight(30);
		BTNMod.setLayout(null);
		BTNMod.setBorder(null);
		BTNMod.setBackground(new Color(30, 30, 30));
		BTNMod.setBounds(623, 314, 120, 45);
		ImageIcon ICM = new ImageIcon("Media/Editar.png");
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
				ImageIcon ICM = new ImageIcon("Media/Editar E.png");
				LabelMod.setIcon(new ImageIcon(ICM.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
				
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				ImageIcon ICM = new ImageIcon("Media/Editar.png");
				LabelMod.setIcon(new ImageIcon(ICM.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
				BTNMod.setBackground(new Color(30,30,30));
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				PersonalModificar p = new PersonalModificar();
				CambiarPanel(p);
			}
		});
		BTNMod.add(LabelMod);
		PanelCenter.add(BTNMod);
		
		PanelRound BTNEl = new PanelRound();
		BTNEl.setRoundBottomLeft(30);
		BTNEl.setRoundBottomRight(30);
		BTNEl.setRoundTopLeft(30);
		BTNEl.setRoundTopRight(30);
		BTNEl.setLayout(null);
		BTNEl.setBorder(null);
		BTNEl.setBackground(new Color(30, 30, 30));
		BTNEl.setBounds(623, 381, 120, 45);
		PanelCenter.add(BTNEl);
		ImageIcon ICE = new ImageIcon("Media/Eliminar.png");
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
				ImageIcon ICE = new ImageIcon("Media/Eliminar E.png");
				LabelEL.setIcon(new ImageIcon(ICE.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
				
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				ImageIcon ICE = new ImageIcon("Media/Eliminar.png");
				LabelEL.setIcon(new ImageIcon(ICE.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH))); 
				BTNEl.setBackground(new Color(30,30,30));
			}
			@Override
			public void mousePressed(MouseEvent e) 
			{
				PersonalEliminar p = new PersonalEliminar();
				CambiarPanel(p);
			}
		});
		BTNEl.add(LabelEL);

	}
}
