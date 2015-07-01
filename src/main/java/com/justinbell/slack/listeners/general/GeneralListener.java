package com.justinbell.slack.listeners.general;

import com.justinbell.slack.simpleslackapi.SlackSession;
import com.justinbell.slack.simpleslackapi.events.SlackMessagePosted;
import com.justinbell.slack.simpleslackapi.listeners.SlackMessagePostedListener;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Justin.Bell on 7/1/2015.
 */
public class GeneralListener implements SlackMessagePostedListener
{
    @Override
    public void onEvent(SlackMessagePosted event, SlackSession session)
    {
        String message = event.getMessageContent();
        MessageType messageType = MessageParser.parseMessage(message);
        String response = null;
        switch (messageType) {
            case TOGGLE:
                response = toggle(message);
                break;
            case NONE:
                break;
        }
        if(!StringUtils.isEmpty(response)) {
            session.sendMessage(event.getChannel(), response, null);
        }
    }

    private String toggle(String message) {
        String toggled = "Unknown toggle";
        try
        {
            String listenerToToggle = message.split("toggle")[1];
            switch (listenerToToggle.toLowerCase().trim()) {
                case "knockknock" :
                    ListenerToggles.knockKnockEnabled = !ListenerToggles.knockKnockEnabled;
                    toggled = "Knock Knock has been " + ((ListenerToggles.knockKnockEnabled) ? "enabled." : "disabled.");
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        return toggled;
    }
}
