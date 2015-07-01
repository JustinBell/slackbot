package com.justinbell.slack.listeners.knockknock;

/**
 * Created by Justin.Bell on 7/1/2015.
 */
public class MessageParser
{
    public static MessageType ParseMessage(String message, Joke joke) {
        String lowerCaseMessage = message.toLowerCase();
        if(lowerCaseMessage.matches(".*justinbot.*tell.*knock *knock.*")) {
            return MessageType.INITIALIZER;
        } else if (joke != null) {
            if(lowerCaseMessage.matches("who.*there.*")) {
                return MessageType.WHO_IS_THERE;
            } else {
                String who = joke.getResponse(MessageType.WHO_IS_THERE).toLowerCase();
                if(lowerCaseMessage.matches(who + "\\s*who.*")) {
                    return MessageType.WHO;
                }
            }
        }
        return MessageType.NONE;
    }
}
