package com.justinbell.slack.simpleslackapi.impl;

import com.justinbell.slack.simpleslackapi.SlackChannel;
import com.justinbell.slack.simpleslackapi.events.SlackChannelDeleted;
import com.justinbell.slack.simpleslackapi.events.SlackEventType;

class SlackChannelDeletedImpl implements SlackChannelDeleted
{
    private SlackChannel slackChannel;

    SlackChannelDeletedImpl(SlackChannel slackChannel)
    {
        this.slackChannel = slackChannel;
    }

    @Override
    public SlackChannel getSlackChannel()
    {
        return slackChannel;
    }

    @Override
    public SlackEventType getEventType()
    {
        return SlackEventType.SLACK_CHANNEL_DELETED;
    }
}
