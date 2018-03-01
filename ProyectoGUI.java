import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProyectoGUI extends JFrame implements ActionListener
{
	private JMenuBar mbPrincipal;
	private JMenu menuCalculos, menuGrados;
	private JMenuItem miFactorial, miGradosCF, miGradosFC, miExponencial, miSalir, miEcuacion,miAudio, miTabla, miCalcu;
	
	private JPanel panel;
	
	private FactorialGUI2 factor= new FactorialGUI2();
	private ExponencialGUI expo= new ExponencialGUI();
	private GradosGUI5 grados= new GradosGUI5();
	private EcuacionGUI3 ecuacion= new EcuacionGUI3();
	private Audio5 audio= new Audio5();
	private TablaGUI2 tabla= new TablaGUI2();

	public ProyectoGUI()throws Exception
	{
		super("App: Audio y Calculos");
		
		//1. Crear Objetos del atributo
		mbPrincipal   = new JMenuBar();
		menuCalculos  = new JMenu("Opciones");
		menuGrados    = new JMenu("Conversion de Grados");
		miFactorial   = new JMenuItem("Factorial de N");
		miExponencial = new JMenuItem("Y = B^X");
		miGradosCF    = new JMenuItem ("G. Centigrados a G. Farenheit");
		miGradosFC    = new JMenuItem ("G. Farenheit a G. Centigrados");
		miEcuacion    = new JMenuItem ("Ecuación Cuadrática");
		miAudio       = new JMenuItem ("Reproducción de Audio");
		miTabla       = new JMenuItem ("Tabla de N");
		miCalcu       = new JMenuItem ("Calculadora");

		miSalir       = new JMenuItem ("Exit");
		
		panel = new JPanel();
		
		//1.2 Colocar el metodo
		miSalir.addActionListener(this);
		miFactorial.addActionListener(this);
		miExponencial.addActionListener(this);
		
		miGradosCF.addActionListener(this);
		miGradosFC.addActionListener(this);
		
		miEcuacion.addActionListener(this);
		miAudio.addActionListener(this);
		miTabla.addActionListener(this);
		miCalcu.addActionListener(this);
		miAudio.addActionListener(this);

		
		//2. Colocar o adicionar los JMenuItem en los JMenu correspondientes
		menuGrados.add(miGradosCF);
		menuGrados.add(miGradosFC);
		
		menuCalculos.add(miFactorial);
		menuCalculos.add(miExponencial);
		menuCalculos.add(menuGrados);
		menuCalculos.add(miEcuacion);
		menuCalculos.add(miAudio);
		menuCalculos.add(miTabla);
		menuCalculos.add(miCalcu);
		menuCalculos.add(miSalir);
		
		//3. Colocar en JMenuBar los Jmenu correspondientes
		mbPrincipal.add(menuCalculos);
		mbPrincipal.add(miAudio);
		//4. Colocar JMenuBar en el JFrame y hacero visible
		setJMenuBar(mbPrincipal);
		setSize(400,300);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == miSalir)
		{
			System.exit(0);
		}
		
		if(e.getSource() == miAudio)
		{
			panel.setVisible(false);
			panel=audio.getPanel2();
			panel.setVisible(true);
			add(panel);
			setVisible(true);
		}
		
		if(e.getSource() == miEcuacion)
		{
			//new EcuacionGUI2
			panel.setVisible(false);
			panel=ecuacion.getPanel2();
			panel.setVisible(true);
			add(panel);
			setVisible(true);
		}
		
		if(e.getSource() == miExponencial)
		{
			//new ExponencialGUI();
			panel.setVisible(false);
			panel=expo.getPanel2();
			panel.setVisible(true);
			add(panel);
			setVisible(true);
			
		}
		
		if(e.getSource() == miFactorial)
		{
			//new FactorialGUI2();
			panel.setVisible(false);
			panel=factor.getPanel2();
			panel.setVisible(true);
			add(panel);
			setVisible(true);
			
		}
		
		if(e.getSource() == miGradosFC)
		{
			//new GradosGUI5();
			panel.setVisible(false);
			panel=grados.getPanel2();
			panel.setVisible(true);
			add(panel);
			setVisible(true);
			
		}
		
		if(e.getSource() == miGradosCF)
		{
			//new GradosGUI5();
			panel.setVisible(false);
			panel=grados.getPanel2();
			panel.setVisible(true);
			add(panel);
			setVisible(true);
			
		}
		
		if(e.getSource() == miTabla)
		{
			panel.setVisible(false);
			panel=tabla.getPanel2();
			panel.setVisible(true);
			add(panel);
			setVisible(true);
		}
		
		if (e.getSource() == miCalcu)
		{
			new CalculadoraGUI();
		}
	}
	
	static public void main (String args[])throws Exception
	{
		new ProyectoGUI();
	}
}