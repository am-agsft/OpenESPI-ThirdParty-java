/*
 * Copyright 2013, 2014, 2015 EnergyOS.org
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.energyos.espi.thirdparty.support;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.custommonkey.xmlunit.XMLUnit;
import org.custommonkey.xmlunit.XpathEngine;
import org.custommonkey.xmlunit.exceptions.XpathException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Asserts {
	public static void assertXpathValue(String expectedValue,
			String xpathExpression, String inXMLString) throws SAXException,
			IOException, XpathException {
		Document document = XMLUnit.buildControlDocument(inXMLString);
		assertXpathValue(expectedValue, xpathExpression, document);
	}

	public static void assertXpathValue(String expectedValue,
			String xpathExpression, Document inDocument) throws XpathException {
		XpathEngine simpleXpathEngine = XMLUnit.newXpathEngine();
		assertEquals(expectedValue,
				simpleXpathEngine.evaluate(xpathExpression, inDocument).trim());
	}

	public static void assertXpathValueStartsWith(String expectedPrefix,
			String xpathExpression, String inXMLString) throws IOException,
			SAXException, XpathException {
		Document xmlDocument = XMLUnit.buildControlDocument(inXMLString);
		XpathEngine simpleXpathEngine = XMLUnit.newXpathEngine();
		String updated = simpleXpathEngine.evaluate(xpathExpression,
				xmlDocument).trim();
		assertTrue(updated.startsWith(expectedPrefix));
	}
}
