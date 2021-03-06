package com.justinbell.slack.simpleslackapi;

public interface SlackPersona
{
    public enum SlackPresence { UNKNOWN, ACTIVE, AWAY, AUTO }

    String getId();

    String getUserName();

    boolean isDeleted();
}
