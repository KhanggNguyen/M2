package com.supanadit.restsuite.helper;
import com.supanadit.restsuite.model.RequestModel;
import java.util.ArrayList;
public class UrlParser {
    String url;

    protected final String http = "http://";

    protected final String https = "https://";

    protected final String www = "wwww.";

    public UrlParser(String url) {
        this.url = url;
    }

    public boolean isHttp() {
        analyse.AnalyseLog.analyseLog( "isHttp", "length");
        analyse.AnalyseLog.analyseLog( "isHttp", "length");
        boolean isValidHttp = false;
        if (this.url.length() >= this.http.length()) {
            analyse.AnalyseLog.analyseLog( "isHttp", "length");
            analyse.AnalyseLog.analyseLog( "isHttp", "substring");
            analyse.AnalyseLog.analyseLog( "isHttp", "substring");
            isValidHttp = this.url.substring(0, this.http.length()).equals(this.http);
        }
        return isValidHttp;
    }

    public boolean isHttps() {
        analyse.AnalyseLog.analyseLog( "isHttps", "length");
        analyse.AnalyseLog.analyseLog( "isHttps", "length");
        boolean isValidHttps = false;
        if (this.url.length() >= this.https.length()) {
            analyse.AnalyseLog.analyseLog( "isHttps", "length");
            analyse.AnalyseLog.analyseLog( "isHttps", "substring");
            analyse.AnalyseLog.analyseLog( "isHttps", "substring");
            isValidHttps = this.url.substring(0, this.https.length()).equals(this.https);
        }
        return isValidHttps;
    }

    public boolean isUseWWW() {
        analyse.AnalyseLog.analyseLog( "isUseWWW", "isHttp");
        boolean isUserUrl = false;
        int index = -1;
        if (this.isHttp()) {
            analyse.AnalyseLog.analyseLog( "isUseWWW", "length");
            index = this.http.length();
        } else {
            analyse.AnalyseLog.analyseLog( "isUseWWW", "isHttps");
            if (this.isHttps()) {
                analyse.AnalyseLog.analyseLog( "isUseWWW", "length");
                index = this.https.length();
            }
        }
        if (index != (-1)) {
            analyse.AnalyseLog.analyseLog( "isUseWWW", "length");
            analyse.AnalyseLog.analyseLog( "isUseWWW", "length");
            index = index + (this.www.length() - 1);
            isUserUrl = this.url.length() > index;
        }
        return isUserUrl;
    }

    public boolean isHasCleanUrlTarget() {
        analyse.AnalyseLog.analyseLog( "isHasCleanUrlTarget", "isHttp");
        boolean isHasUrl = false;
        int index = -1;
        if (this.isHttp()) {
            analyse.AnalyseLog.analyseLog( "isHasCleanUrlTarget", "length");
            index = this.http.length();
        } else {
            analyse.AnalyseLog.analyseLog( "isHasCleanUrlTarget", "isHttps");
            if (this.isHttps()) {
                analyse.AnalyseLog.analyseLog( "isHasCleanUrlTarget", "length");
                index = this.https.length();
            }
        }
        if (index != (-1)) {
            analyse.AnalyseLog.analyseLog( "isHasCleanUrlTarget", "length");
            analyse.AnalyseLog.analyseLog( "isHasCleanUrlTarget", "isUseWWW");
            if (this.isUseWWW()) {
                analyse.AnalyseLog.analyseLog( "isHasCleanUrlTarget", "length");
                index = index + (this.www.length() - 1);
            }
            isHasUrl = this.url.length() > index;
        }
        return isHasUrl;
    }

    public boolean isHasDomain() {
        analyse.AnalyseLog.analyseLog( "isHasDomain", "isHttp");
        boolean isHasDomain = false;
        int index = -1;
        if (this.isHttp()) {
            analyse.AnalyseLog.analyseLog( "isHasDomain", "length");
            index = this.http.length();
        } else {
            analyse.AnalyseLog.analyseLog( "isHasDomain", "isHttps");
            if (this.isHttps()) {
                analyse.AnalyseLog.analyseLog( "isHasDomain", "length");
                index = this.https.length();
            }
        }
        if (index != (-1)) {
            analyse.AnalyseLog.analyseLog( "isHasDomain", "length");
            analyse.AnalyseLog.analyseLog( "isHasDomain", "isUseWWW");
            if (this.isUseWWW()) {
                analyse.AnalyseLog.analyseLog( "isHasDomain", "length");
                index = index + (this.www.length() - 1);
            }
            if (this.url.length() > index) {
                analyse.AnalyseLog.analyseLog( "isHasDomain", "split");
                analyse.AnalyseLog.analyseLog( "isHasDomain", "length");
                analyse.AnalyseLog.analyseLog( "isHasDomain", "substring");
                String url = this.url.substring(index, this.url.length());
                String[] urlSplit = url.split("\\.");
                if (urlSplit.length >= 2) {
                    isHasDomain = true;
                }
            }
        }
        return isHasDomain;
    }

    public boolean isValid() {
        analyse.AnalyseLog.analyseLog( "isValid", "isHttps");
        analyse.AnalyseLog.analyseLog( "isValid", "isHttp");
        boolean isValid = false;
        if (this.isHttp() || this.isHttps()) {
            analyse.AnalyseLog.analyseLog( "isValid", "isHasCleanUrlTarget");
            if (this.isHasCleanUrlTarget()) {
                isValid = true;
            }
        }
        return isValid;
    }

    public boolean hasQueryParams() {
        analyse.AnalyseLog.analyseLog( "hasQueryParams", "isHttp");
        boolean isHasQueryParams = false;
        int index = -1;
        if (this.isHttp()) {
            analyse.AnalyseLog.analyseLog( "hasQueryParams", "length");
            index = this.http.length();
        } else {
            analyse.AnalyseLog.analyseLog( "hasQueryParams", "isHttps");
            if (this.isHttps()) {
                analyse.AnalyseLog.analyseLog( "hasQueryParams", "length");
                index = this.https.length();
            }
        }
        if (index != (-1)) {
            analyse.AnalyseLog.analyseLog( "hasQueryParams", "length");
            analyse.AnalyseLog.analyseLog( "hasQueryParams", "isUseWWW");
            if (this.isUseWWW()) {
                analyse.AnalyseLog.analyseLog( "hasQueryParams", "length");
                index = index + (this.www.length() - 1);
            }
            if (this.url.length() > index) {
                analyse.AnalyseLog.analyseLog( "hasQueryParams", "split");
                analyse.AnalyseLog.analyseLog( "hasQueryParams", "length");
                analyse.AnalyseLog.analyseLog( "hasQueryParams", "substring");
                String url = this.url.substring(index, this.url.length());
                String[] urlSplit = url.split("\\.");
                if (urlSplit.length >= 1) {
                    analyse.AnalyseLog.analyseLog( "hasQueryParams", "split");
                    int lengthUrlPathDomain = urlSplit.length - 1;
                    String urlPathDomain = urlSplit[lengthUrlPathDomain];
                    String[] urlSplitPathDomain = urlPathDomain.split("/");
                    if (urlSplitPathDomain.length != 0) {
                        analyse.AnalyseLog.analyseLog( "hasQueryParams", "split");
                        int lengthLastPath = urlSplitPathDomain.length - 1;
                        String[] queryParams = urlSplitPathDomain[lengthLastPath].split("\\?");
                        if (queryParams.length >= 2) {
                            isHasQueryParams = true;
                        }
                    }
                }
            }
        }
        return isHasQueryParams;
    }

    public ArrayList<RequestModel> getQueryParams() {
        analyse.AnalyseLog.analyseLog( "getQueryParams", "isHttp");
        ArrayList<RequestModel> requestModel = new ArrayList<>();
        int index = -1;
        if (this.isHttp()) {
            analyse.AnalyseLog.analyseLog( "getQueryParams", "length");
            index = this.http.length();
        } else {
            analyse.AnalyseLog.analyseLog( "getQueryParams", "isHttps");
            if (this.isHttps()) {
                analyse.AnalyseLog.analyseLog( "getQueryParams", "length");
                index = this.https.length();
            }
        }
        if (index != (-1)) {
            analyse.AnalyseLog.analyseLog( "getQueryParams", "length");
            analyse.AnalyseLog.analyseLog( "getQueryParams", "isUseWWW");
            if (this.isUseWWW()) {
                analyse.AnalyseLog.analyseLog( "getQueryParams", "length");
                index = index + (this.www.length() - 1);
            }
            if (this.url.length() > index) {
                analyse.AnalyseLog.analyseLog( "getQueryParams", "split");
                analyse.AnalyseLog.analyseLog( "getQueryParams", "length");
                analyse.AnalyseLog.analyseLog( "getQueryParams", "substring");
                String url = this.url.substring(index, this.url.length());
                String[] urlSplit = url.split("\\.");
                if (urlSplit.length >= 1) {
                    analyse.AnalyseLog.analyseLog( "getQueryParams", "split");
                    int lengthUrlPathDomain = urlSplit.length - 1;
                    String urlPathDomain = urlSplit[lengthUrlPathDomain];
                    String[] urlSplitPathDomain = urlPathDomain.split("/");
                    if (urlSplitPathDomain.length != 0) {
                        analyse.AnalyseLog.analyseLog( "getQueryParams", "split");
                        int lengthLastPath = urlSplitPathDomain.length - 1;
                        String[] queryParams = urlSplitPathDomain[lengthLastPath].split("\\?");
                        if (queryParams.length >= 2) {
                            analyse.AnalyseLog.analyseLog( "getQueryParams", "split");
                            String[] params = queryParams[1].split("&");
                            for (int i = 0; i < params.length; i++) {
                                analyse.AnalyseLog.analyseLog( "getQueryParams", "add");
                                analyse.AnalyseLog.analyseLog( "getQueryParams", "split");
                                String[] keyValue = params[i].split("=");
                                RequestModel requestModelData;
                                if (keyValue.length > 1) {
                                    requestModelData = new RequestModel(keyValue[0], keyValue[1]);
                                } else {
                                    requestModelData = new RequestModel(keyValue[0], "");
                                }
                                requestModel.add(requestModelData);
                            }
                        }
                    }
                }
            }
        }
        return requestModel;
    }
}