package com.justinbell.slack.simpleslackapi.events;

public interface SlackChannelRenamed extends SlackChannelEvent
{
    String getNewName();
}
