/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

import java.sql.ResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author pintu
 */
public class DBSiswa {
    private SiswaModel dt=new SiswaModel();    
    public SiswaModel getSiswaModel(){
        return(dt);
    }
public void setSiswaModel(SiswaModel s){
    dt=s;
}    

public ObservableList<SiswaModel>  Load() {
    try {
        ObservableList<SiswaModel> tableData=FXCollections.observableArrayList();   
    Koneksi con = new Koneksi(); 
    con.bukaKoneksi();
    con.statement = con.dbKoneksi.createStatement();
    ResultSet rs = con.statement.executeQuery("Select NPM, Nama, Alamat from siswa");
    int i = 1;
    while (rs.next()) {
        SiswaModel d=new SiswaModel();
        d.setNPM(rs.getString("NPM")); 
        d.setNama(rs.getString("Nama"));
        d.setAlamat(rs.getString("Alamat"));
        tableData.add(d);
        i++;
     }
     con.tutupKoneksi();
     return tableData;
    }
catch (Exception e) {
    e.printStackTrace();
    return null;
}
    }
}