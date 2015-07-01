package com.justinbell.slack.simpleslackapi.events;

import com.justinbell.slack.simpleslackapi.SlackUser;

public interface SlackChannelUnarchived extends SlackChannelEvent
{
    SlackUser getUser();
}
