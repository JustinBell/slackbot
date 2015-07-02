package com.justinbell.slack;

import com.justinbell.slack.listeners.general.GeneralListener;
import com.justinbell.slack.listeners.knockknock.KnockKnockMessageListener;
import com.justinbell.slack.simpleslackapi.SlackSession;
import com.justinbell.slack.simpleslackapi.impl.SlackSessionFactory;

/**
 * Created by Justin.Bell on 7/1/2015.
 */
public class Application
{

    public static void main(String[] args) throws Exception
    {
        if(Config.isValid()) {
            final SlackSession session = SlackSessionFactory.
                    createWebSocketSlackSession(Config.getAuthToken());
            session.addMessagePostedListener(new KnockKnockMessageListener());
            session.addMessagePostedListener(new GeneralListener());
            session.connect();

            while (true) {
                Thread.sleep(1000);
            }
        } else {
            System.out.println("Need a valid config file.");
        }
    }
}