package stone.games.stacker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonController implements ActionListener {
	
	private Stacker game;
	
	public ButtonController(Stacker game) {
		this.game = game;
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("New Game")) {
			//start game button clicked
			System.out.println("start button clicked - new game should start with go method");
			
			game.runGame();
		}
		

	}
	
	
}
