import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JPanel; 

import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.Panel;

public class CalculadoraGUI extends JFrame implements ActionListener
{
    private JTextField tfNumero = new JTextField(8);
    
    private JButton bSuma, bResta, bMultiplica, bDivide, bIgual, bClear, bPunto;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private JButton bFactorial, bExpo, bRaiz, bCuadrado;
    private JPanel panel1, panel2;
    
    private float n1, n2,resultado;
    private String operacion = "";
    private String strNumero = "";
    private int base, x;
    private boolean punto=false;
    
    public CalculadoraGUI()
    {
        super("Calculadora");
        
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel1.setLayout(new GridLayout(1,2));
        panel2.setLayout(new GridLayout(6,4));
        
        
        panel1.add(tfNumero);
        
        bClear = new JButton("clear");
        panel1.add(bClear);
        
        
        b7 = new JButton("7");
        panel2.add(b7);
        
        b8 = new JButton("8");
        panel2.add(b8);
        
        b9 = new JButton("9");
        panel2.add(b9);
        
        bSuma = new JButton("+");
        panel2.add(bSuma);
        
        b4 = new JButton("4");
        panel2.add(b4);
        
        b5 = new JButton("5");
        panel2.add(b5);
        
        b6 = new JButton("6");
        panel2.add(b6);
        
        bResta = new JButton("-");
        panel2.add(bResta);
        
        b1 = new JButton("1");
        panel2.add(b1);
        
        b2 = new JButton("2");
        panel2.add(b2);
        
        b3 = new JButton("3");
        panel2.add(b3);
        
        bMultiplica = new JButton("x");
        panel2.add(bMultiplica);
        
        b0 = new JButton("0");
        panel2.add(b0);
        
        bPunto = new JButton(".");
        panel2.add(bPunto);
        
        bIgual = new JButton("=");
        panel2.add(bIgual);
        
        bDivide = new JButton("/");
        panel2.add(bDivide);
        
        bFactorial = new JButton("x!");
        panel2.add(bFactorial);
        
        bRaiz = new JButton("sqrt(x)");
        panel2.add(bRaiz);
        
        bCuadrado = new JButton("x^2");
        panel2.add(bCuadrado);
        
        bExpo = new JButton("y^x");
        panel2.add(bExpo);
        
        bClear.addActionListener(this);  
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bSuma.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        bResta.addActionListener(this);
        b3.addActionListener(this);
        b2.addActionListener(this);
        b1.addActionListener(this);
        bMultiplica.addActionListener(this);
        b0.addActionListener(this);
        bPunto.addActionListener(this);
        bIgual.addActionListener(this);
        bFactorial.addActionListener(this);
        bRaiz.addActionListener(this);
        bDivide.addActionListener(this);
        bCuadrado.addActionListener(this);
        bExpo.addActionListener(this);
        
        
        setLayout(new FlowLayout());
        add(panel1);
        add(panel2);
        setSize(350,220);
        setVisible(true);
    }
    
    public JPanel getPanel2()
	{
		
		return panel2;
	}
	
    
    public void actionPerformed(ActionEvent evento)
	{
		
		if(evento.getSource() == b1)
		{
			strNumero="1";
			tfNumero.setText(tfNumero.getText()+strNumero);
		}
		
		if(evento.getSource() == b2)
		{
			strNumero="2";
			tfNumero.setText(tfNumero.getText()+strNumero);
		}
		
			if(evento.getSource() == b3)
		{
			strNumero="3";
			tfNumero.setText(tfNumero.getText()+strNumero);
		}
		
			if(evento.getSource() == b4)
		{
			strNumero="4";
			tfNumero.setText(tfNumero.getText()+strNumero);
		}
		
			if(evento.getSource() == b5)
		{
			strNumero="5";
			tfNumero.setText(tfNumero.getText()+strNumero);
		}
		
			if(evento.getSource() == b6)
		{
			strNumero="6";
			tfNumero.setText(tfNumero.getText()+strNumero);
		}
		
			if(evento.getSource() == b7)
		{
			strNumero="7";
			tfNumero.setText(tfNumero.getText()+strNumero);
		}
		
			if(evento.getSource() == b8)
		{
			strNumero="8";
			tfNumero.setText(tfNumero.getText()+strNumero);
		}
		
			if(evento.getSource() == b9)
		{
			strNumero="9";
			tfNumero.setText(tfNumero.getText()+strNumero);
		}
		
			if(evento.getSource() == b0)
		{
			strNumero="0";
			tfNumero.setText(tfNumero.getText()+strNumero);
		}
		
			if(evento.getSource() == bPunto)
		{
			if(punto==false)
			{
			strNumero=".";
			tfNumero.setText(tfNumero.getText()+strNumero);
			//tfNumero.setText(strNumero);
			punto=true;
			}
			
		}
		
		if(evento.getSource() == bSuma)
		{
			operacion="2";
			n1=Float.parseFloat(tfNumero.getText());
			strNumero="";
			tfNumero.setText("");
			punto=false;
		}
		
			if(evento.getSource() == bResta)
		{
			operacion="3";
			n1=Float.parseFloat(tfNumero.getText());
			strNumero="";
			tfNumero.setText("");
			punto= false;
		}
		
			if(evento.getSource() == bDivide)
		{
			operacion="4";
			n1=Float.parseFloat(tfNumero.getText());
			strNumero="";
			tfNumero.setText("");
			punto=false;
		}
		
		
			if(evento.getSource() == bMultiplica)
		{
			operacion="1";
			n1=Float.parseFloat(tfNumero.getText());
			strNumero="";
			tfNumero.setText("");
			punto=false;
		}
		
		
			if(evento.getSource() == bRaiz)
		{
			n1=Float.parseFloat(tfNumero.getText());
			resultado= (float)Math.sqrt(n1);
			tfNumero.setText(""+resultado);
		}
		
			if(evento.getSource() == bFactorial)
		{
			n1=Float.parseFloat(tfNumero.getText());
			float i=n1-1;
			while (i>=1)
			{	
			n1=n1*i;
			i--;	
			}
			resultado= n1;
			tfNumero.setText(""+resultado);
		}
		
			
		if(evento.getSource() == bExpo)
		{
			operacion="5";
			n1=Float.parseFloat(tfNumero.getText());
			strNumero="";
			tfNumero.setText("");
			punto=false;
		}
		
		if(evento.getSource() == bCuadrado)
		{
			n1=Float.parseFloat(tfNumero.getText());
			resultado= (float)n1*n1;
			tfNumero.setText(""+resultado);
		}
		
		
		if(evento.getSource() == bClear)
		{
				strNumero="";
				tfNumero.setText("");
				n1=0;
				n2=0;
				punto=false;
		}
		
		
		if(evento.getSource() == bIgual)
		{
			if(operacion.equals("1"))
			{
				n2=Float.parseFloat(tfNumero.getText());
				resultado=n1*n2;
				tfNumero.setText(""+resultado);
			}
			
				if(operacion.equals("2"))
			{
				n2=Float.parseFloat(tfNumero.getText());
				resultado=n1+n2;
				tfNumero.setText(""+resultado);
			}
			
				if(operacion.equals("3"))
			{
				n2=Float.parseFloat(tfNumero.getText());
				resultado=n1-n2;
				tfNumero.setText(""+resultado);
			}
				if(operacion.equals("4"))
			{
				n2=Float.parseFloat(tfNumero.getText());
				resultado=(n1/n2);
				tfNumero.setText(""+resultado);
			}
			
				if(operacion.equals("5"))
			{
				n2=Float.parseFloat(tfNumero.getText());
				resultado=(float)Math.pow(n1,n2);
				//n1 = base;
				//for(int i=1;i<=n2-1;i++)
				//{	
				//n1= n1*n1;
				//}
				tfNumero.setText(""+resultado);
			}
		}
		
 }
    public static void main(String args[])
    {
        CalculadoraGUI calculadora = new CalculadoraGUI();
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
