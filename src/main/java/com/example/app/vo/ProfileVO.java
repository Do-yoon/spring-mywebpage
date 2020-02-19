package com.example.app.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;


// vo for setting Profile
@Data
@Getter
public class ProfileVO {
    private String name;
    private String image;
    private String intro;
    private Map<String, String> sns; // key: platform, Value: page link

    public ProfileVO() {
        try {
            FileReader fr = new FileReader("data/profile.json");
            JSONParser jsonParser = new JSONParser();
            JSONObject profile = (JSONObject) jsonParser.parse(fr.toString());
            this.name = (String) profile.get("name");
            this.intro = (String) profile.get("intro");
            this.image = (String) profile.get("image");
            this.sns = (HashMap) profile.get("sns");
        }
        catch (FileNotFoundException|ParseException e){ e.printStackTrace(); }
    }
}
