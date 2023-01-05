package com.ezlstudios.graficos;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.elzstudios.main.Game;

public class UI {

	public void render(Graphics g) {
		g.setColor(Color.white);
		g.setFont(new Font("arial",Font.BOLD,18));
		g.drawString("Ma��s: "+Game.frutas_atual+"/"+Game.frutas_contagem, 30,30);
	}
	
}
