/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */
package org.mule.modules.paypal.system;


import org.junit.Before;
import org.junit.Test;
import org.mule.api.ConnectionException;
import org.mule.api.ConnectionExceptionCode;
import org.mule.modules.paypal.config.SignatureConfig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ConnectivitySystemTestCase {

    private Properties validCredentials;
    private static final String CREDENTIALS_SYSTEM_PROPERTY = "automation-credentials.properties";

    @Before
    public void setUp() throws Exception {
    	//Seems a bit pointless for tests but leaving it in for now. 
        String credentialsPath = System.getProperty(CREDENTIALS_SYSTEM_PROPERTY); 
        if (credentialsPath == null) {
        	//instead of throwing an exception right away, try to load the default file first from the classpath.
        	credentialsPath = CREDENTIALS_SYSTEM_PROPERTY ; 
        }
        
    	try { //load a properties file which could either be the system property or the default one from the classpath
    		validCredentials = new Properties();
    		validCredentials.load(new FileInputStream("src/test/resources/" + CREDENTIALS_SYSTEM_PROPERTY));        	
        
    	}catch(FileNotFoundException e) { // if neither the system property nor the default credentials file found in the classpath, throw this exception
            throw new IllegalStateException(CREDENTIALS_SYSTEM_PROPERTY + " system property has not been defined. Please, run the tests with -Dautomation-credentials.properties=" + CREDENTIALS_SYSTEM_PROPERTY);
        }

       
    }

    @Test
    public void validCredentialsConnectivityTest() {
        SignatureConfig config = new SignatureConfig();
        config.setUsername(validCredentials.getProperty("config.username"));
        config.setPassword(validCredentials.getProperty("config.password"));
        config.setAppId(validCredentials.getProperty("config.appId"));
        config.setServiceAddress(validCredentials.getProperty("config.serviceAddress"));
        config.setSignature(validCredentials.getProperty("config.signature"));
        config.setVersion(validCredentials.getProperty("config.version"));

        try {
            //Call the @TestConnectivity
            config.validateConfig();
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void invalidCredentialsConnectivityTest() {
        SignatureConfig config = new SignatureConfig();
        config.setUsername("wrongusername");
        config.setPassword(validCredentials.getProperty("config.password"));
        config.setAppId(validCredentials.getProperty("config.appId"));
        config.setServiceAddress(validCredentials.getProperty("config.serviceAddress"));
        config.setSignature(validCredentials.getProperty("config.signature"));
        config.setVersion(validCredentials.getProperty("config.version"));

        try {
            //Call the @TestConnectivity
            config.validateConfig();
        } catch (ConnectionException e) {
            assertEquals(ConnectionExceptionCode.INCORRECT_CREDENTIALS, e.getCode());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void nullCredentialsConnectivityTest() {
        SignatureConfig config = new SignatureConfig();
        config.setUsername(null);
        config.setPassword(validCredentials.getProperty("config.password"));
        config.setAppId(validCredentials.getProperty("config.appId"));
        config.setServiceAddress(validCredentials.getProperty("config.serviceAddress"));
        config.setSignature(validCredentials.getProperty("config.signature"));
        config.setVersion(validCredentials.getProperty("config.version"));

        try {
            //Call the @TestConnectivity
            config.validateConfig();
        }  catch (ConnectionException e) {
            assertEquals(ConnectionExceptionCode.INCORRECT_CREDENTIALS, e.getCode());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void invalidPayPalAddressConnectivityTest() {
        SignatureConfig config = new SignatureConfig();
        config.setUsername(validCredentials.getProperty("config.username"));
        config.setPassword(validCredentials.getProperty("config.password"));
        config.setAppId(validCredentials.getProperty("config.appId"));
        config.setServiceAddress("https://notreachable");
        config.setSignature(validCredentials.getProperty("config.signature"));
        config.setVersion(validCredentials.getProperty("config.version"));
        try {
            //Call the @TestConnectivity
            config.validateConfig();
        } catch (ConnectionException e) {
            assertEquals(ConnectionExceptionCode.UNKNOWN_HOST, e.getCode());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
