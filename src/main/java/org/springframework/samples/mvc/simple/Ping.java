package org.springframework.samples.mvc.simple;

import net.minidev.json.JSONObject;

import javax.rmi.CORBA.Util;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

public class Ping {



    public static String sendRequest(){
        String requestURL = "http://46.101.166.115:8080/spring-mvc-showcase/simple";
        URL wikiRequest = null;
        String response = "request failed";
        try {
            wikiRequest = new URL(requestURL);
            URLConnection connection = wikiRequest.openConnection();
            connection.setDoOutput(true);
            Scanner scanner = new Scanner(wikiRequest.openStream());
            response = scanner.useDelimiter("\\Z").next();
            scanner.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response + ": same application key";
    }

    public static String sendRequest2(){
        String requestURL = "http://178.62.31.191:8080/spring-mvc-showcase/simple";
        URL wikiRequest = null;
        String response = "request failed";
        try {
            wikiRequest = new URL(requestURL);
            URLConnection connection = wikiRequest.openConnection();
            connection.setDoOutput(true);
            Scanner scanner = new Scanner(wikiRequest.openStream());
            response = scanner.useDelimiter("\\Z").next();
            scanner.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response + ": different application key";
    }
}
