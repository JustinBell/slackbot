package com.justinbell.slack.simpleslackapi;

import com.justinbell.slack.simpleslackapi.events.SlackMessagePosted;
import com.justinbell.slack.simpleslackapi.events.SlackMessageEvent;

/**
 * 
 * @deprecated use {@link SlackMessagePosted}
 *
 */
@Deprecated
public interface SlackMessage extends SlackMessageEvent
{

    String getMessageContent();

    SlackUser getSender();

    SlackBot getBot();

    SlackChannel getChannel();

}
