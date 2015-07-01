package com.justinbell.slack.listeners.knockknock;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Justin.Bell on 7/1/2015.
 */
public class Joke
{

    private MessageType nextType;
    private Map<MessageType, String> responses;

    public Joke(Map<MessageType, String> responses) {
        nextType = MessageType.INITIALIZER;
        this.responses = responses;
        responses.put(MessageType.INITIALIZER, "Knock knock");
    }

    public Joke(String whoIsThere, String who) {
        nextType = MessageType.INITIALIZER;
        responses = new HashMap<>();
        responses.put(MessageType.INITIALIZER, "Knock knock");
        responses.put(MessageType.WHO_IS_THERE, whoIsThere);
        responses.put(MessageType.WHO, who);
    }

    public String getResponse(MessageType messageType) {
        String response = null;
        response = responses.get(messageType);
        if(response == null) {
            response = "My joke seems to be broken...";
        }
        return response;
    }

    public void advanceNextType(MessageType messageType) {
        if(nextType.equals(messageType))
        {
            switch (nextType)
            {
                case INITIALIZER:
                    nextType = MessageType.WHO_IS_THERE;
                    break;
                case WHO_IS_THERE:
                    nextType = MessageType.WHO;
                    break;
                case WHO:
                    nextType = MessageType.NONE;
                    break;
                case NONE:
                    break;
            }
        }
    }

    public MessageType getNextType() {
        return nextType;
    }

    public static Joke getRandomJoke() {
        return new Joke("Dwayne", "Dwayne the bathtub, I'm drowning!");
    }

}
