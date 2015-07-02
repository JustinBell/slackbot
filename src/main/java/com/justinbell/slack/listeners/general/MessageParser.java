package com.justinbell.slack.listeners.general;

import com.justinbell.slack.Config;

/**
 * Created by Justin.Bell on 7/1/2015.
 */
public class MessageParser
{

    public static MessageType parseMessage(String message) {
        if(message.toLowerCase().startsWith(Config.getUsername() + " toggle"))
            return MessageType.TOGGLE;
        return MessageType.NONE;
    }

}
