package com.supanadit.restsuite.panel;
import com.supanadit.restsuite.helper.DefaultIcon;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JWindow;
import java.awt.*;
import javax.swing.*;
public class SplashScreen extends JWindow {
    public static int defaultWidth = 500;

    public static int defaultHeight = 300;

    public Dimension dimension;

    private long startTime;

    private int minimumMilliseconds;

    public SplashScreen() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        dimension = new Dimension(defaultWidth, defaultHeight);
        setAlwaysOnTop(true);
        setIconImage(new DefaultIcon().getImage());
        setSize(dimension);
        setLocation((dim.width / 2) - (getSize().width / 2), (dim.height / 2) - (getSize().height / 2));
    }

    public void show(int minimumMilliseconds) {
        analyse.AnalyseLog.analyseLog( "show", "currentTimeMillis");
        analyse.AnalyseLog.analyseLog( "show", "setVisible");
        this.minimumMilliseconds = minimumMilliseconds;
        setVisible(true);
        startTime = System.currentTimeMillis();
    }

    public void close() {
        analyse.AnalyseLog.analyseLog( "close", "setVisible");
        analyse.AnalyseLog.analyseLog( "close", "currentTimeMillis");
        long elapsedTime = System.currentTimeMillis() - startTime;
        try {
            analyse.AnalyseLog.analyseLog( "close", "max");
            analyse.AnalyseLog.analyseLog( "close", "sleep");
            Thread.sleep(Math.max(minimumMilliseconds - elapsedTime, 0));
        } catch (InterruptedException e) {
            analyse.AnalyseLog.analyseLog( "close", "printStackTrace");
            e.printStackTrace();
        }
        setVisible(false);
    }
}