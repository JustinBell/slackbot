package com.justinbell.slack.listeners;

/**
 * Created by Justin.Bell on 7/1/2015.
 */
public enum Channel
{
    GENERAL("C052ZFQG8"),
    BOTTEST("C073K19DX"),
    ALTERNATIVE("C071XQR1R"),
    books("C06T4D18D");

    private String ID;

    Channel(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

}
