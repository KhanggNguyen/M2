package com.supanadit.restsuite.renderer;
import com.supanadit.restsuite.model.BodyTypeModel;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import java.awt.*;
import javax.swing.*;
public class RequestBodyTypeRenderer extends DefaultListCellRenderer {
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        analyse.AnalyseLog.analyseLog( "getListCellRendererComponent", "getListCellRendererComponent");
        if (value instanceof BodyTypeModel) {
            analyse.AnalyseLog.analyseLog( "getListCellRendererComponent", "getName");
            value = ((BodyTypeModel) (value)).getName();
        }
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        return this;
    }
}