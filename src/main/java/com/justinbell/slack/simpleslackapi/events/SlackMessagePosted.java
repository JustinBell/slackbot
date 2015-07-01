package com.justinbell.slack.simpleslackapi.events;

import com.justinbell.slack.simpleslackapi.SlackChannel;
import com.justinbell.slack.simpleslackapi.SlackBot;
import com.justinbell.slack.simpleslackapi.SlackUser;

public interface SlackMessagePosted extends SlackMessageEvent
{
    String getMessageContent();

    SlackUser getSender();

    SlackBot getBot();

    SlackChannel getChannel();

}
