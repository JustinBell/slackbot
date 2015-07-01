package com.justinbell.slack.simpleslackapi.events;

import com.justinbell.slack.simpleslackapi.SlackChannel;

public interface SlackChannelEvent extends SlackEvent
{
    SlackChannel getSlackChannel();
}
