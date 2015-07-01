package com.justinbell.slack.simpleslackapi;

import com.justinbell.slack.simpleslackapi.impl.SlackChatConfiguration;
import com.justinbell.slack.simpleslackapi.listeners.SlackChannelCreatedListener;
import com.justinbell.slack.simpleslackapi.listeners.SlackChannelDeletedListener;
import com.justinbell.slack.simpleslackapi.listeners.SlackChannelRenamedListener;
import com.justinbell.slack.simpleslackapi.listeners.SlackChannelUnarchivedListener;
import com.justinbell.slack.simpleslackapi.listeners.SlackGroupJoinedListener;
import com.justinbell.slack.simpleslackapi.listeners.SlackMessagePostedListener;
import com.justinbell.slack.simpleslackapi.listeners.SlackMessageUpdatedListener;
import com.justinbell.slack.simpleslackapi.listeners.SlackChannelArchivedListener;
import com.justinbell.slack.simpleslackapi.listeners.SlackMessageDeletedListener;

import java.io.IOException;
import java.util.Collection;

public interface SlackSession
{

    Collection<SlackChannel> getChannels();

    Collection<SlackUser> getUsers();

    Collection<SlackBot> getBots();

    SlackChannel findChannelByName(String channelName);

    SlackChannel findChannelById(String channelId);

    SlackUser findUserById(String userId);

    SlackUser findUserByUserName(String userName);

    SlackUser findUserByEmail(String userMail);

    SlackPersona sessionPersona();

    SlackBot findBotById(String botId);

    void connect() throws IOException;

    SlackMessageHandle deleteMessage(String timeStamp, SlackChannel channel);

    SlackMessageHandle sendMessage(SlackChannel channel, String message, SlackAttachment attachment, SlackChatConfiguration chatConfiguration);

    SlackMessageHandle sendMessage(SlackChannel channel, String message, SlackAttachment attachment);
    
    SlackMessageHandle updateMessage(String timeStamp, SlackChannel channel, String message);

    SlackMessageHandle sendMessageOverWebSocket(SlackChannel channel, String message, SlackAttachment attachment);

    SlackPersona.SlackPresence getPresence(SlackPersona persona);

    void addchannelArchivedListener(SlackChannelArchivedListener listener);

    void removeChannelArchivedListener(SlackChannelArchivedListener listener);

    void addchannelCreatedListener(SlackChannelCreatedListener listener);

    void removeChannelCreatedListener(SlackChannelCreatedListener listener);

    void addchannelDeletedListener(SlackChannelDeletedListener listener);

    void removeChannelDeletedListener(SlackChannelDeletedListener listener);

    void addChannelRenamedListener(SlackChannelRenamedListener listener);

    void removeChannelRenamedListener(SlackChannelRenamedListener listener);

    void addChannelUnarchivedListener(SlackChannelUnarchivedListener listener);

    void removeChannelUnarchivedListener(SlackChannelUnarchivedListener listener);

    void addMessageDeletedListener(SlackMessageDeletedListener listener);

    void removeMessageDeletedListener(SlackMessageDeletedListener listener);

    void addMessagePostedListener(SlackMessagePostedListener listener);

    void removeMessagePostedListener(SlackMessagePostedListener listener);

    void addMessageUpdatedListener(SlackMessageUpdatedListener listener);

    void removeMessageUpdatedListener(SlackMessageUpdatedListener listener);

    void addGroupJoinedListener(SlackGroupJoinedListener listener);

    void removeGroupJoinedListener(SlackGroupJoinedListener listener);

}
