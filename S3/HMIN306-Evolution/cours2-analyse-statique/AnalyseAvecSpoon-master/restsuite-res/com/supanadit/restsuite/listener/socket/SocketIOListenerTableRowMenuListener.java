package com.supanadit.restsuite.listener.socket;
import com.supanadit.restsuite.panel.socket.SocketIoPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class SocketIOListenerTableRowMenuListener extends MouseAdapter {
    protected SocketIoPanel panel;

    public SocketIOListenerTableRowMenuListener(SocketIoPanel panel) {
        this.panel = panel;
    }

    public void mousePressed(MouseEvent e) {
        analyse.AnalyseLog.analyseLog( "mousePressed", "isPopupTrigger");
        if (e.isPopupTrigger()) {
            analyse.AnalyseLog.analyseLog( "mousePressed", "doPop");
            doPop(e);
        }
    }

    public void mouseReleased(MouseEvent e) {
        analyse.AnalyseLog.analyseLog( "mouseReleased", "isPopupTrigger");
        if (e.isPopupTrigger()) {
            analyse.AnalyseLog.analyseLog( "mouseReleased", "doPop");
            doPop(e);
        }
    }

    private void doPop(MouseEvent e) {
        analyse.AnalyseLog.analyseLog( "doPop", "getY");
        analyse.AnalyseLog.analyseLog( "doPop", "getX");
        analyse.AnalyseLog.analyseLog( "doPop", "getComponent");
        analyse.AnalyseLog.analyseLog( "doPop", "show");
        SocketIOListenerMouseTableRowMenu menu = new SocketIOListenerMouseTableRowMenu(panel);
        menu.show(e.getComponent(), e.getX(), e.getY());
    }
}