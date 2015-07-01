package com.justinbell.slack.simpleslackapi.impl;

import com.justinbell.slack.simpleslackapi.SlackChannel;
import com.justinbell.slack.simpleslackapi.SlackUser;
import com.justinbell.slack.simpleslackapi.events.SlackChannelCreated;
import com.justinbell.slack.simpleslackapi.events.SlackEventType;

class SlackChannelCreatedImpl implements SlackChannelCreated
{
    private SlackChannel slackChannel;
    private SlackUser slackuser;
    
    SlackChannelCreatedImpl(SlackChannel slackChannel, SlackUser slackuser)
    {
        this.slackChannel = slackChannel;
        this.slackuser = slackuser;
    }

    @Override
    public SlackChannel getSlackChannel()
    {
        return slackChannel;
    }

    @Override
    public SlackUser getCreator()
    {
        return slackuser;
    }

    @Override
    public SlackEventType getEventType()
    {
        return SlackEventType.SLACK_CHANNEL_CREATED;
    }

}
