package com.justinbell.slack.simpleslackapi.listeners;

import com.justinbell.slack.simpleslackapi.events.SlackEvent;
import com.justinbell.slack.simpleslackapi.SlackSession;

public interface SlackEventListener<T extends SlackEvent>
{
    void onEvent(T event, SlackSession session);
}
