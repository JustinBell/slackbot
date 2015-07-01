package com.justinbell.slack.simpleslackapi.events;

import com.justinbell.slack.simpleslackapi.SlackUser;

public interface SlackChannelArchived extends SlackChannelEvent
{
    SlackUser getUser();
}
