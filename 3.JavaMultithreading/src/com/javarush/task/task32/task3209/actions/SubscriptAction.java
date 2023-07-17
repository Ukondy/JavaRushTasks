package com.javarush.task.task32.task3209.actions;

import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.TextAction;
import java.awt.event.ActionEvent;

public class SubscriptAction extends StyledEditorKit.StyledTextAction {

    public SubscriptAction() {
        super(StyleConstants.Subscript.toString());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
