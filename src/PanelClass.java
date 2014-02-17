import java.awt.*;
import java.awt.geom.Line2D;

import javax.swing.*;

class PanelLectii extends JPanel{
	
	double actualX = 0, actualY = 0;
	
// Create a constructor method
  public PanelLectii(){
   super();
   
  }

// The following methods are instance methods.

  public void paintComponent(Graphics g){

	  super.paintComponent(g);
	  
	  actualX = Sistem.wOX / 2;
	  actualY = Sistem.hOY / 2;

      Graphics2D g2 = (Graphics2D) g;
      deseneazaOx(g2);
      deseneazaOy(g2);
      deseneazaSagetiOX(g2);
      deseneazaSagetiOY(g2);
      deseneazaMasurileOX(g2);
      deseneazaMasurileOY(g2);
      
      if(Sistem.deseneazaFCT)
      {
    	  deseneazaFunctiaDeGradul2(g2);
      }
      else
      {
    	  deseneazaFunctiaSinus(g2);
      }
      
}

  
  
  	
  	public void deseneazaOx(Graphics2D g2)
  	{
        Shape lin = new Line2D.Double(Sistem.xOX, Sistem.yOX, 
        								Sistem.xOX + Sistem.wOX, Sistem.yOX);
        g2.draw(lin);
  	}

  	public void deseneazaOy(Graphics2D g2)
  	{
        Shape lin = new Line2D.Double(Sistem.xOY, Sistem.yOY, 
        								Sistem.xOY, Sistem.yOY - Sistem.hOY);
        g2.draw(lin);
  	}

  	public void deseneazaSagetiOX(Graphics2D g2)
  	{
        Shape lin = new Line2D.Double(
    						Sistem.xOX + Sistem.wOX, Sistem.yOX, 
							Sistem.xOX + Sistem.wOX - 15, Sistem.yOX - 10);
        g2.draw(lin);

        lin = new Line2D.Double(
    						Sistem.xOX + Sistem.wOX, Sistem.yOX, 
							Sistem.xOX + Sistem.wOX - 15, Sistem.yOX + 10);
        g2.draw(lin);
  	}

  	public void deseneazaSagetiOY(Graphics2D g2)
  	{
        Shape lin = new Line2D.Double(
    						Sistem.xOY, Sistem.yOY - Sistem.hOY, 
							Sistem.xOY + 10, Sistem.yOY - Sistem.hOY + 15);
        g2.draw(lin);

        lin = new Line2D.Double(
    						Sistem.xOY, Sistem.yOY - Sistem.hOY, 
							Sistem.xOY - 10, Sistem.yOY - Sistem.hOY + 15);
        g2.draw(lin);
  	}

  	
  	public void deseneazaMasurileOX(Graphics2D g2)
  	{
  		///Desenez MM
  		//la dreapta de origine
  		for(int i = Sistem.xOX + Sistem.wOX / 2; i < Sistem.wOX - 12; i+=3)
  		{
  	        Shape lin = new Line2D.Double(
					i, Sistem.yOX - 5, 
					i, Sistem.yOX + 5);
        	g2.draw(lin);
  		}

  		//la stanga de origine
  		for(int i = Sistem.xOX + Sistem.wOX / 2 - 3; i >= 0; i-=3)
  		{
  	        Shape lin = new Line2D.Double(
					i, Sistem.yOX - 5, 
					i, Sistem.yOX + 5);
        	g2.draw(lin);
  		}
  		
  		///Jumate de CM
  		//la dreapta de origine
  		for(int i = Sistem.xOX + Sistem.wOX / 2; i < Sistem.wOX - 12; i+=15)
  		{
  	        Shape lin = new Line2D.Double(
					i, Sistem.yOX - 10, 
					i, Sistem.yOX + 10);
        	g2.draw(lin);
  		}

  		//la stanga de origine
  		for(int i = Sistem.xOX + Sistem.wOX / 2 - 15; i >= 0; i-=15)
  		{
  	        Shape lin = new Line2D.Double(
					i, Sistem.yOX - 10, 
					i, Sistem.yOX + 10);
        	g2.draw(lin);
  		}

  		///Desenez CM
  		//la dreapta de origine
  		for(int i = Sistem.xOX + Sistem.wOX / 2; i < Sistem.wOX - 12; i+=30)
  		{
  	        Shape lin = new Line2D.Double(
					i, Sistem.yOX - 15, 
					i, Sistem.yOX + 15);
        	g2.draw(lin);
  		}

  		//la stanga de origine
  		for(int i = Sistem.xOX + Sistem.wOX / 2 - 30; i >= 0; i-=30)
  		{
  	        Shape lin = new Line2D.Double(
					i, Sistem.yOX - 15, 
					i, Sistem.yOX + 15);
        	g2.draw(lin);
  		}

  	}
  	
  	public void deseneazaMasurileOY(Graphics2D g2)
  	{
  		///Desenez MM
  		//deasupra originii
  		for(int i = Sistem.hOY / 2; i >= 12; i-=3)
  		{
  	        Shape lin = new Line2D.Double(
					actualX - 5, i, 
					actualX + 5, i);
        	g2.draw(lin);
  		}

  		//sub origine
  		for(int i = Sistem.hOY / 2; i <= Sistem.hOY; i+=3)
  		{
  	        Shape lin = new Line2D.Double(
					actualX - 5, i, 
					actualX + 5, i);
        	g2.draw(lin);
  		}

  		///Desenez jumatatea de CM
  		//deasupra originii
  		for(int i = Sistem.hOY / 2; i >= 12; i-=15)
  		{
  	        Shape lin = new Line2D.Double(
					actualX - 10, i, 
					actualX + 10, i);
        	g2.draw(lin);
  		}

  		//sub origine
  		for(int i = Sistem.hOY / 2; i <= Sistem.hOY; i+=15)
  		{
  	        Shape lin = new Line2D.Double(
					actualX - 10, i, 
					actualX + 10, i);
        	g2.draw(lin);
  		}

  		///Desenez CM
  		//deasupra originii
  		for(int i = Sistem.hOY / 2; i >= 12; i-=30)
  		{
  	        Shape lin = new Line2D.Double(
					actualX - 15, i, 
					actualX + 15, i);
        	g2.draw(lin);
  		}

  		//sub origine
  		for(int i = Sistem.hOY / 2; i <= Sistem.hOY; i+=30)
  		{
  	        Shape lin = new Line2D.Double(
					actualX - 15, i, 
					actualX + 15, i);
        	g2.draw(lin);
  		}
  		
  	}

  	
  	public void deseneazaFunctiaDeGradul2(Graphics2D g2)
  	{
  		double lastY = getFuncValue((double)Sistem.intervalST);
  		
  		for(long i = Sistem.intervalST; i < Sistem.intervalDR; i++)
  		{
  			for(long j = i * 30; j < (i + 1) * 30; j++)
  	        {
  				Shape lin = new Line2D.Double(
	  	        		actualX + (j - 1), actualY - lastY * 30,
	  	        		actualX + j , actualY - getFuncValue((double)j / 30) * 30);
	        	g2.draw(lin);
	        	
	        	lastY = getFuncValue((double)j / 30);
//	        	System.out.println(j + " " + lastY * 30);
  	        }
  		}
  	}
  	
  	

  	public void deseneazaFunctiaSinus(Graphics2D g2)
  	{
  		double lastY = Math.sin(Math.toRadians(Sistem.intervalST)) * 30;
  		
  		for(long i = Sistem.intervalST + 1; i < Sistem.intervalDR; i++)
  		{
  	        Shape lin = new Line2D.Double(
  	        		actualX + (i - 1) / 2, Sistem.hOY - actualY - lastY,
  	        		actualX + i / 2, Sistem.hOY - actualY - Math.sin(Math.toRadians(i)) * 30);
        	g2.draw(lin);

      		lastY = Math.sin(Math.toRadians(i)) * 30;
  		}
  	}
  	
  	
  	
  	public double getFuncValue(double intervalST)
  	{
  		return Sistem.a * intervalST * intervalST +
  				Sistem.b * intervalST + Sistem.c;
  	}
  	
  	
}


class PanelSistemCoordonate extends JPanel{
// Create a constructor method
  public PanelSistemCoordonate(){
   super();
   
  }

// The following methods are instance methods.

  public void paintComponent(Graphics g){

	  super.paintComponent(g);
	  
}
}