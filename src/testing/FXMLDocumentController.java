/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package testing;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author pintu
 */
public class FXMLDocumentController implements Initializable {

    public static DBSiswa dtsiswa=new DBSiswa();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void master_siswa_klik(ActionEvent event) {
    }

    @FXML
    private void master_mk_klik(ActionEvent event) {
    }

    @FXML
    private void trx_penilaian_klik(ActionEvent event) {
    }

    @FXML
    private void display_siswa_klik(ActionEvent event) {
        try{
            FXMLLoader loader=new FXMLLoader(getClass().getResource("FXML_displaysiswa.fxml"));    
            Parent root = (Parent)loader.load();
            Scene scene = new Scene(root);
            Stage stg=new Stage();
            stg.initModality(Modality.APPLICATION_MODAL);
            stg.setResizable(false);
            stg.setIconified(false);
            stg.setScene(scene);
            stg.show();        
        }
        catch (IOException e){   e.printStackTrace();   }
    }

    @FXML
    private void display_mk_klik(ActionEvent event) {
    }

    @FXML
    private void display_penilaian_klik(ActionEvent event) {
    }

    @FXML
    private void keluar_keluar_klik(ActionEvent event) {
    }
    
}
