package com.justinbell.slack.simpleslackapi.events;

import com.justinbell.slack.simpleslackapi.SlackUser;

public interface SlackChannelCreated extends SlackChannelEvent
{
    SlackUser getCreator();
}
