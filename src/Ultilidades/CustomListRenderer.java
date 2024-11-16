/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ultilidades;
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class CustomListRenderer extends DefaultListCellRenderer {
    private int selectedIndex = -1;

    public void setSelectedIndex(int index) {
        this.selectedIndex = index;
    }

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index,
            boolean isSelected, boolean cellHasFocus) {
        Component renderer = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

        if (index == selectedIndex) {
            renderer.setBackground(Color.LIGHT_GRAY);
            renderer.setForeground(Color.BLACK);
        } else {
            renderer.setBackground(list.getBackground());
            renderer.setForeground(list.getForeground());
        }

        return renderer;
    }
}