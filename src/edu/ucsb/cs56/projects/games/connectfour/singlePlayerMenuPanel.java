package edu.ucsb.cs56.projects.games.connectfour;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

/**
   Panel for choosing the difficulty menu of the single player mode
 */

public class singlePlayerMenuPanel extends JPanel{
    
    private JButton singlePlayerEasy;
    private JButton singlePlayerAdvanced;
    private JButton mainMenuButton;
    
    /**
       Constructor for the single player menu panel
       @param ss startScreen2
     */
    public singlePlayerMenuPanel(startScreen2 ss){
        super ();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        Font BFont = new Font("Comic Sans MS", Font.BOLD, 22);
        
        mainMenuButton = new JButton("Main Menu");
	mainMenuButton.addActionListener( new mainMenuButtonListener(ss) );
	mainMenuButton.setFont(BFont);

	singlePlayerEasy = new JButton ("Easy");
        singlePlayerEasy.addActionListener(new singlePlayerEasyListener(ss) );
        singlePlayerEasy.setFont(BFont);
        
        singlePlayerAdvanced = new JButton ("Advanced");
        singlePlayerAdvanced.addActionListener(new singlePlayerAdvancedListener(ss) );
        singlePlayerAdvanced.setFont(BFont);
        
	this.add(mainMenuButton);
        this.add(singlePlayerEasy);
        this.add(singlePlayerAdvanced);
    }
    
    /**
       Listener for the main menu button in the single player difficulty menu
     */
    class mainMenuButtonListener implements ActionListener {
	private startScreen2 ss1;
	mainMenuButtonListener(final startScreen2 ss){
            ss1 = ss;
        }
        public void actionPerformed(ActionEvent event){
            ss1.BackToStartScreen();
        }

    }

    /**
       Listener for the easy difficulty button in the single player difficulty menu
     */
    class singlePlayerEasyListener implements ActionListener {
        private startScreen2 ss1;
        singlePlayerEasyListener(final startScreen2 ss){
            ss1 = ss;
        }
        public void actionPerformed(ActionEvent event){
            ss1.setGameMode(2);
            ss1.launchGame();
        }
    }
    
    /**
       Listener for the advanced difficulty button in the single player difficulty menu
     */
    class singlePlayerAdvancedListener implements ActionListener {
        private startScreen2 ss1;
        singlePlayerAdvancedListener(final startScreen2 ss){
            ss1 = ss;
        }
        public void actionPerformed(ActionEvent event){
            ss1.setGameMode(3);
            ss1.launchGame();
            
        }
    }
}
