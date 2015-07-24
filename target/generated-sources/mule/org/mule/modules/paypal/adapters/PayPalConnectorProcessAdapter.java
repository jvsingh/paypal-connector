
package org.mule.modules.paypal.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.paypal.PayPalConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>PayPalConnectorProcessAdapter</code> is a wrapper around {@link PayPalConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2015-07-24T11:00:36-03:00", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class PayPalConnectorProcessAdapter
    extends PayPalConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<PayPalConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, PayPalConnectorCapabilitiesAdapter> getProcessTemplate() {
        final PayPalConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,PayPalConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, PayPalConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, PayPalConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
