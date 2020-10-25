package com.supanadit.restsuite.listener.websocket;
import javax.swing.JTextArea;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.swing.*;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public class WebsocketTestListener extends WebSocketListener {
    private JTextArea logMessage;

    public WebsocketTestListener(JTextArea logMessage) {
        this.logMessage = logMessage;
    }

    @Override
    public void onClosed(@NotNull
    WebSocket webSocket, int code, @NotNull
    String reason) {
        analyse.AnalyseLog.analyseLog( "onClosed", "onClosed");
        super.onClosed(webSocket, code, reason);
    }

    @Override
    public void onClosing(@NotNull
    WebSocket webSocket, int code, @NotNull
    String reason) {
        analyse.AnalyseLog.analyseLog( "onClosing", "onClosing");
        super.onClosing(webSocket, code, reason);
    }

    @Override
    public void onFailure(@NotNull
    WebSocket webSocket, @NotNull
    Throwable t, @Nullable
    Response response) {
        analyse.AnalyseLog.analyseLog( "onFailure", "onFailure");
        super.onFailure(webSocket, t, response);
    }

    @Override
    public void onMessage(@NotNull
    WebSocket webSocket, @NotNull
    String text) {
        analyse.AnalyseLog.analyseLog( "onMessage", "onMessage");
        analyse.AnalyseLog.analyseLog( "onMessage", "concat");
        analyse.AnalyseLog.analyseLog( "onMessage", "concat");
        analyse.AnalyseLog.analyseLog( "onMessage", "append");
        logMessage.append("Receive Message : ".concat(text).concat("\n"));
        super.onMessage(webSocket, text);
    }

    @Override
    public void onMessage(@NotNull
    WebSocket webSocket, @NotNull
    ByteString bytes) {
        analyse.AnalyseLog.analyseLog( "onMessage", "onMessage");
        analyse.AnalyseLog.analyseLog( "onMessage", "toString");
        analyse.AnalyseLog.analyseLog( "onMessage", "concat");
        analyse.AnalyseLog.analyseLog( "onMessage", "concat");
        analyse.AnalyseLog.analyseLog( "onMessage", "append");
        logMessage.append("Receive Message : ".concat(bytes.toString()).concat("\n"));
        super.onMessage(webSocket, bytes);
    }

    @Override
    public void onOpen(@NotNull
    WebSocket webSocket, @NotNull
    Response response) {
        analyse.AnalyseLog.analyseLog( "onOpen", "onOpen");
        super.onOpen(webSocket, response);
    }
}