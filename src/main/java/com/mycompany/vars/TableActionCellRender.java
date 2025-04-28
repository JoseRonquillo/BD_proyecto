
package com.mycompany.vars;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableActionCellRender extends DefaultTableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean isSelected, boolean bln1, int row, int column){
        Component com = super.getTableCellRendererComponent(jtable, o, isSelected, bln1, row, column);
        panel_tabla action = new panel_tabla();
        if(isSelected==false&&row%2==0){
            action.setBackground(Color.WHITE);
        } else {
            action.setBackground(com.getBackground());
        }
        return action;
    }
    
}
