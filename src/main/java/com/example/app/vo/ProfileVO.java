package com.example.app.vo;

import lombok.Data;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


// vo for setting Profile
@Data
public class ProfileVO {
    private String name;
    private BufferedImage image;
    private String introduce;

    public ProfileVO() {
        try {
            FileReader fr = new FileReader("data/profile.json");

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        /*
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("data/profile.json"));
            JSONObject jsonObject = (JSONObject) obj;
            this.name = (String) jsonObject.get("name")
        } catch (FileNotFoundException e){ e.printStackTrace(); }
        catch (IOException e) { e.printStackTrace(); }
        catch (ParseException e) { e.printStackTrace(); }
        */
    }
}
