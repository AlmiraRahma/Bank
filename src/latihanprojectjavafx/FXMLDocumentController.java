/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanprojectjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author SMK TELKOM
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
     
    @FXML
    private TextField nama;

    @FXML
    private TextField absen;

    @FXML
    private TextField alamat;

    @FXML
    private TextArea hasil;

    @FXML
    private Button OK;

   @FXML
    void proses(ActionEvent event) {
        String Nama = nama.getText();
        String Absen = absen.getText();
        String Alamat = alamat.getText();
        
        hasil.setText("nama siswa"+Nama+"\n"+"absen siswa"+Absen+"\n"+"alamat siswa"+Alamat);
    }

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
