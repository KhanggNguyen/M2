package com.supanadit.restsuite.system;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Restsuite {
    public static String workspaceDirectory = ".restsuite";

    public static Path getWorkspaceDirectory() {
        analyse.AnalyseLog.analyseLog( "getWorkspaceDirectory", "getProperty");
        analyse.AnalyseLog.analyseLog( "getWorkspaceDirectory", "get");
        return Paths.get(System.getProperty("user.home"), workspaceDirectory);
    }

    public static void createWorkspaceDirectory() {
        analyse.AnalyseLog.analyseLog( "createWorkspaceDirectory", "exists");
        analyse.AnalyseLog.analyseLog( "createWorkspaceDirectory", "getWorkspaceDirectory");
        Path workspace = getWorkspaceDirectory();
        if (!Files.exists(workspace)) {
            try {
                analyse.AnalyseLog.analyseLog( "createWorkspaceDirectory", "createDirectories");
                Files.createDirectories(workspace);
            } catch (IOException e) {
                analyse.AnalyseLog.analyseLog( "createWorkspaceDirectory", "printStackTrace");
                e.printStackTrace();
            }
        }
    }
}