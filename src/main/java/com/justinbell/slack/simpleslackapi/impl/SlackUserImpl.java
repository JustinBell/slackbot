package com.justinbell.slack.simpleslackapi.impl;

import com.justinbell.slack.simpleslackapi.SlackUser;

class SlackUserImpl implements SlackUser
{

    String  id;

    @Override
    public String toString() {
        return "SlackUserImpl{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", userMail='" + userMail + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }

    String  userName;
    String  realName;
    String  userMail;
    boolean isDeleted;

    SlackUserImpl(String id, String userName, String realName, String userMail, boolean isDeleted)
    {
        this.id = id;
        this.userName = userName;
        this.realName = realName;
        this.isDeleted = isDeleted;
        this.userMail = userMail;
    }

    @Override
    public String getId()
    {
        return id;
    }

    @Override
    public String getUserName()
    {
        return userName;
    }

    @Override
    public String getRealName()
    {
        return realName;
    }

    @Override
    public boolean isDeleted()
    {
        return isDeleted;
    }

    @Override
    public String getUserMail()
    {
        return userMail;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SlackUserImpl slackUser = (SlackUserImpl) o;

        return !(id != null ? !id.equals(slackUser.id) : slackUser.id != null);

    }

    @Override
    public int hashCode()
    {
        return id != null ? id.hashCode() : 0;
    }
}
