package com.justinbell.slack.simpleslackapi.impl;

import com.justinbell.slack.simpleslackapi.SlackBot;

class SlackBotImpl implements SlackBot
{

    private String  id;
    private String  name;
    private boolean deleted;

    SlackBotImpl(String id, String name, boolean deleted)
    {
        this.id = id;
        this.name = name;
        this.deleted = deleted;
    }

    public String getId()
    {
        return id;
    }

    public String getUserName()
    {
        return name;
    }

    public boolean isDeleted()
    {
        return deleted;
    }
}
