package de.knm.springFx;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

@FXMLController
public class Controller {


    @FXML
    private Button btn1;

    @FXML
    void btn1Click(ActionEvent event) {
    	System.out.println("TestBTN");

    }

    @FXML
    void initialize() {

    }
}

