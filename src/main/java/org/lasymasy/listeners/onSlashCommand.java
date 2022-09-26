package org.lasymasy.listeners;

import net.dv8tion.jda.api.events.Event;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class onSlashCommand extends ListenerAdapter {
    public void onSlashCommand(SlashCommandInteractionEvent event){
        event.getChannel().sendMessage("test").queue();
    }
}
