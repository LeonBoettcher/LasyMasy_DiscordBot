package org.lasymasy;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class initaliser {

    String token = "";

    public String gettoken(){
        readconfig();
        return token;
    }

    public void readconfig(){
        Properties prop = new Properties();

        // NEEDS TO BE CHANGED LATER
        String config = "C:\\Users\\Leon\\IdeaProjects\\LasyMasy-DCBot\\src\\main\\java\\org\\lasymasy\\bot.config";

        try (FileInputStream fis = new FileInputStream(config)) {
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        token = prop.getProperty("token");
    }

}
