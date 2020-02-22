package org.mule.modules.mulesoftgooglebigquery;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.lifecycle.OnException;

import org.mule.modules.mulesoftgooglebigquery.config.ConnectorConfig;
import org.mule.modules.mulesoftgooglebigquery.error.ErrorHandler;

@Connector(name="mulesoft-google-big-query", friendlyName="MulesoftGoogleBigQuery")
@OnException(handler=ErrorHandler.class)
public class MulesoftGoogleBigQueryConnector {

    @Config
    ConnectorConfig config;

    /**
     * Custom processor
     *
     * @param friend Name to be used to generate a greeting message.
     * @return A greeting message
     */
    @Processor
    public String greet(String friend) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return config.getGreeting() + " " + friend + ". " + config.getReply();
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}