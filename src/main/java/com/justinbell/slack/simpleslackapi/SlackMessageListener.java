package com.justinbell.slack.simpleslackapi;

@Deprecated
public interface SlackMessageListener
{
    void onSessionLoad(SlackSession session);

    void onMessage(SlackMessage message);
}
