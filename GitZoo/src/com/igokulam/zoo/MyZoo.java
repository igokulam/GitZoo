package com.igokulam.zoo;

import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
<applet code="AnimalZoo" width = 1200 height = 1000>
</applet>
*/
public class MyZoo extends Applet implements ActionListener
{   
	private static final long serialVersionUID = 100;
	static String PICTURE_FILE_ZOO = "../images/zoo.jpg";
	
    Button elephantButton = new Button("Elephant");
    Button lionButton     = new Button("Lion");
	Button tigerButton    = new Button("Tiger");
	Button catButton      = new Button("Cat");
	Button shepardButton  = new Button("Shepard");
    Button terrierButton  = new Button("Terrier");
    Button cheetahButton  = new Button("Cheetah");
    Button parrotButton  = new Button("Parrot");
    Button sakethButton  = new Button("Saketh");
    Button sharkButton  = new Button("Shark");
    Button crocodileButton  = new Button("Crocodile");
    Button homeButton = new Button("Home");
    Button zebraButton = new Button("Zebra");
    
    Image currImage = null; 
    String currText = null;
    
    public void init()
    {
    	setSize(1200, 1000);
    	add(homeButton);
		add(elephantButton);
        add(lionButton);
        add(tigerButton);
        add(catButton);
        add(shepardButton);
        add(terrierButton);
        add(cheetahButton);
        add(parrotButton);
        add(sharkButton);
        add(crocodileButton);
        add(sakethButton);
        add(zebraButton);
        
        currText = "=========== My Zoo ============"; 
        
        
        homeButton.addActionListener(this);
		elephantButton.addActionListener(this);
		lionButton.addActionListener(this);
		tigerButton.addActionListener(this);
		catButton.addActionListener(this);
		shepardButton.addActionListener(this);
		terrierButton.addActionListener(this);
		cheetahButton.addActionListener(this);
		sharkButton.addActionListener(this);
		zebraButton.addActionListener(this);
        
    }

    public String getAppletInfo()
    {
        return "Hare Krsna.. We are in a Zoo!";
    }

    public void start() { 
    	currImage = getImage(getDocumentBase(), PICTURE_FILE_ZOO);
        showStatus(getAppletInfo());
    }

    public void paint(Graphics g)
    {
    	g.drawImage(currImage, 0, 0, this);
    	g.drawString(currText, 500, 100);
    }
    
    public void actionPerformed(ActionEvent e){

		if (e.getSource() == elephantButton) 
			showAnimal(new Elephant("Gajendra"));
		else if (e.getSource() == zebraButton)
			showAnimal(new Zebra("Marty"));
		else if (e.getSource() == lionButton)
			showAnimal(new Lion("Mountain Lion"));
		else if (e.getSource() == tigerButton)
			showAnimal(new Tiger("Snow Leopard"));
		else if (e.getSource() == catButton)
			showAnimal(new Cat("Jimmy"));
		else if (e.getSource() == shepardButton)
			showAnimal(new Shepard("Joe"));
		else if (e.getSource() == terrierButton)
			showAnimal(new Terrier("John"));
		else if (e.getSource() == cheetahButton)
			showAnimal (new Cheetah("Yellowfang"));
		else if (e.getSource() == sharkButton)
			showAnimal (new Shark("Bruce"));
		else if (e.getSource() == homeButton) {
			currImage      = getImage(getDocumentBase(), PICTURE_FILE_ZOO);
			repaint();
				
		}
	} // actionPerformed
    
    private void showAnimal(Animal anAnimal) {
    	String theImageFile = anAnimal.getImageFile();
    	currImage      = getImage(getDocumentBase(),theImageFile);
    	currText = anAnimal.whoAmI();	
    	repaint();
    	try {
    		anAnimal.play();
    	}catch(AnimalException e) {
    		System.out.println("Exception occured :" + e.getMessage());
    		currText = e.getMessage();
    		repaint();
    	}
    }
    
}