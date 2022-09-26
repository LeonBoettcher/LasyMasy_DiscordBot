package org.lasymasy;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import org.lasymasy.listeners.onSlashCommand;

public class Main {
    public static void main(String[] args) {
        initaliser initalise = new initaliser();
        onSlashCommand slashCommand = new onSlashCommand();

        JDABuilder jda = JDABuilder.createDefault(initalise.gettoken());
        jda.setActivity(Activity.playing("READY"));
        jda.addEventListeners(new onSlashCommand());
        jda.build();

        System.out.println("Hello world!");
    }
}