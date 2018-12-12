package pack;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calc implements ActionListener {

	private JFrame frame;
	private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b_add,b_sub,b_mul,b_div,b_ans,b_dec,b_clr,b_del,b_mod;
	private JTextField txt;
	private double num1=0,num2=0,ans=0;
	private int t=0;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calc() {
		initialize();
	}

	//Initialize the contents of the frame.
	private void initialize() {
		frame = new JFrame("SIMPLE CALCULATOR");
		frame.setBounds(100, 100, 450, 300);
		frame.setLayout(new GridLayout(5,4,4,4));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b_add=new JButton("+");
		b_sub=new JButton("-");
		b_mul=new JButton("*");
		b_div=new JButton("/");
		b_ans=new JButton("=");
		b_dec=new JButton(".");
		b_clr=new JButton("Clr");
		b_del=new JButton("Del");
		b_mod=new JButton("%");
		txt=new JTextField("");
				
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
		frame.add(b_mod);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b_div);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b_mul);
		frame.add(b0);
		frame.add(b_del);
		frame.add(b_clr);
		frame.add(b_sub);
		frame.add(txt);
		frame.add(b_ans);
		frame.add(b_dec);
		frame.add(b_add);
		
		b1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						txt.setText(txt.getText().concat("1"));
					}
				});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				txt.setText(txt.getText().concat("2"));
			}
		});
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				txt.setText(txt.getText().concat("3"));
			}
		});
		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				txt.setText(txt.getText().concat("4"));
			}
		});
		b5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				txt.setText(txt.getText().concat("5"));
			}
		});
		b6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				txt.setText(txt.getText().concat("6"));
			}
		});
		b7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				txt.setText(txt.getText().concat("7"));
			}
		});
		b8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				txt.setText(txt.getText().concat("8"));
			}
		});
		b9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				txt.setText(txt.getText().concat("9"));
			}
		});
		b0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				txt.setText(txt.getText().concat("0"));
			}
		});
		b_add.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num1=Double.parseDouble(txt.getText());
				txt.setText("");
				t=1;
			}
		});
		b_sub.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num1=Double.parseDouble(txt.getText());
				txt.setText("");
				t=2;
			}
		});
		b_mul.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num1=Double.parseDouble(txt.getText());
				txt.setText("");
				t=3;
			}
		});
		b_div.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num1=Double.parseDouble(txt.getText());
				txt.setText("");
				t=4;
			}
		});
		b_mod.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num1=Double.parseDouble(txt.getText());
				txt.setText("");
				t=5;
			}
		});
		b_dec.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				txt.setText(txt.getText().concat("."));
			}
		});
		b_ans.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num2=Double.parseDouble(txt.getText());
				switch(t)
				{
				case 1:
				{
					ans=num1+num2;
					break;
				}
				case 2:
				{
					ans=num1-num2;
					break;
				}
				case 3:
				{
					ans=num1*num2;
					break;
				}
				case 4:
				{
					ans=num1/num2;
					break;
				}
				case 5:
				{
					ans=num1%num2;
					break;
				}
				}
				txt.setText(""+ans);	
			}
		});
		b_clr.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				txt.setText("");
			}
		});
		b_del.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String str=txt.getText();
				str=str.substring(0, str.length()-1);
				txt.setText(str);
			}
			
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
