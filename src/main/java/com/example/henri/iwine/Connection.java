package com.example.henri.iwine;

import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Connection {

    private final String USER_AGENT = "Mozilla/5.0";

    //HTTP GET request
    public List<Vinho> sendGet() throws Exception {
        String url = "https://api.mvision.com/bins/3gkfk";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("GET");

        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
    System.out.println("\nSending 'GET' request to URL: " + url);
    System.out.println("Response Code : " + responseCode);

    BufferedReader in = new BufferedReader(
            new InputStreamReader(con.getInputStream()));
    String inputLine;
    StringBuffer response = new StringBuffer();

    while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
    }
    in.close();

    List<Vinho> found = findAllItems(new JSONArray(response.toString()));

    return found;
    }

    public List<Vinho> findAllItems(JSONArray response){

        List<Vinho> found = new LinkedList<Vinho>();

        try{

            for (int i = 0; i < response.length(); i++){
                JSONObject obj = response.getJSONObject(i);
                found.add(new Vinho(obj.getString("tipo"), obj.getString("marca"), obj.getString("ano")));
            }
        } catch (JSONException e){
            //handle exception
        }
        return found;
    }
}
