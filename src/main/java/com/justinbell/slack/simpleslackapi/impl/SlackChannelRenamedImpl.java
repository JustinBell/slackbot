package com.justinbell.slack.simpleslackapi.impl;

import com.justinbell.slack.simpleslackapi.SlackChannel;
import com.justinbell.slack.simpleslackapi.events.SlackEventType;
import com.justinbell.slack.simpleslackapi.events.SlackChannelRenamed;

class SlackChannelRenamedImpl implements SlackChannelRenamed
{
    private SlackChannel slackChannel;
    private String       newName;

    SlackChannelRenamedImpl(SlackChannel slackChannel, String newName)
    {
        this.slackChannel = slackChannel;
        this.newName = newName;
    }

    @Override
    public SlackChannel getSlackChannel()
    {
        return slackChannel;
    }

    @Override
    public String getNewName()
    {
        return newName;
    }

    @Override
    public SlackEventType getEventType()
    {
        return SlackEventType.SLACK_CHANNEL_RENAMED;
    }

}
