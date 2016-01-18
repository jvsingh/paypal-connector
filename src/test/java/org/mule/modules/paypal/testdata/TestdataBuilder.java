/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */
package org.mule.modules.paypal.testdata;

import org.jetbrains.annotations.NotNull;
import org.mule.tools.devkit.ctf.utils.XMLUtils;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamReader;

public class TestdataBuilder {

    private static String getFileName(String operation) {
        final String path = System.getProperty("user.dir") + "/src/test/resources/payloads/xml/" + operation.toLowerCase() + "-request.xml";
        return path;
    }

    @NotNull
    public static XMLStreamReader getRequest(String operation) throws Exception {
        XMLStreamReader request;
        request = XMLUtils.loadFile(getFileName(operation));
        // request = XMLUtils.loadResource(operation.toLowerCase() + "-request.xml");
        return request;
    }

    // private static XMLStreamReader updateRequest(String table, String operation, Map<String, String> runTimeValues) throws IOException, XMLStreamException {
    // String requestInString = StringUtils.join(IOUtils.readLines(new FileReader(getFileName(table, operation))), "");
    // for (String v : runTimeValues.keySet()) {
    // String find = v + ">?";
    // String replace = v + ">" + runTimeValues.get(v);
    // requestInString = StringUtils.replace(requestInString, find, replace);
    // }
    //
    // Reader reader = new StringReader(requestInString);
    // XMLInputFactory factory = XMLInputFactory.newInstance();
    // XMLStreamReader updatedRequest = factory.createXMLStreamReader(reader);
    //
    // return updatedRequest;
    // }
}
