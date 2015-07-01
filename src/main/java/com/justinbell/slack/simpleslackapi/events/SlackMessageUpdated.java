package com.justinbell.slack.simpleslackapi.events;

import com.justinbell.slack.simpleslackapi.SlackChannel;

public interface SlackMessageUpdated extends SlackMessageEvent
{
    SlackChannel getChannel();
    String getMessageTimestamp();
    String getNewMessage();
}
