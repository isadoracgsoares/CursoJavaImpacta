package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;



public class MinhaJanela extends JFrame{
	
	public MinhaJanela() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Minha primeira janela!");
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		
		Container painelJanela = this.getContentPane();
		painelJanela.setBackground(Color.CYAN);
		
		//adicionando componetes manualmente, ou seja, sem gereniadores layout
		painelJanela.setLayout(null);
		
		JButton btnMudaCor = new JButton("Muda Cor");
		btnMudaCor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				painelJanela.setBackground(Color.BLUE);				
			}
		});
		btnMudaCor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				painelJanela.setBackground(Color.YELLOW);	
			}
		});
			
		btnMudaCor.setBounds(200,200,100,60);
		painelJanela.add(btnMudaCor);
		
	}
}