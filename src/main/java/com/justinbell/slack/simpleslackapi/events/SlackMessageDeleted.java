package com.justinbell.slack.simpleslackapi.events;

import com.justinbell.slack.simpleslackapi.SlackChannel;

public interface SlackMessageDeleted extends SlackMessageEvent
{
    SlackChannel getChannel();
    String getMessageTimestamp();
}
