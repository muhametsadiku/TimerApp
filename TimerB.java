import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TimerB {
	JButton starttimer;
	JButton stop;
	JLabel display;
	JLabel msg; 
	JLabel msg2;
	JTextField entry_secs;
	JTextField entry_min;
	JTextField entry_hour;
	JTextField TN;
	
	
	public TimerB(){
	
	JFrame ft = new JFrame();
		
	starttimer 	= new JButton("Start");
 	display = new JLabel();
 	msg = new JLabel("Enter countdown time");
 	msg2 = new JLabel("Timer name(Time for)");
 	entry_secs = new JTextField("0");
 	entry_min = new JTextField("0");
 	entry_hour = new JTextField("0");
 	TN = new JTextField();
 			
 	ft.add(starttimer);
 	ft.add(display);
 	ft.add(msg);
 	ft.add(entry_secs);
 	ft.add(entry_min);
 	ft.add(entry_hour);
 	ft.add(TN);
 	ft.add(msg2);
 	
 	msg.setBounds(50, 100, 150, 30);
 	starttimer.setBounds(350, 100, 200, 30);
 	
 	display.setBounds(175, 300, 250, 100);
 	entry_secs.setBounds(300, 100, 50, 40);
 	entry_min.setBounds(250, 100, 50, 40);
 	entry_hour.setBounds(200, 100, 50, 40);
 	TN.setBounds(200, 50, 150, 40);
 	msg2.setBounds(50, 50, 150, 40);
 	starttimer.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			Timer t = new Timer();
 			display.setFont(new Font("Ariel", Font.BOLD, 45));
 			
 		     t.scheduleAtFixedRate(new TimerTask() {
 		     int s= Integer.parseInt(entry_secs.getText());
 		     int m= Integer.parseInt(entry_min.getText());
 		     int h= Integer.parseInt(entry_hour.getText());
 		     int s1= Integer.parseInt(entry_secs.getText());
		     int m1= Integer.parseInt(entry_min.getText());
		     int h1= Integer.parseInt(entry_hour.getText());
 		     String Timer_name = TN.getText();
 				@Override
 				public void run() {
 					display.setText(""+ h + " : "+ m + " : " + (s--));
 					
 					if (s1<0 || m1<0 || h1<0) {
 						JOptionPane.showMessageDialog(null,"Bad input.Seconds, minutes and hours cannot be negative");
 						t.cancel();
 						}
 					else {
 						if(h== 0 && m == 0 && s < 0) {
	 			    		JOptionPane.showMessageDialog(null,"Time " + Timer_name + " ended");
	 						t.cancel();	
 						}
 						if(s < 0) {
 							m--;
 							s = 59;
 							}
 							
 					    if(m < 0) {
 					     	h--;
 							m = 59;
 							}	
 					    
	 			    	
 					}
 					} 
 		}, 0, 1000);
 		}
 	});
 	
 	
		
   ft.setSize(600,500);
   ft.setLayout(null);
   ft.setVisible(true);
   ft.setTitle("Timer");
}	
}