package com.justinbell.slack.simpleslackapi.impl;

import com.justinbell.slack.simpleslackapi.SlackChannel;
import com.justinbell.slack.simpleslackapi.SlackUser;
import com.justinbell.slack.simpleslackapi.events.SlackEventType;
import com.justinbell.slack.simpleslackapi.events.SlackChannelArchived;

class SlackChannelArchivedImpl implements SlackChannelArchived
{
    private SlackChannel slackChannel;
    private SlackUser slackuser;
    
    SlackChannelArchivedImpl(SlackChannel slackChannel, SlackUser slackuser)
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
    public SlackUser getUser()
    {
        return slackuser;
    }

    @Override
    public SlackEventType getEventType()
    {
        return SlackEventType.SLACK_CHANNEL_ARCHIVED;
    }

}
