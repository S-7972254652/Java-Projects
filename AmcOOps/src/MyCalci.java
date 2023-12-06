import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyCalci implements ActionListener {
JFrame f;
JTextField t;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,beq,bclr,bdel,bdec;
static double a=0,b=0,result;
static int operator=0;
	MyCalci(){
		f=new JFrame("My Calculator");
		f.setVisible(true);
		f.setLayout(null);
		f.setBounds(20,20,270,350);
		f.setSize(600,600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Crate input text field to enter the no
		t=new JTextField();
		t.setBounds(50,40,250,50);
		t.setVisible(true);
		t.setBackground(Color.BLUE);
		t.setForeground(Color.white);
		f.add(t);
		
		//Create Button 1 to 9
		b9=new JButton("9");
		b9.setBounds(50, 100, 80, 40);
		f.add(b9);
		b9.addActionListener(this);
		
		b8=new JButton("8");
		b8.setBounds(130, 100, 80, 40);
		f.add(b8);
		b8.addActionListener(this);
		
		b7=new JButton("7");
		b7.setBounds(210, 100, 80, 40);
		f.add(b7);
		b7.addActionListener(this);
		
		b6=new JButton("6");
		b6.setBounds(50, 150, 80, 40);
		f.add(b6);
		b6.addActionListener(this);
		
		b5=new JButton("5");
		b5.setBounds(130, 150, 80, 40);
		f.add(b5);
		b5.addActionListener(this);
		
		b4=new JButton("4");
		b4.setBounds(210, 150, 80, 40);
		f.add(b4);
		b4.addActionListener(this);
		
		b3=new JButton("3");
		b3.setBounds(50, 200, 80, 40);
		f.add(b3);
		b3.addActionListener(this);
		
		b2=new JButton("2");
		b2.setBounds(130, 200, 80, 40);
		f.add(b2);
		b2.addActionListener(this);
		
		b1=new JButton("1");
		b1.setBounds(210, 200, 80, 40);
		f.add(b1);
		b1.addActionListener(this);
	
		badd=new JButton("+");
		badd.setBounds(50, 250, 80, 40);
		f.add(badd);
		badd.addActionListener(this);
		
		bsub=new JButton("-");
		bsub.setBounds(130, 250, 80, 40);
		f.add(bsub);
		bsub.addActionListener(this);
		
		bmul=new JButton("*");
		bmul.setBounds(210, 250, 80, 40);
		f.add(bmul);
		bmul.addActionListener(this);
		
		
		bdiv=new JButton("/");
		bdiv.setBounds(50, 300, 80, 40);
		f.add(bdiv);
		bdiv.addActionListener(this);
		
		beq=new JButton("=");
		beq.setBounds(130, 300, 80, 40);
		f.add(beq);
		beq.addActionListener(this);
		
		bclr=new JButton("C");
		bclr.setBounds(210, 300, 80, 40);
		f.add(bclr);
		bclr.addActionListener(this);
		
		bdec=new JButton(".");
		bdec.setBounds(50, 350, 80, 40);
		f.add(bdec);
		bdec.addActionListener(this);
		
		b0=new JButton("0");
		b0.setBounds(130, 350, 80, 40);
		f.add(b0);
		b0.addActionListener(this);
		
		bdel=new JButton("DEL");
		bdel.setBounds(210, 350, 80, 40);
		f.add(bdel);
		bdel.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new MyCalci();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bclr) {	
			t.setText("");
		}
		if(e.getSource()==bdel) {	
			String s=t.getText();
			t.setText("");
			
			for(int i=0;i<s.length()-1;i++) 
				t.setText(t.getText()+s.charAt(i));
			
		}
		if(e.getSource()==b1) {
			t.setText(t.getText().concat("1"));
		}
		if(e.getSource()==b2) {
			t.setText(t.getText().concat("2"));
		}
		if(e.getSource()==b3) {
			t.setText(t.getText().concat("3"));
		}
		if(e.getSource()==b4) {
			t.setText(t.getText().concat("4"));
		}
		if(e.getSource()==b5) {
			t.setText(t.getText().concat("5"));
		}
		if(e.getSource()==b6) {
			t.setText(t.getText().concat("6"));
		}
		if(e.getSource()==b7) {
			t.setText(t.getText().concat("7"));
		}
		if(e.getSource()==b8) {
			t.setText(t.getText().concat("8"));
		}
		if(e.getSource()==b9) {
			t.setText(t.getText().concat("9"));
		}
		if(e.getSource()==b0) {
			t.setText(t.getText().concat("0"));
		}
		if(e.getSource()==bdec) {
			t.setText(t.getText().concat("."));
		}
		if(e.getSource()==badd) {
			a=Double.parseDouble(t.getText());
			operator=1;
			t.setText("");
		}
		if(e.getSource()==bsub) {
			a=Double.parseDouble(t.getText());
			operator=2;
			t.setText("");
		}
		if(e.getSource()==bmul) {
			a=Double.parseDouble(t.getText());
			operator=3;
			t.setText("");
		}
		if(e.getSource()==bdiv) {
			a=Double.parseDouble(t.getText());
			operator=4;
			t.setText("");
		}
		if(e.getSource()==beq) {
			a=Double.parseDouble(t.getText());
			switch(operator)
			{
			case 1:result=a+b;
			break;
			case 2:result=a-b;
			break;
			case 3:result=a*b;
			break;
			case 4:result=a/b;
			break;
			}
			t.setText(""+result);
		}
	}
}
