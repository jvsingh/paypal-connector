/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.paypal;


public class Enums
{
    public static <E1 extends Enum<E1>, E2 extends Enum<E2>> E2 translate(E1 e, Class<E2> enumType)
    {
        return Enum.valueOf(enumType, e.name());
    }
}
