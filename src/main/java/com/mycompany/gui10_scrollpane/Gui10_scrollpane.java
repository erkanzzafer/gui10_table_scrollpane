/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gui10_scrollpane;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author PC
 */
public class Gui10_scrollpane {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Table Örneği");
        String[][] veri = {{"1", "Mat", "85"}, {"2", "FEN", "50"}, {"3", "TUR", "100"}};
        String[] baslik = {"ID", "DERS", "NOT"};
        JTable jt = new JTable(veri, baslik);
        jt.setBounds(30, 40, 200, 300);
        
        JScrollPane sp = new JScrollPane(jt);
        
        frame.add(sp);
        frame.setSize(400, 400);
        frame.setVisible(true);
        
    }
}
