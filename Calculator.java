import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	JFrame jf;
	JLabel displayLabel;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton zeroButton;
	JButton plusButton;
	JButton minusButton;
	JButton multipleButton;
	JButton divisionButton;
	JButton equalButton;
	JButton dotButton,clearButton,delButton,percButton;
	Boolean isoperatorClicked=false;
	JButton buttonPressed;
	String oldValue,operator;
	Float newValueF,oldValueF,result;

	
	public Calculator() {
		 jf = new JFrame("CALCULATOR");
		jf.setLayout(null);
		jf.setSize(550,600);
		jf.setLocation(300,150);
		
		
		displayLabel= new JLabel();
		displayLabel.setBounds(30, 50, 500, 70);
		displayLabel.setBackground(Color.DARK_GRAY);
		displayLabel.setFont(new Font("Imprint MT Shadow", Font.BOLD, 50));
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setBackground(Color.black);
		
		jf.add(displayLabel);

		 sevenButton=new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.setFont(new Font("Imprint MT Shadow", Font.CENTER_BASELINE, 40));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		 eightButton=new JButton("8");
		eightButton.setBounds(130,130,80,80);
		eightButton.setFont(new Font("Imprint MT Shadow", Font.CENTER_BASELINE, 40));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		 nineButton=new JButton("9");
		nineButton.setBounds(230,130,80,80);
		nineButton.setFont(new Font("Imprint MT Shadow", Font.CENTER_BASELINE, 40));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		 fourButton=new JButton("4");
		fourButton.setBounds(30, 240, 80, 80);
		fourButton.setFont(new Font("Imprint MT Shadow", Font.CENTER_BASELINE, 40));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		 fiveButton=new JButton("5");
	    fiveButton.setBounds(130,240,80,80);
	    fiveButton.setFont(new Font("Imprint MT Shadow", Font.CENTER_BASELINE, 40));
	    fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		 sixButton=new JButton("6");
		sixButton.setBounds(230,240,80,80);
		sixButton.setFont(new Font("Imprint MT Shadow", Font.CENTER_BASELINE, 40));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		 oneButton=new JButton("1");
		oneButton.setBounds(30, 350, 80, 80);
		oneButton.setFont(new Font("Imprint MT Shadow", Font.CENTER_BASELINE, 40));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		 twoButton=new JButton("2");
	    twoButton.setBounds(130,350,80,80);
	    twoButton.setFont(new Font("Imprint MT Shadow", Font.CENTER_BASELINE, 40));
	    twoButton.addActionListener(this);
		jf.add(twoButton);
		
		 threeButton=new JButton("3");
		threeButton.setBounds(230,350,80,80);
		threeButton.setFont(new Font("Imprint MT Shadow", Font.CENTER_BASELINE, 40));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		 dotButton=new JButton(".");
		dotButton.setBounds(30, 460, 80, 80);
		dotButton.setFont(new Font("Imprint MT Shadow", Font.BOLD, 40));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
	    zeroButton.setBounds(130,460,80,80);
	    zeroButton.setFont(new Font("Imprint MT Shadow", Font.CENTER_BASELINE, 40));
	    zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		 equalButton=new JButton("=");
		equalButton.setBounds(430,350,80,190);
		equalButton.setFont(new Font("Imprint MT Shadow", Font.CENTER_BASELINE, 40));
		equalButton.setBackground(Color.black);
		equalButton.setForeground(Color.white);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		 divisionButton=new JButton("/");
		divisionButton.setBounds(330,130,80,80);
		divisionButton.setFont(new Font("Imprint MT Shadow", Font.CENTER_BASELINE, 40));
		divisionButton.setBackground(Color.black);
		divisionButton.setForeground(Color.white);
		divisionButton.addActionListener(this);
		jf.add(divisionButton);
		
		 multipleButton=new JButton("x");
		multipleButton.setBounds(330,240,80,80);
		multipleButton.setFont(new Font("Imprint MT Shadow", Font.CENTER_BASELINE, 40));
		multipleButton.setBackground(Color.black);
		multipleButton.setForeground(Color.white);
		multipleButton.addActionListener(this);
		jf.add(multipleButton);
		
		 minusButton=new JButton("-");
		minusButton.setBounds(330,350,80,80);
		minusButton.setFont(new Font("Imprint MT Shadow", Font.CENTER_BASELINE, 55));
		minusButton.setBackground(Color.black);
		minusButton.setForeground(Color.white);
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		 plusButton=new JButton("+");
		plusButton.setBounds(330,460,80,80);
		plusButton.setFont(new Font("Imprint MT Shadow", Font.CENTER_BASELINE, 40));
		plusButton.setBackground(Color.black);
		plusButton.setForeground(Color.white);
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		 percButton=new JButton("%");
		 percButton.setBounds(230,460,80,80);
		 percButton.setFont(new Font("Imprint MT Shadow", Font.CENTER_BASELINE, 34));
		 percButton.setBackground(Color.black);
		 percButton.setForeground(Color.white);
		 percButton.addActionListener(this);
			jf.add(percButton);
		
		 clearButton=new JButton("CLEAR");
			clearButton.setBounds(430,130,80,80);
			clearButton.setFont(new Font("Imprint MT Shadow", Font.CENTER_BASELINE, 12));
			clearButton.setBackground(Color.orange);
			clearButton.setForeground(Color.black);
			clearButton.addActionListener(this);
			jf.add(clearButton);
		 delButton=new JButton("DEL");
		    delButton.setBounds(430,240,80,80);
		    delButton.setFont(new Font("Imprint MT Shadow", Font.CENTER_BASELINE, 12));
		    delButton.setBackground(Color.orange);
		    delButton.setForeground(Color.black);
		    delButton.addActionListener(this);
		    jf.add(delButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		 new Calculator();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==oneButton)
		{
			if (isoperatorClicked) {
				displayLabel.setText("1");
				isoperatorClicked=false;
				
			}else {
			
			displayLabel.setText(displayLabel.getText()+"1");
			}
		}
		else if(e.getSource()==twoButton)
		{
			if(isoperatorClicked) {
				displayLabel.setText("2");
				isoperatorClicked=false;
			}else 
			displayLabel.setText(displayLabel.getText()+"2");
			}
		 
		else if(e.getSource()==threeButton)
		{
			if(isoperatorClicked) {
				displayLabel.setText("3");
				isoperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"3");
			}
		}
		else if(e.getSource()==fourButton)
		{
			if(isoperatorClicked) {
				displayLabel.setText("4");
				isoperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"4");
		
			}
		}
		else if(e.getSource()==fiveButton)
		{
			if(isoperatorClicked) {
				displayLabel.setText("5");
				isoperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"5");
			}
		}
		else if(e.getSource()==sixButton)
		{	
			if(isoperatorClicked)
			{
			displayLabel.setText("6");
			isoperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"6");
			}
		}
		else if(e.getSource()==sevenButton)
		{
			if(isoperatorClicked)
			{
				displayLabel.setText("7");
				isoperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"7");
			}
		}
		else if(e.getSource()==eightButton)
		{
			if(isoperatorClicked)
			{
				displayLabel.setText("8");
				isoperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"8");
			}
		}
		else if(e.getSource()==nineButton)
		{
			if(isoperatorClicked)
			{
				displayLabel.setText("9");
				isoperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"9");
			}
		}
		else if(e.getSource()==zeroButton)
		{
			if(isoperatorClicked)
			{
				displayLabel.setText("0");
				isoperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"0");}
		}
		
		else if(e.getSource()==dotButton)
		{
			if(isoperatorClicked)
			{
		    	displayLabel.setText(".");
				isoperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+".");}
		}
		else if(e.getSource()==equalButton)
		{
			String newValue=displayLabel.getText();
			 newValueF=Float.parseFloat(newValue);
			 oldValueF=Float.parseFloat(oldValue);
		switch(operator)
			 {
			 case "+":
				 result=oldValueF+newValueF;
				 break;
			 case "-":
				 result=oldValueF-newValueF;
				 break;
			 case"*":
				 result=oldValueF*newValueF;
				 break;
			 case"/":
				 result=oldValueF/newValueF;
				 break;
			 case"%":
				 result=oldValueF*newValueF/100;
				 default:
					 displayLabel.setText("null");
			 }
			 displayLabel.setText(result+"");
			}
		else if(e.getSource()==divisionButton)
		{
			isoperatorClicked=true;
			operator="/";
			oldValue=displayLabel.getText();
		}
		else if(e.getSource()==multipleButton)
		{
			isoperatorClicked=true;
			operator="*";
			oldValue=displayLabel.getText();
		}
		else if(e.getSource()==minusButton)
		{
			isoperatorClicked=true;
			operator="-";
			oldValue=displayLabel.getText();
		}
		else if(e.getSource()==plusButton)
		{
			isoperatorClicked=true;
			operator="+";
			oldValue=displayLabel.getText();
		}
		else if(e.getSource()==percButton)
		{
			isoperatorClicked=true;
			operator="%";
			oldValue=displayLabel.getText();
			
		}
		else if(e.getSource()==clearButton)
		{
			displayLabel.setText("");
		}
		else if(e.getSource()==delButton)
		{
			
			String tempstore=displayLabel.getText();
			displayLabel.setText("");
			for(int i=0;i<tempstore.length()-1;i++)
			{
				displayLabel.setText(displayLabel.getText()+tempstore.charAt(i));
			}
		}
	}

}
