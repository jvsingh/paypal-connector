
package org.mule.modules.paypal.adapters;

import com.google.common.base.Optional;
import java.util.Collections;
import java.util.List;
import javax.annotation.Generated;
import org.mule.api.lifecycle.Disposable;
import org.mule.common.DefaultTestResult;
import org.mule.common.Result;
import org.mule.common.TestResult;
import org.mule.common.Testable;
import org.mule.common.metadata.ConnectorMetaDataEnabled;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataKey;
import org.mule.devkit.api.ws.authentication.WsdlSecurityStrategy;
import org.mule.devkit.api.ws.definition.ServiceDefinition;
import org.mule.devkit.api.ws.transport.WsdlTransport;
import org.mule.devkit.internal.connectivity.ConnectivityTestingErrorHandler;
import org.mule.devkit.internal.ws.common.WSResolver;
import org.mule.devkit.internal.ws.common.WsdlAdapter;
import org.mule.devkit.internal.ws.metadata.WsdlMetaDataDescriptor;
import org.mule.devkit.internal.ws.model.DefaultWSResolver;
import org.mule.modules.paypal.PayPalConnector;
import org.mule.modules.paypal.config.SignatureConfig;
import org.w3c.dom.Document;


/**
 * A <code>PayPalConnectorSignatureConfigWsdlProviderAdapter</code> is a wrapper around {@link PayPalConnector } that represents the WSDL generic connector {@link SignatureConfig }
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2015-07-24T11:00:36-03:00", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class PayPalConnectorSignatureConfigWsdlProviderAdapter
    extends PayPalConnectorProcessAdapter
    implements Disposable, Testable, ConnectorMetaDataEnabled, WsdlAdapter
{

    private WSResolver wsResolver;

    @Override
    public void dispose() {
        if (wsResolver == null) {
            return ;
        }
        wsResolver.dispose();
        wsResolver = null;
    }

    @Override
    public List<ServiceDefinition> serviceDefinitions()
        throws Exception
    {
        return ((SignatureConfig) getConfig()).getDefinitions();
    }

    @Override
    public String endpoint(ServiceDefinition serviceDefinition)
        throws Exception
    {
        return ((SignatureConfig) getConfig()).resolveAddress(serviceDefinition);
    }

    @Override
    public String wsdlSeparator() {
        return "||";
    }

    @Override
    public List<WsdlSecurityStrategy> security(ServiceDefinition serviceDefinition)
        throws Exception
    {
        return Collections.emptyList();
    }

    @Override
    public WsdlTransport transport(ServiceDefinition serviceDefinition) {
        return null;
    }

    @Override
    public Optional<List<Document>> headers(ServiceDefinition serviceDefinition, String operationName)
        throws Exception
    {
        return Optional.fromNullable(((SignatureConfig) getConfig()).headerResolver(serviceDefinition, operationName));
    }

    private synchronized void initializeWsResolver()
        throws Exception
    {
        if (wsResolver == null) {
            wsResolver = new DefaultWSResolver(this);
        }
    }

    @Override
    public WSResolver wsResolver()
        throws Exception
    {
        initializeWsResolver();
        return wsResolver;
    }

    @Override
    public Optional<String> singleServiceDefinitionId()
        throws Exception
    {
        return Optional.absent();
    }

    @Override
    public TestResult test() {
        DefaultTestResult result;
        try {
            ((SignatureConfig) getConfig()).validateConfig();
            result = new DefaultTestResult(Result.Status.SUCCESS);
        } catch (Exception e) {
            result = ((DefaultTestResult) ConnectivityTestingErrorHandler.buildFailureTestResult(e));
        }
        return result;
    }

    @Override
    public Result<List<MetaDataKey>> getMetaDataKeys() {
        WsdlMetaDataDescriptor wsdlMetaDataResolver = new WsdlMetaDataDescriptor();
        return wsdlMetaDataResolver.getMetaDataKeys(this);
    }

    @Override
    public Result<MetaData> getMetaData(MetaDataKey metaDataKey) {
        WsdlMetaDataDescriptor wsdlMetaDataResolver = new WsdlMetaDataDescriptor();
        return wsdlMetaDataResolver.getMetaData(metaDataKey, this);
    }

}
