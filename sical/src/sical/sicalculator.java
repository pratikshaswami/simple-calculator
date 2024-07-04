package sical;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//import java.awt.*;
//import java.awt.event.actionlistner;

public class sicalculator extends Frame implements ActionListener {
	//DECLARATION 
	Label principal,rate ,time ,amount , si;
      TextField pitf,rtf,sitf,atf,ttf;
      Button clear, calculate;
      
      
	public sicalculator() {
		this .setVisible(true);
		this.setTitle("sicalculator");
		this.setLayout(null);
         this.setSize(500,500);
         
         //windowclosing
         this.addWindowListener(new WindowAdapter() {
        	 
        	 public void windowClosing(WindowEvent e) {
        		 System.exit(0);
        	 }
         });
         //creating font class object 
         Font f= new Font("consolas",Font.BOLD,20);
         
         // labels 
         principal =new Label("principal");
         principal.setFont(f);
         principal.setBounds(50, 50, 100, 30);
         
         rate =new Label("Rate");
         rate.setFont(f);
         rate.setBounds(50, 100, 100, 30);
         
         time =new Label("Time");
         time.setFont(f);
         time.setBounds(50,150, 100,30);
         
         si=new Label("simple interest");
         si.setFont(f);
         si.setBounds(50, 200, 150, 30);
         
         amount =new Label("Amount");
         amount.setFont(f);
         amount.setBounds(50, 250, 100, 30);
         
         // textfield
         pitf=new TextField();
         pitf.setFont(f);
         pitf.setBounds(200, 50, 200, 40);
         
         rtf=new TextField();
         rtf.setFont(f);
         rtf.setBounds(200, 100, 200,40);
         
         ttf=new TextField();
         ttf.setFont(f);
         ttf.setBounds(200, 150, 200, 40);
         
         sitf=new TextField();
         //making simple interest textfield uneditable
         sitf.setEditable(false);
         sitf.setFont(f);
         sitf.setBounds(200,200,200,50);
         
         atf=new TextField();
         atf.setEditable(false);
         atf.setFont(f);
         atf.setBounds(200,250, 200, 40);
         
         //creating buttons
         clear=new Button("clear");
         clear.setFont(f);
         clear.setBounds(50, 350,100, 40);

         calculate=new Button("calculate");
         calculate.setFont(f);
         calculate.setBounds(200,350, 100, 40);
         // adding labels and textfield
         this.add(principal);
         this.add(rate);
         this.add(time);
         this.add(si);
         this.add(amount);
         this.add(pitf);
         this.add(rtf);
         this.add(ttf);
         this.add(sitf);
         this.add(atf);
         this.add(clear);
         this.add(calculate);
         
          //register buttons with the actionlistener interface 
         clear.addActionListener(this);
         calculate.addActionListener(this);
         
         

	}

	public static void main(String[] args) {
		
      sicalculator si=new sicalculator();
      
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	     Button clickedbutton=(Button) e.getSource();
	      String clickbuttonlabel= clickedbutton.getLabel();
	      if(clickbuttonlabel.equals("calculate")) {
	    	 
			//declaration 
	    	   float p,si,amount;
	    	   int rate,time;
	    	    p= Float.parseFloat(pitf.getText());
	    	    rate= Integer.parseInt(rtf.getText());
	    	    time= Integer.parseInt(ttf.getText());
	    	    //calculating simple interest 
	    	    si=(p*rate*time)/100;
	    	    sitf.setText(Float.toString(si));
	    	    
	    	    amount=p+si;
	    	    atf.setText(Float.toString(amount));
	    	    
	    	 
	    	    
	    	    
	    	    
	      }
	      else {
	    	  pitf.setText("");
	    	  rtf.setText("");
	    	  ttf.setText("");
	    	  sitf.setText("");
	    	  atf.setText("");
	    	  
	      }
	}

}
