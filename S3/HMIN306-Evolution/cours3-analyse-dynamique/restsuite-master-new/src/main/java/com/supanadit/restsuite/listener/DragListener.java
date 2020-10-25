package com.supanadit.restsuite.listener;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
public class DragListener extends MouseInputAdapter {
    Point location;

    MouseEvent pressed;

    public void mousePressed(MouseEvent me) {
        pressed = me;
    }

    public void mouseDragged(MouseEvent me) {
        analyse.AnalyseLog.analyseLog( "mouseDragged", "setLocation");
        analyse.AnalyseLog.analyseLog( "mouseDragged", "getY");
        analyse.AnalyseLog.analyseLog( "mouseDragged", "getY");
        analyse.AnalyseLog.analyseLog( "mouseDragged", "getX");
        analyse.AnalyseLog.analyseLog( "mouseDragged", "getX");
        analyse.AnalyseLog.analyseLog( "mouseDragged", "getLocation");
        analyse.AnalyseLog.analyseLog( "mouseDragged", "getComponent");
        Component component = me.getComponent();
        location = component.getLocation(location);
        int x = (location.x - pressed.getX()) + me.getX();
        int y = (location.y - pressed.getY()) + me.getY();
        component.setLocation(x, y);
    }
}