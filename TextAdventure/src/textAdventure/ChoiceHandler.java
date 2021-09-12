package textAdventure;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceHandler implements ActionListener {
    
    Game game;  

    public ChoiceHandler(Game game) {
        
        this.game = game;
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        String yourChoice = event.getActionCommand();

        switch (yourChoice) {
            case "start": this.game.vm.titleToTown(); this.game.story.townGate(); break;
            case "c1": this.game.story.selectPosition(this.game.nextPosition1); break;
            case "c2": this.game.story.selectPosition(this.game.nextPosition2); break;
            case "c3": this.game.story.selectPosition(this.game.nextPosition3); break;
            case "c4": this.game.story.selectPosition(this.game.nextPosition4); break;
        }
    }
}
