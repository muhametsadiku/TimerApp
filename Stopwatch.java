import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Stopwatch {

	JButton start;
	JButton stop;
	JLabel msg;
	int s ;
    int m;
    int h;
    Timer t= new Timer();
	Stopwatch(){
		JFrame fs = new JFrame();
		
		start = new JButton("Start");
		stop = new JButton("Stop");
		msg = new JLabel();
		
		fs.add(start);
		fs.add(msg);
		fs.add(stop);
		
		start.setBounds(350, 100, 150, 30);
	 	stop.setBounds(100, 100, 150, 30);
	 	msg.setBounds(175, 300, 250, 100);
	 	msg.setFont(new Font("Ariel", Font.BOLD, 45));
		
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
	 		     t.scheduleAtFixedRate(new TimerTask() {
                 
					@Override
					public void run() {
						msg.setText("" + h +" : "+ m+" : "+(s++));
						if(s == 60) {
							m++;
							s = 0;
						}
						
						if(m==60) {
							h++;
							m = 0;
						}
						
					}
	 		     }, 0, 1000);	
			}
		});
		
		stop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
			  t.cancel();
				
			}
			
		});
		  
		   fs.setSize(600,500);
		   fs.setLayout(null);
		   fs.setVisible(true);
		   fs.setTitle("Stopwatch");
	}
}