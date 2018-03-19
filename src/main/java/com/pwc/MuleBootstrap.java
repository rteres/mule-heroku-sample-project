package com.pwc;

import org.mule.MuleServer;

public class MuleBootstrap {
    public static void main(final String[] args) throws Exception
    {
        final MuleServer ms = new MuleServer("mule-heroku-sample-project.xml");
        ms.start(true, true);
    }

}
