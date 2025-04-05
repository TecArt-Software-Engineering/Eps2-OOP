/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tecart.eps2oop;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.AbstractCellEditor;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author gunam
 */
public class ButtonEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {

    private JButton button;
    private String id_buku;
    private JTable table;
    private IndexPerpustakaan parentFrame; // Reference to main frame

    public ButtonEditor(IndexPerpustakaan parentFrame) {
        this.parentFrame = parentFrame;
        this.button = new JButton("Edit");
        this.button.addActionListener(this);
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.table = table;
        this.id_buku = table.getValueAt(row, 0).toString(); // Get Book ID from first column
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        return "Edit";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new EditBuku(Integer.parseInt(id_buku)).setVisible(true); // Open EditBuku form
        parentFrame.dispose();
        fireEditingStopped(); // Stop editing mode
    }
}
