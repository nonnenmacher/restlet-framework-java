/*
 * Copyright 2005-2006 Noelios Consulting.
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the "License").  You may not use this file except
 * in compliance with the License.
 *
 * You can obtain a copy of the license at
 * http://www.opensource.org/licenses/cddl1.txt
 * See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * HEADER in each file and include the License file at
 * http://www.opensource.org/licenses/cddl1.txt
 * If applicable, add the following below this CDDL
 * HEADER, with the fields enclosed by brackets "[]"
 * replaced with your own identifying information:
 * Portions Copyright [yyyy] [name of copyright owner]
 */

package com.noelios.restlet.connector;

import java.util.Date;

import org.restlet.data.ParameterList;

/**
 * Low-level call for the HTTP connectors.
 * @author Jerome Louvel (contact@noelios.com) <a href="http://www.noelios.com/">Noelios Consulting</a>
 */
public interface HttpCall
{
   /**
    * Indicates if the confidentiality of the call is ensured (ex: via SSL).
    * @return True if the confidentiality of the call is ensured (ex: via SSL).
    */
   public boolean isConfidential();

   /**
    * Returns the request address.<br/>
    * Corresponds to the IP address of the requesting client.
    * @return The request address.
    */
   public String getRequestAddress();

   /**
    * Returns the request method. 
    * @return The request method.
    */
   public String getRequestMethod();

   /**
    * Returns the full request URI. 
    * @return The full request URI.
    */
   public String getRequestUri();
   
   /**
    * Returns the modifiable list of request headers.
    * @return The modifiable list of request headers.
    */
   public ParameterList getRequestHeaders();

   /**
    * Returns the response address.<br/>
    * Corresponds to the IP address of the responding server.
    * @return The response address.
    */
   public String getResponseAddress();

   /**
    * Returns the response status code.
    * @return The response status code.
    */
   public int getResponseStatusCode();

   /**
    * Returns the response reason phrase.
    * @return The response reason phrase.
    */
   public String getResponseReasonPhrase();
   
   /**
    * Returns the modifiable list of response headers.
    * @return The modifiable list of response headers.
    */
   public ParameterList getResponseHeaders();
   
   /**
    * Parses a date string.
    * @param date The date string to parse.
    * @param cookie Indicates if the date is in the cookie format.
    * @return The parsed date.
    */
   public Date parseDate(String date, boolean cookie);
   
   /**
    * Formats a date as a header string.
    * @param date The date to format.
    * @param cookie Indicates if the date should be in the cookie format.
    * @return The formatted date.
    */
   public String formatDate(Date date, boolean cookie);
}
