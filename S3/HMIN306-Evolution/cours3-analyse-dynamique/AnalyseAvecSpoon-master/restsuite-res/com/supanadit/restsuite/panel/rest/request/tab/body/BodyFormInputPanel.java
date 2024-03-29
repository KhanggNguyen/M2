package com.supanadit.restsuite.panel.rest.request.tab.body;
import com.supanadit.restsuite.component.combobox.RequestBodyFormTypeComboBox;
import com.supanadit.restsuite.component.input.api.InputBodyKey;
import com.supanadit.restsuite.component.input.api.InputBodyValue;
import com.supanadit.restsuite.model.BodyFormTypeModel;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;
public class BodyFormInputPanel extends JPanel implements DocumentListener {
    int id;

    RequestBodyFormTypeComboBox typeComboBox;

    InputBodyKey keyField;

    InputBodyValue valueField;

    BodyFormPanel bodyFormPanel;

    JButton browseButton;

    JButton removeButton;

    public BodyFormInputPanel(BodyFormPanel bodyFormPanel, String type, String key, String value) {
        this.bodyFormPanel = bodyFormPanel;
        browseButton = new JButton("Browse");
        removeButton = new JButton("X");
        setLayout(new MigLayout("insets 0 0 0 0", "[]5[100]5[100]5[]5[]"));
        typeComboBox = new RequestBodyFormTypeComboBox(type);
        // Add Type Combobox
        add(typeComboBox, "growx");
        keyField = new InputBodyKey(key);
        valueField = new InputBodyValue();
        add(keyField, "pushx,growx");
        add(valueField, "pushx,growx");
        keyField.getDocument().addDocumentListener(this);
        valueField.getDocument().addDocumentListener(this);
        removeButton.addActionListener(( e) -> {
            removeFromStorage();
        });
        add(browseButton, "growx");
        add(removeButton, "growx");
        browseButton.setEnabled(false);
        // Check type every change combobox type
        typeComboBox.addActionListener(( e) -> {
            checkType();
        });
        // Check Type for first time
        checkType();
        valueField.setText(value);
        browseButton.addActionListener(( e) -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                valueField.setText(selectedFile.getAbsolutePath());
            }
        });
    }

    public BodyFormInputPanel(BodyFormPanel bodyFormPanel) {
        this(bodyFormPanel, null, null, null);
    }

    public void checkType() {
        analyse.AnalyseLog.analyseLog( "checkType", "setEnabled");
        analyse.AnalyseLog.analyseLog( "checkType", "FILE");
        analyse.AnalyseLog.analyseLog( "checkType", "FILE");
        analyse.AnalyseLog.analyseLog( "checkType", "getName");
        analyse.AnalyseLog.analyseLog( "checkType", "getName");
        analyse.AnalyseLog.analyseLog( "checkType", "getSelectedItem");
        BodyFormTypeModel bodyFormTypeModel = ((BodyFormTypeModel) (this.typeComboBox.getSelectedItem()));
        assert bodyFormTypeModel != null;
        boolean isFile = bodyFormTypeModel.getName().equals(BodyFormTypeModel.FILE().getName());
        browseButton.setEnabled(isFile);
        if (valueField != null) {
            analyse.AnalyseLog.analyseLog( "checkType", "setEditable");
            analyse.AnalyseLog.analyseLog( "checkType", "setText");
            valueField.setText(null);
            valueField.setEditable(!isFile);
        }
    }

    public void remove() {
        analyse.AnalyseLog.analyseLog( "remove", "updateChange");
        analyse.AnalyseLog.analyseLog( "remove", "updateUI");
        analyse.AnalyseLog.analyseLog( "remove", "remove");
        analyse.AnalyseLog.analyseLog( "remove", "remove");
        bodyFormPanel.formGroupPanel.remove(this);
        bodyFormPanel.listInputPanel.remove(this);
        bodyFormPanel.formGroupPanel.updateUI();
        bodyFormPanel.updateChange();
    }

    public void removeFromStorage() {
        analyse.AnalyseLog.analyseLog( "removeFromStorage", "remove");
        remove();
        if (id != 0) {
            analyse.AnalyseLog.analyseLog( "removeFromStorage", "add");
            bodyFormPanel.listRemovedInputPanel.add(this);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RequestBodyFormTypeComboBox getTypeComboBox() {
        return typeComboBox;
    }

    public InputBodyKey getKeyField() {
        return keyField;
    }

    public void setKeyField(InputBodyKey keyField) {
        this.keyField = keyField;
    }

    public InputBodyValue getValueField() {
        return valueField;
    }

    public void setValueField(InputBodyValue valueField) {
        this.valueField = valueField;
    }

    public BodyFormPanel getBodyFormPanel() {
        return bodyFormPanel;
    }

    public void setBodyFormPanel(BodyFormPanel bodyFormPanel) {
        this.bodyFormPanel = bodyFormPanel;
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        analyse.AnalyseLog.analyseLog( "insertUpdate", "updateChange");
        bodyFormPanel.updateChange();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        analyse.AnalyseLog.analyseLog( "removeUpdate", "updateChange");
        bodyFormPanel.updateChange();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        analyse.AnalyseLog.analyseLog( "changedUpdate", "updateChange");
        bodyFormPanel.updateChange();
    }
}