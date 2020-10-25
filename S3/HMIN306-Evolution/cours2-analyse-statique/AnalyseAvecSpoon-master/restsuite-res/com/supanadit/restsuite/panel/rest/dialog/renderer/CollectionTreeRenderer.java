package com.supanadit.restsuite.panel.rest.dialog.renderer;
import com.supanadit.restsuite.entity.CollectionEntity;
import com.supanadit.restsuite.entity.CollectionStructureFolderEntity;
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;
import javax.swing.*;
public class CollectionTreeRenderer extends DefaultTreeCellRenderer {
    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        analyse.AnalyseLog.analyseLog( "getTreeCellRendererComponent", "getTreeCellRendererComponent");
        super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
        if (value instanceof DefaultMutableTreeNode) {
            analyse.AnalyseLog.analyseLog( "getTreeCellRendererComponent", "getUserObject");
            DefaultMutableTreeNode node = ((DefaultMutableTreeNode) (value));
            Object userValue = node.getUserObject();
            if (userValue instanceof CollectionEntity) {
                analyse.AnalyseLog.analyseLog( "getTreeCellRendererComponent", "getTitle");
                analyse.AnalyseLog.analyseLog( "getTreeCellRendererComponent", "setText");
                setText(((CollectionEntity) (userValue)).getTitle());
            }
            if (userValue instanceof CollectionStructureFolderEntity) {
                analyse.AnalyseLog.analyseLog( "getTreeCellRendererComponent", "getName");
                analyse.AnalyseLog.analyseLog( "getTreeCellRendererComponent", "setText");
                setText(((CollectionStructureFolderEntity) (userValue)).getName());
            }
        }
        return this;
    }
}