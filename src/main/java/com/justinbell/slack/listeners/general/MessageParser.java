package com.justinbell.slack.listeners.general;

/**
 * Created by Justin.Bell on 7/1/2015.
 */
public class MessageParser
{

    public static MessageType parseMessage(String message) {
        if(message.toLowerCase().startsWith("justinbot toggle"))
            return MessageType.TOGGLE;
        return MessageType.NONE;
    }

}
