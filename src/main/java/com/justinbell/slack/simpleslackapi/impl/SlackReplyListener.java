package com.justinbell.slack.simpleslackapi.impl;

import com.justinbell.slack.simpleslackapi.listeners.SlackEventListener;
import com.justinbell.slack.simpleslackapi.events.SlackReplyEvent;

interface SlackReplyListener extends SlackEventListener<SlackReplyEvent>
{

}
