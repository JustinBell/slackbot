package com.justinbell.slack.simpleslackapi.events;

public interface SlackMessageEvent extends SlackEvent
{
    String getTimeStamp();
}
