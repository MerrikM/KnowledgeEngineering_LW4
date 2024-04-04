package org.example.demo2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;


public class AllTreeNodesController implements Initializable {

    @FXML
    private Label labelForHash;
    @FXML
    ScrollPane scrollPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Hash hash = new Hash();
        labelForHash.setText("");
        for(int i = 0; i < hash.getGraphVerticies().size(); i++) {
            labelForHash.setText(labelForHash.getText() + "[" + i + "]" + " " + hash.getGraphVerticies().get(String.valueOf(i)) + "\n");
        }
    }
}
