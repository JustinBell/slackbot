package com.justinbell.slack.simpleslackapi.impl;

import com.justinbell.slack.simpleslackapi.SlackChannel;
import com.justinbell.slack.simpleslackapi.events.SlackEventType;
import com.justinbell.slack.simpleslackapi.events.SlackGroupJoined;

class SlackGroupJoinedImpl implements SlackGroupJoined
{
    private SlackChannel slackChannel;

    SlackGroupJoinedImpl(SlackChannel slackChannel)
    {
        this.slackChannel = slackChannel;
    }

    @Override
    public SlackChannel getSlackChannel()
    {
        return slackChannel;
    }

    void setSlackChannel(SlackChannel slackChannel)
    {
        this.slackChannel = slackChannel;
    }

    @Override
    public SlackEventType getEventType()
    {
        return SlackEventType.SLACK_GROUP_JOINED;
    }

}
