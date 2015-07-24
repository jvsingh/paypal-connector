
package org.mule.modules.paypal.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.devkit.internal.ee.AbstractEEDefinitionParser;
import org.mule.modules.paypal.adapters.PayPalConnectorSignatureConfigWsdlProviderAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2015-07-24T11:00:36-03:00", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class PayPalConnectorSignatureConfigConfigDefinitionParser
    extends AbstractEEDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(PayPalConnectorSignatureConfigConfigDefinitionParser.class);

    public String moduleName() {
        return "PayPal Connector";
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        parseConfigName(element);
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.setScope(BeanDefinition.SCOPE_SINGLETON);
        setInitMethodIfNeeded(builder, PayPalConnectorSignatureConfigWsdlProviderAdapter.class);
        setDestroyMethodIfNeeded(builder, PayPalConnectorSignatureConfigWsdlProviderAdapter.class);
        BeanDefinitionBuilder wsdlProviderStrategyBuilder = BeanDefinitionBuilder.rootBeanDefinition(SignatureConfig.class.getName());
        parseProperty(wsdlProviderStrategyBuilder, element, "signature", "signature");
        parseProperty(wsdlProviderStrategyBuilder, element, "username", "username");
        parseProperty(wsdlProviderStrategyBuilder, element, "password", "password");
        parseProperty(wsdlProviderStrategyBuilder, element, "serviceAddress", "serviceAddress");
        parseProperty(wsdlProviderStrategyBuilder, element, "appId", "appId");
        builder.addPropertyValue("config", wsdlProviderStrategyBuilder.getBeanDefinition());
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        return definition;
    }

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(PayPalConnectorSignatureConfigWsdlProviderAdapter.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the configuration [config] within the connector [paypal] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the configuration [config] within the connector [paypal] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

}
