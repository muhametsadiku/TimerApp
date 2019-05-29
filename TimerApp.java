
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class TimerApp  {

	JButton Timer;
	JButton Stopwatch;
	
	
	
	TimerApp() {
 
	JFrame f = new JFrame();	
		
 	Timer = new JButton("Timer");
	Stopwatch = new JButton("Stopwatch");
	
	f.add(Timer);
	f.add(Stopwatch);
	
	Timer.addActionListener(new ActionListener() {
        @Override
		public void actionPerformed(ActionEvent e) {
			new TimerB();
		
		}
	});
	
	Stopwatch.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
            new Stopwatch();			
		
		}
	});
	
	Stopwatch.setBounds(350, 100, 200, 30);
	Timer.setBounds(50, 100, 200, 30);
	
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(600,500);
	f.setLayout(null);
	f.setVisible(true);
	f.setTitle("Timer App");
        
	}
	
	public static void main(String[] args) {
	
		new TimerApp();	
	
	}
}