package it.polito.tdp.spellchecker.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class SpellCheckerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> lingua;

    @FXML
    private TextArea areatesto;

    @FXML
    private Button controlla;

    @FXML
    private TextArea areaerrori;

    @FXML
    private Label errore;

    @FXML
    private Button clear;

    @FXML
    void initialize() {
        assert lingua != null : "fx:id=\"lingua\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert areatesto != null : "fx:id=\"areatesto\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert controlla != null : "fx:id=\"controlla\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert areaerrori != null : "fx:id=\"areaerrori\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert errore != null : "fx:id=\"errore\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert clear != null : "fx:id=\"clear\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        lingua.getItems().addAll("English","Italiano");
    }
}


