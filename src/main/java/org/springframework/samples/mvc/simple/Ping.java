package org.springframework.samples.mvc.simple;

import net.minidev.json.JSONObject;

import javax.rmi.CORBA.Util;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

public class Ping {



    public static String sendRequest(){
        String requestURL = "https://signicat.statuspage.io/api/v2/status.json";
        URL wikiRequest = null;
        String response = "failed to retrieve status of signicat";
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

        return "Status of signicat: " + response;
    }

    public static String sendRequest2(){
        String requestURL = "http://164.90.213.129:8081/demo/all";
        URL wikiRequest = null;
        String response = "Failed to retrieve all users in database";
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

        return "Status of users in database:" + response;
    }
}
