
package org.mule.modules.mulesoftgooglebigquery.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.mulesoftgooglebigquery.MulesoftGoogleBigQueryConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>MulesoftGoogleBigQueryConnectorProcessAdapter</code> is a wrapper around {@link MulesoftGoogleBigQueryConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.4", date = "2020-02-21T08:47:59-05:00", comments = "Build UNNAMED.2810.4347dd1")
public class MulesoftGoogleBigQueryConnectorProcessAdapter
    extends MulesoftGoogleBigQueryConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<MulesoftGoogleBigQueryConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, MulesoftGoogleBigQueryConnectorCapabilitiesAdapter> getProcessTemplate() {
        final MulesoftGoogleBigQueryConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,MulesoftGoogleBigQueryConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, MulesoftGoogleBigQueryConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, MulesoftGoogleBigQueryConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
