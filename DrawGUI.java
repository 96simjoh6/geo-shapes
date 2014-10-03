import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawGUI extends JFrame{

    private JMenuBar meny;
    private JMenu arkiv;
    private JMenu om;
    private JMenuItem avsluta;
    private JMenuItem omSkaparen;
    private JMenuItem hjalp;

    private DrawPanel pdraw;

    public DrawGUI(){
        
        initGUI();
    }


    private void initGUI(){
        
        /*
        *   Inställningar för JFrame objektet
        *
        */
        
        this.setTitle("DrawingGUI");
        this.setSize( 600, 600 );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         /*
            Skapar menyerna
        */
        this.meny = new JMenuBar();
        this.arkiv = new JMenu("Arkiv");
        this.om = new JMenu("Om");
        this.avsluta = new JMenuItem("Avsluta programmet");
        this.omSkaparen = new JMenuItem("Om skaparen");
        this.hjalp = new JMenuItem("Hjälp");
        
        this.setJMenuBar(meny);
        this.meny.add(arkiv);
        this.meny.add(om);
        this.arkiv.add(avsluta);
        this.om.add(omSkaparen);
        this.om.add(hjalp);
        
        this.avsluta.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
        this.omSkaparen.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, 
                        "Copyright:...");
            }
        });
	
	pdraw = new DrawPanel();
	this.add(pdraw);
	
    }
	
	private class DrawPanel extends JPanel{
	    public DrawPanel(){
		super();
	    }
	    protected void painComponent(Graphics g){
		super.paintComponent(g);
	    }
	}


    public static void main(String[] args ) {
        
        //Följande rader säkrar att GUI:et startar i EDT
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrawGUI().setVisible(true);
            }
        });
    }

}
