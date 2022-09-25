package org.lasymasy;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

public class Main {
    public static void main(String[] args) {
        initaliser initalise = new initaliser();
        JDABuilder jda = JDABuilder.createDefault(initalise.gettoken());
        jda.setActivity(Activity.playing("READY"));
        jda.build();

        System.out.println("Hello world!");
    }
}