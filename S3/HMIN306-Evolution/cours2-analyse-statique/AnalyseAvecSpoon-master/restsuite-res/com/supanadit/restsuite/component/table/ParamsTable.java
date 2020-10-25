package com.supanadit.restsuite.component.table;
import com.supanadit.restsuite.model.RequestModel;
import com.supanadit.restsuite.panel.rest.request.tab.header.HeadersPanel;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
public class ParamsTable extends JScrollPane {
    private DefaultTableModel defaultTableModel;

    private JTable requestTable;

    public ParamsTable(boolean editable, HeadersPanel headersPanel) {
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return editable;
            }
        };
        defaultTableModel.addColumn("Key");
        defaultTableModel.addColumn("Value");
        requestTable = new JTable(defaultTableModel);
        setViewportView(requestTable);
        requestTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public ParamsTable(HeadersPanel headersPanel) {
        this(true, headersPanel);
    }

    public DefaultTableModel getModel() {
        return defaultTableModel;
    }

    public void deleteSelectedRow() {
        analyse.AnalyseLog.analyseLog( "deleteSelectedRow", "getSelectedRow");
        if (!(requestTable.getSelectedRow() < 0)) {
            analyse.AnalyseLog.analyseLog( "deleteSelectedRow", "getModel");
            analyse.AnalyseLog.analyseLog( "deleteSelectedRow", "getModel");
            analyse.AnalyseLog.analyseLog( "deleteSelectedRow", "getSelectedRow");
            analyse.AnalyseLog.analyseLog( "deleteSelectedRow", "getModel");
            analyse.AnalyseLog.analyseLog( "deleteSelectedRow", "getModel");
            getModel().removeRow(requestTable.getSelectedRow());
            if (getModel().getRowCount() != 0) {
                analyse.AnalyseLog.analyseLog( "deleteSelectedRow", "getModel");
                analyse.AnalyseLog.analyseLog( "deleteSelectedRow", "getModel");
                analyse.AnalyseLog.analyseLog( "deleteSelectedRow", "changeSelection");
                analyse.AnalyseLog.analyseLog( "deleteSelectedRow", "requestFocus");
                requestTable.requestFocus();
                requestTable.changeSelection(getModel().getRowCount() - 1, 0, true, false);
            }
        }
    }

    public void addNewEmptyRow() {
        analyse.AnalyseLog.analyseLog( "addNewEmptyRow", "addRow");
        addRow(new RequestModel("", ""));
    }

    public void addRow(RequestModel requestModel) {
        analyse.AnalyseLog.analyseLog( "addRow", "addRow");
        addRow(requestModel, true);
    }

    public void addRow(RequestModel requestModel, boolean withFocus) {
        analyse.AnalyseLog.analyseLog( "addRow", "getValue");
        analyse.AnalyseLog.analyseLog( "addRow", "getKey");
        analyse.AnalyseLog.analyseLog( "addRow", "getModel");
        analyse.AnalyseLog.analyseLog( "addRow", "getModel");
        getModel().addRow(new Object[]{ requestModel.getKey(), requestModel.getValue() });
        if (withFocus) {
            analyse.AnalyseLog.analyseLog( "addRow", "getModel");
            analyse.AnalyseLog.analyseLog( "addRow", "getModel");
            if (getModel().getRowCount() != 0) {
                analyse.AnalyseLog.analyseLog( "addRow", "requestFocus");
                analyse.AnalyseLog.analyseLog( "addRow", "getModel");
                analyse.AnalyseLog.analyseLog( "addRow", "getModel");
                analyse.AnalyseLog.analyseLog( "addRow", "editCellAt");
                requestTable.editCellAt(getModel().getRowCount() - 1, 0);
                requestTable.requestFocus();
            }
        }
    }

    public void setFromRequestArrayList(ArrayList<RequestModel> requestModelArrayList) {
        analyse.AnalyseLog.analyseLog( "setFromRequestArrayList", "getModel");
        analyse.AnalyseLog.analyseLog( "setFromRequestArrayList", "getModel");
        int rowCount = getModel().getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            analyse.AnalyseLog.analyseLog( "setFromRequestArrayList", "getModel");
            analyse.AnalyseLog.analyseLog( "setFromRequestArrayList", "getModel");
            getModel().removeRow(i);
        }
        for (RequestModel requestModel : requestModelArrayList) {
            analyse.AnalyseLog.analyseLog( "setFromRequestArrayList", "addRow");
            addRow(requestModel, false);
        }
    }

    public ArrayList<RequestModel> getRequest() {
        analyse.AnalyseLog.analyseLog( "getRequest", "getRowCount");
        ArrayList<RequestModel> requestModels = new ArrayList<>();
        for (int i = 0; i < defaultTableModel.getRowCount(); i++) {
            analyse.AnalyseLog.analyseLog( "getRequest", "add");
            analyse.AnalyseLog.analyseLog( "getRequest", "getValueAt");
            analyse.AnalyseLog.analyseLog( "getRequest", "getValueAt");
            analyse.AnalyseLog.analyseLog( "getRequest", "getValueAt");
            analyse.AnalyseLog.analyseLog( "getRequest", "getValueAt");
            String key = defaultTableModel.getValueAt(i, 0).toString();
            String value = defaultTableModel.getValueAt(i, 1).toString();
            requestModels.add(new RequestModel(key, value));
        }
        return requestModels;
    }
}