package br.com.sudoku.ui.custom.buttons;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class FinishGameButton extends JButton {
    public FinishGameButton(final ActionListener actionListener){
        this.setText("Concluir");
        this.addActionListener(actionListener);
    }
}
