package com.example.xmlreader;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;


public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonCheck;

    @FXML
    private Button buttonRevirw;

    @FXML
    private Text fontName;

    @FXML
    private Text fontSize;

    @FXML
    private TextField textFileName;

    @FXML
    private TextField textFont;

    @FXML
    private TextField textFontSize;

    @FXML
    private Text textLoad;

    @FXML
    private Text textRequirements;

    @FXML
    private Text textResult;

    @FXML
    void initialize() {
        assert buttonCheck != null : "fx:id=\"buttonCheck\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert buttonRevirw != null : "fx:id=\"buttonRevirw\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert fontName != null : "fx:id=\"fontName\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert fontSize != null : "fx:id=\"fontSize\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert textFileName != null : "fx:id=\"textFileName\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert textFont != null : "fx:id=\"textFont\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert textFontSize != null : "fx:id=\"textFontSize\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert textLoad != null : "fx:id=\"textLoad\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert textRequirements != null : "fx:id=\"textRequirements\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert textResult != null : "fx:id=\"textResult\" was not injected: check your FXML file 'hello-view.fxml'.";

        buttonRevirw.setOnAction( actionEvent -> {
            System.out.println("Click");

            FileChooser fileChooser = settingFileChooser();
            File file = fileChooser.showOpenDialog(HelloApplication.stage);
            if(file != null){
                textFileName.setText(file.getName());
            }
        });
    }


    private FileChooser settingFileChooser(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("XML"  , "*.txt"),
                new FileChooser.ExtensionFilter("TXT"  , "*.txt"),
                new FileChooser.ExtensionFilter("DOC", "*.doc"));

        //TODO filter

//        File file = fileChooser.showOpenDialog(HelloApplication.stage);
//        if(file != null){
//            System.out.println("select file " + file.getName());
//        }

        return fileChooser;
    }

}
