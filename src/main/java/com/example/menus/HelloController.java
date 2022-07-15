package com.example.menus;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.text.Text;

public class HelloController implements Initializable {

    @FXML
    private MenuItem frenchOption;

    @FXML
    private Button btn1;

    @FXML
    private Text txt1;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btn1.setVisible(false);
        String path = "com/example/menus/";
        File clip = new File("selectRadioEng.wav");


    }

    @FXML
    void setEnglish() {
        txt1.setText("Hello");
        btn1.setText("Play sound");
        visableButton();
    }

    @FXML
    void setFrench() {
        txt1.setText("Bonjour");
        btn1.setText("Jouer son");
        visableButton();
    }

    @FXML
    void PlaySound() {
        playClip();


    }

    /////////////////////////functions ////////////////////////
    private void playClip() {
    }


    private void visableButton() {
        btn1.setVisible(true);
    }


    public void selectEnglish(ActionEvent event) {
        txt1.setText("Selected English");
    }

    public void selectFrench(ActionEvent event) {
        txt1.setText("Selected French");
    }


}

