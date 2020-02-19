package com.example.app.vo;

import lombok.Getter;
import lombok.Setter;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;

@Getter
public class TriviaVO {
    private String text;
    public TriviaVO() {
        try {
            FileReader fr = new FileReader("data/profile.json");
            JSONParser jsonParser = new JSONParser();
            JSONObject profile = (JSONObject) jsonParser.parse(fr.toString());
            this.text = (String) profile.get("text");
        }
        catch (FileNotFoundException | ParseException e){ e.printStackTrace(); }
    }
}
