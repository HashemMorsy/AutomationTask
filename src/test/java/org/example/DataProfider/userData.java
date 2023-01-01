package org.example.DataProfider;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class userData {


    String userData= String.valueOf(redJson());
    String users[]= userData.split(",") ;

    public userData() throws IOException, ParseException {
    }


    public String username ()
    {
    return users[0] ;
    }
    public String Password (){
        return users[1] ;
    }

    public String[] redJson() throws IOException, ParseException
    {
        JSONParser jsonParser= new JSONParser();
        FileReader fileReader = new FileReader(".\\testData\\Data.json");

        //Read Json file
        Object obj = jsonParser.parse(fileReader);
        JSONObject jsonObject = (JSONObject)obj;

        JSONArray array = (JSONArray) jsonObject.get("user registration");

        String arr[] = new String[array.size()];
        for (int i = 0; i < array.size(); i++) {
            JSONObject users = (JSONObject) array.get(i);
            String firstName = (String) users.get("first name");
            String Email = (String) users.get("Email");

            arr[i] = firstName+","+Email;
        }
        return arr;
    }


}
