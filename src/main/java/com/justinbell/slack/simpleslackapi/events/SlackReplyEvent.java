package com.justinbell.slack.simpleslackapi.events;

public interface SlackReplyEvent extends SlackEvent
{
    boolean isOk();
    long getReplyTo();
    String getTimestamp();
}
