
package org.mule.tooling.ui.contribution;

import javax.annotation.Generated;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


/**
 * The activator class controls the plug-in life cycle
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.4", date = "2020-02-21T08:47:59-05:00", comments = "Build UNNAMED.2810.4347dd1")
public class MulesoftGoogleBigQueryActivator
    extends AbstractUIPlugin
{

    public final static String PLUGIN_ID = "org.mule.tooling.ui.contribution.mulesoft-google-big-query";
    private static org.mule.tooling.ui.contribution.MulesoftGoogleBigQueryActivator plugin;

    public void start(BundleContext context)
        throws Exception
    {
        super.start(context);
        plugin = this;
    }

    public void stop(BundleContext context)
        throws Exception
    {
        plugin = null;
        super.stop(context);
    }

    public static org.mule.tooling.ui.contribution.MulesoftGoogleBigQueryActivator getDefault() {
        return plugin;
    }

}
