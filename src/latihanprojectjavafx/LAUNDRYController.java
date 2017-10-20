/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanprojectjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class LAUNDRYController implements Initializable {
    @FXML
    private TextField nama;
    @FXML
    private TextField alamat;
    @FXML
    private TextField berat;
    @FXML
    private TextField notelp;
    @FXML
    private RadioButton rdb1;
    @FXML
    private ToggleGroup PilihanPaket;
    @FXML
    private RadioButton rdb3;
    @FXML
    private RadioButton rdb2;
    @FXML
    private TextField tgl;
    @FXML
    private Button proses;
    @FXML
    private Button Hapus;
    @FXML
    private TextArea hasil;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
     void proses(ActionEvent event) {
        String paket;
        int harga;
        paket = "";
        if(rdb1.isSelected())
        paket = "Cuci Kering";
        else if(rdb2.isSelected())
        paket = "Cuci Kering Setrika";
        else if(rdb3.isSelected())
        paket = "Setrika";
        else
        paket = "";
        
        if(!(rdb1.isSelected() || rdb2.isSelected() || rdb3.isSelected() )){
            JOptionPane.showMessageDialog(null, "Harap Pilih Paket Layanan");
        }else{
        String Nama = nama.getText();
        String Alamat = alamat.getText();
        String Berat = berat.getText();
        String Tanggal = tgl.getText();
        
        int hitung= Integer.parseInt(berat.getText());
        
        if (rdb1.isSelected())
            harga = hitung*5000;
        if (rdb2.isSelected())
            harga = hitung*8000;
        if (rdb3.isSelected())
            harga = hitung*4000;
        String nohp = notelp.getText();
        }
        hasil.setText("Nama: "+ nama +"\n"+"Alamat: "+ alamat +"\n"
        +"Berat Cucian: "+ berat +"\n"+"Nomor telepon: "+ notelp +"\n"
        +"Tanggal Pengambilan: "+ tgl +"\n");
    }

    @FXML
    private void hapus(ActionEvent event) {
    }
    
}
