import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.util.*;

public class CronoMain implements KeyListener { 
	//Called
	//1st
	JFrame frame = new JFrame("Crono");
	JPanel MaterialPanel = new JPanel();
	JPanel inputcmd = new JPanel();
	JTextField typecmd = new JTextField("  ");
	JScrollPane  scroll = new JScrollPane();
	JLabel repo;
	int row = 1;
	//int DelayClock = 1000; // 5 second
	
	
	
	CronoMain() 
	{
		frame.setLayout(null);
		//Body and function
		
		//Adder
		frame.add(MaterialPanel); /*Commands*/ MaterialPanel.setBackground(Color.black); /*Bounds*/ MaterialPanel.setBounds(10,25,1160,550); /*Layout*/ MaterialPanel.setLayout(null);
		frame.add(inputcmd); /*input commands*/ inputcmd.setBackground(Color.blue); /*Bounds*/ inputcmd.setBounds(10,575,1160,28); /*Layout*/ inputcmd.setLayout(null);
		MaterialPanel.add(repo = new JLabel("...")); /*Default Color*/ repo.setForeground(Color.GREEN); /*Bounds*/ 
		MaterialPanel.add(scroll); /*Color*/ scroll.getViewport().setBackground(Color.black); /*Bounds*/scroll.setBounds(0,0,1160,550); /*Layout*/ 
		//type Cmd Properties
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		inputcmd.add(typecmd); /*Bounds*/ typecmd.setBounds(50,0,500,28); /*Font*/typecmd.setForeground(Color.GREEN.darker());
		
		 //try
		  
		 //function
		scroll.add();
		typecmd.addKeyListener(this); // Enter to Interact
	
		
		
		
		
	}
	void Respo() throws InterruptedException 
	{

		String data = typecmd.getText();
		//Function And Properties
		
		int count_tick =0;
		while(true) 
		{
			count_tick += 1;
			
			int x = 0; int y =row;
			scroll.add(repo = new JLabel(data));
			repo.setBounds(x,y,100,20);
			repo.setForeground(Color.green);
			
			int pop_new_row = 20;
			row += pop_new_row;
			
			System.out.println("Tick in "+"["+count_tick+"] "+data);
			break;
		}
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		//Call GameMain
		CronoMain mp = new CronoMain();
		//Properties GameMain
		mp.frame.setSize(1200,700);
		mp.frame.setVisible(true);
		mp.frame.setResizable(false);
		mp.frame.getContentPane().setBackground(Color.gray);
		mp.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	//Key Listener
	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void keyReleased(KeyEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO uto-generated method stub
			int key = e.getKeyCode();
			if(key == KeyEvent.VK_ENTER) 
			{
				System.out.println("Response");
				try {
					Respo();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
	}
	

}
