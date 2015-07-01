package com.justinbell.slack.listeners.knockknock;

import com.justinbell.slack.listeners.Channel;
import com.justinbell.slack.listeners.general.ListenerToggles;
import com.justinbell.slack.simpleslackapi.SlackSession;
import com.justinbell.slack.simpleslackapi.events.SlackMessagePosted;
import com.justinbell.slack.simpleslackapi.listeners.SlackMessagePostedListener;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Justin.Bell on 7/1/2015.
 */
public class KnockKnockMessageListener implements SlackMessagePostedListener
{

    private static final String BOT_ID = "U073FFFGB";
    private static final Channel CHANNEL = Channel.BOTTEST;
    private Joke currentJoke;

    @Override
    public void onEvent(SlackMessagePosted event, SlackSession session)
    {
        if(ListenerToggles.knockKnockEnabled)
        {
            if (event.getSender().getId().equals(BOT_ID))
                System.out.println("Ignoring Bot Messages");
            else if (event.getChannel().getId().equals(CHANNEL.getID()))
            {
                MessageType messageType = MessageParser.ParseMessage(event.getMessageContent(), currentJoke);
                boolean needNewMessage = currentJoke == null || currentJoke.getNextType().equals(MessageType.NONE);
                if (needNewMessage)
                {
                    currentJoke = Joke.getRandomJoke();
                }
                if (currentJoke.getNextType().equals(messageType))
                {
                    String response = currentJoke.getResponse(messageType);
                    currentJoke.advanceNextType(messageType);
                    if (!StringUtils.isEmpty(response))
                    {
                        session.sendMessage(event.getChannel(), response, null);
                    }
                }
            }
        }
    }
}
