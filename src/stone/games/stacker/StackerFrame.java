package stone.games.stacker;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class StackerFrame extends JFrame {
	
	public StackerFrame() {
		setLayout(new BorderLayout());
		setDefaultCloseOperation(3);
		
		Stacker gamePanel = new Stacker();
		
        ButtonController buttonController = new ButtonController(gamePanel);
        ButtonPanel buttonPanel = new ButtonPanel();
        buttonPanel.setController(buttonController);
        add(buttonPanel, BorderLayout.NORTH);
		add(gamePanel, BorderLayout.SOUTH);
		
		setFocusable(true);
		pack();
		setVisible(true);
		
	}

	public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StackerFrame().setVisible(true);
            }
        });
	}

}
