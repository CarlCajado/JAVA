/*
 Crie um programa que desenhe 10 formas preenchidas aleatórias com cores aleatórias, posições e tamanhos (Figura 6.14). Method
paintComponent deve conter um loop que itera 10 vezes. Em cada iteração, o loop deve determinar se deve ser desenhado um retângulo
ou uma oval preenchida, criar uma cor aleatória e escolher as coordenadas e dimensões aleatoriamente. As coordenadas devem ser escolhidas
com base na largura e altura do painel. O comprimento dos lados deve estar limitado à metade da largura ou altura da janela.
*/

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;
public class Interf extends JPanel {
	public void  paintComponent(Graphics g) {
		super.paintComponent(g);
		SecureRandom aleatorio = new SecureRandom();
    	
    	for (int cont =1; cont <=10; cont ++) {
    		int NUM = 1 + aleatorio.nextInt(6);
    	int x = 10 *cont+(cont/2);
    	int y = 10 *cont+(cont/2);
    	int l = 250 - (cont*25) ;
    	int h =250 - (cont*25);
    		
    		switch(NUM) {
    		case 1 :
    			g.setColor(Color.RED);
    			g.fillOval(x, y, l, h);
    			break;
    		case 2 :
    			g.setColor( Color.GREEN );
    			g.fillOval(x, y, l, h);
    			break;
    		case 3 :
    			g.setColor( Color.BLUE);
    			g.fillOval(x, y, l, h);
    			break;
    		case 4 :
    			g.setColor( Color.BLACK );
    			g.fillOval(x, y, l, h);
    			break;
    		case 5 :
    			g.setColor( Color.YELLOW );
    			g.fillOval(x, y, l, h);
    			break;
    		case 6 :
    			g.setColor( Color.PINK );
    			g.fillOval(x, y, l, h);
    			break;
    		}
	   }
	}
}
