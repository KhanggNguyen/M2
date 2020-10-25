package com.supanadit.restsuite.renderer;
import com.supanadit.restsuite.model.BodyRawTypeModel;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import java.awt.*;
import javax.swing.*;
public class RequestBodyRawTypeRenderer extends DefaultListCellRenderer {
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        analyse.AnalyseLog.analyseLog( "getListCellRendererComponent", "getListCellRendererComponent");
        if (value instanceof BodyRawTypeModel) {
            analyse.AnalyseLog.analyseLog( "getListCellRendererComponent", "getName");
            value = ((BodyRawTypeModel) (value)).getName();
        }
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        return this;
    }
}