package myfirstproject;
import java.awt.Color;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	boolean isOperatorClicked=false;
	JFrame jf;
	JLabel displaylabel;
	String oldValue;
	String operatorClicked="";
	
	

	JButton divButton=new JButton("÷"),multipleButton=new JButton("×");JButton abstractButton=new JButton("-"),aditionButton=new JButton("+");
	JButton sevenButton =new JButton("7"),sixButton=new JButton("6"),oneButton=new JButton("1"),twoButton=new JButton("2"),threeButton=new JButton("3"),clearButton=new JButton("CLEAR");
	JButton eightButton =new JButton("8"),nineButton=new JButton("9"),fourButton=new JButton("4"),fiveButton=new JButton("5"),dotButton=new JButton("."),zeroButton=new JButton("0"),equalButton=new JButton("=");
	
		
	
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(500,700);
		jf.setLocation(300, 150);
		
		displaylabel=new JLabel();
		displaylabel.setBounds(30,50, 400, 60);
		displaylabel.setFont(new Font("Courier",Font.PLAIN,30));
		displaylabel.setBackground(Color.gray);
        displaylabel.setOpaque(true);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setForeground(Color.white);
		jf.add(displaylabel);
		
		
		
		
		
		

		
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.addActionListener(this);
		sevenButton.setBackground(Color.WHITE);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(sevenButton);
		
		
		eightButton.setBounds(130,130, 80, 80);
		eightButton.addActionListener(this);
		eightButton.setBackground(Color.WHITE);
		eightButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(eightButton);
		
		
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.addActionListener(this);
		nineButton.setBackground(Color.WHITE);
		nineButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(nineButton);
		
		
		
		
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.addActionListener(this);
		fourButton.setBackground(Color.WHITE);
		fourButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(fourButton);
		
		
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.addActionListener(this);
		fiveButton.setBackground(Color.WHITE);
		fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(fiveButton);
		
		
		
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.addActionListener(this);
		sixButton.setBackground(Color.WHITE);
	    sixButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(sixButton);
		
		
		oneButton.setBounds(30, 330, 80, 80);
		oneButton.addActionListener(this);
		oneButton.setBackground(Color.WHITE);
		oneButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(oneButton);
		
		
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.addActionListener(this);
		twoButton.setBackground(Color.WHITE);
		twoButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(twoButton);
		
		
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.addActionListener(this);
		threeButton.setBackground(Color.WHITE);
		threeButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(threeButton);
		
		
		dotButton.setBounds(30, 430, 80, 80);
		dotButton.addActionListener(this);
		dotButton.setBackground(Color.WHITE);
		dotButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(dotButton);
		
		
		zeroButton.setBounds(130, 430, 80, 80);
		zeroButton.addActionListener(this);
		zeroButton.setBackground(Color.WHITE);
		zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(zeroButton);
		
	
		equalButton.setBounds(230, 430, 80, 80);
		equalButton.addActionListener(this);
		equalButton.setBackground(Color.ORANGE);
		equalButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(equalButton);
		
		
		divButton.setBounds(330, 130, 80, 80);
		divButton.addActionListener(this);
		divButton.setBackground(Color.red);
		divButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(divButton);
		
		
		multipleButton.setBounds(330, 230, 80, 80);
		multipleButton.addActionListener(this);
		multipleButton.setBackground(Color.red);
		multipleButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(multipleButton);
		


		abstractButton.setBounds(330, 330, 80, 80);
		abstractButton.addActionListener(this);
		abstractButton.setBackground(Color.red);
		abstractButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(abstractButton);
		
		

		aditionButton.setBounds(330,430, 80, 80);
		aditionButton.addActionListener(this);
		aditionButton.setBackground(Color.red);
		aditionButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(aditionButton);
		
		
		clearButton.setBounds(30, 530, 380, 80);
		clearButton.addActionListener(this);
		clearButton.setBackground(Color.WHITE);
		clearButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(clearButton);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String ag[]) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			if(isOperatorClicked) {
				displaylabel.setText("7");
				isOperatorClicked=false;
			}else {
				
			
			displaylabel.setText(displaylabel.getText()+"7");
			}
		}else if (e.getSource()==eightButton) {
			if(isOperatorClicked) {
				displaylabel.setText("8");
				isOperatorClicked=false;
			}else {
				
			
			displaylabel.setText(displaylabel.getText()+"8");
			}
		
			
		}else if (e.getSource()==nineButton) {
			if(isOperatorClicked) {
				displaylabel.setText("9");
				isOperatorClicked=false;
			}else {
				
			
			displaylabel.setText(displaylabel.getText()+ "9");
			}
		}else if (e.getSource()==fourButton) {
			if(isOperatorClicked) {
				displaylabel.setText("4");
				isOperatorClicked=false;
			}else {
				
			
			displaylabel.setText(displaylabel.getText()+"4");
			}
		}else if (e.getSource()==fiveButton) {
			if(isOperatorClicked) {
				displaylabel.setText("5");
				isOperatorClicked=false;
			}else {
				
			
			displaylabel.setText(displaylabel.getText()+"5");
			}
		}else if (e.getSource()==sixButton) {
			if(isOperatorClicked) {
				displaylabel.setText("6");
				isOperatorClicked=false;
			}else {
				
			
			displaylabel.setText(displaylabel.getText()+"6");
			}
		}else if (e.getSource()==oneButton) {
			if(isOperatorClicked) {
				displaylabel.setText("1");
				isOperatorClicked=false;
			}else {
				
			
			displaylabel.setText(displaylabel.getText()+"1");
			}
		}else if (e.getSource()==twoButton) {
			if(isOperatorClicked) {
				displaylabel.setText("2");
				isOperatorClicked=false;
			}else {
				
			
			displaylabel.setText(displaylabel.getText()+"2");
			}
		}else if (e.getSource()==threeButton) {
			if(isOperatorClicked) {
				displaylabel.setText("3");
				isOperatorClicked=false;
			}else {
				
			
			displaylabel.setText(displaylabel.getText()+"3");
			}
		}else if (e.getSource()==zeroButton) {
			if(isOperatorClicked) {
				displaylabel.setText("0");
				isOperatorClicked=false;
			}else {
				
			
			displaylabel.setText(displaylabel.getText()+"0");
			}
		}else if (e.getSource()==dotButton) {
			if(isOperatorClicked) {
				displaylabel.setText(".");
				isOperatorClicked=false;
			}else {
				
			
			displaylabel.setText(displaylabel.getText()+".");
			}
			
		}else if (e.getSource()==divButton) {
			isOperatorClicked=true;
			oldValue=displaylabel.getText();
			operatorClicked="/";
		
		
		}else if (e.getSource()==multipleButton) {
			isOperatorClicked=true;
			oldValue=displaylabel.getText();
			operatorClicked="*";
		
			
		}else if (e.getSource()==abstractButton) {
			isOperatorClicked=true;
			oldValue=displaylabel.getText();
			operatorClicked="-";
			
			
		}else if (e.getSource()==aditionButton) {
			isOperatorClicked=true;
			oldValue=displaylabel.getText();
			operatorClicked="+";
		
			
		}else if (e.getSource()==equalButton) {
			
			String newValue=displaylabel.getText();
		

			float oldValF=Float.parseFloat(oldValue);
            float newValF=Float.parseFloat(newValue);
            
            float result=0; 
            if(operatorClicked.equals("+")) {
            	result=oldValF+newValF;
            }else if(operatorClicked.equals("-")) {
            	result=oldValF-newValF;
            }else if(operatorClicked.equals("*")) {
            	result=oldValF*newValF;
            }else if(operatorClicked.equals("/")) {
            	if(newValF==0) {
            		displaylabel.setText("ERROR");
            		return;
            	}
            	result=oldValF/newValF;
            	
            }
            displaylabel.setText(result+"");
            		
            	
            
            
            
            
            
	   }else if(e.getSource()==clearButton)	{
			displaylabel.setText("");
		}
	
		
		
	}

}
