/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datapegawai;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerPegawai {
    ArrayList<datapegawaibaru> ArrayData;
    DefaultTableModel jTable2;
    
    public ControllerPegawai(){
        ArrayData = new ArrayList<datapegawaibaru>();
    }
    public void InsertData(String nama, String alamat, int umur){
        datapegawaibaru pgw = new datapegawaibaru(nama, alamat, umur);
        ArrayData.add(pgw);
    }
    
    public boolean updateData(int index, String nama, String alamat, int umur) {
        if (index >= 0 && index < ArrayData.size()) {
            datapegawaibaru pgw = ArrayData.get(index);
            pgw.setNama(nama);
            pgw.setAlamat(alamat);
            pgw.setUmur(umur);
            return true;
        }
        return false;
    }

    public boolean deleteData(int index) {
        if (index >= 0 && index < ArrayData.size()) {
            ArrayData.remove(index);
            return true;
        }
        return false;
    }
    
    public DefaultTableModel showData(){
        String[] kolom = {"Nama", "Alamat", "Umur"};
        Object[][] objData = new Object[ArrayData.size()][3];
        int i = 0;
    
        for (datapegawaibaru n : ArrayData){
        String[] arrData = {n.getNama(), n.getAlamat(), String.valueOf(n.umur)};
        objData[i] = arrData;
        i++;
    }
    
    jTable2 = new DefaultTableModel(objData, kolom){
        public boolean inCellEditTable(int rowIndex, int colIndex){
        return false;
        }
    };
    
    return jTable2;
    }
}