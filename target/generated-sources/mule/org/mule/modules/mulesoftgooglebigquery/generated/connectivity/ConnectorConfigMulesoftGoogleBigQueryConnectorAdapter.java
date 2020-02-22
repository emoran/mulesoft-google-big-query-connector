
package org.mule.modules.mulesoftgooglebigquery.generated.connectivity;

import javax.annotation.Generated;
import org.mule.api.ConnectionException;
import org.mule.devkit.internal.connection.management.ConnectionManagementConnectionAdapter;
import org.mule.devkit.internal.connection.management.TestableConnection;
import org.mule.modules.mulesoftgooglebigquery.config.ConnectorConfig;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.4", date = "2020-02-21T08:47:59-05:00", comments = "Build UNNAMED.2810.4347dd1")
public class ConnectorConfigMulesoftGoogleBigQueryConnectorAdapter
    extends ConnectorConfig
    implements ConnectionManagementConnectionAdapter<ConnectorConfig, ConnectionManagementConfigMulesoftGoogleBigQueryConnectorConnectionKey> , TestableConnection<ConnectionManagementConfigMulesoftGoogleBigQueryConnectorConnectionKey>
{


    @Override
    public ConnectorConfig getStrategy() {
        return this;
    }

    @Override
    public void test(ConnectionManagementConfigMulesoftGoogleBigQueryConnectorConnectionKey connectionKey)
        throws ConnectionException
    {
        super.connect(connectionKey.getUsername(), connectionKey.getPassword());
    }

    @Override
    public void connect(ConnectionManagementConfigMulesoftGoogleBigQueryConnectorConnectionKey connectionKey)
        throws ConnectionException
    {
        super.connect(connectionKey.getUsername(), connectionKey.getPassword());
    }

    @Override
    public void disconnect() {
        super.disconnect();
    }

    @Override
    public String connectionId() {
        return super.connectionId();
    }

    @Override
    public boolean isConnected() {
        return super.isConnected();
    }

}
