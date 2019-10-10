/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media.plaayer;

import java.awt.Desktop;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;

/**
 *
 * @author Aluno
 */
public class FXMLDocumentController implements Initializable {
    
    private String filePath;
    
    @FXML
    private MediaPlayer mediaPlayer;
    
    @FXML
    private Label label;
    
    @FXML
    private MediaView mediaView;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {

           
            Media media = new Media("file:///Users/adelinofernandes/Downloads/heman.mp4");
            mediaPlayer = new MediaPlayer(media);
            mediaView.setMediaPlayer(mediaPlayer);
            mediaPlayer.play();

    }
    
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
