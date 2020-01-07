/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Transforms the message using a XSLT template using Saxon.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface XsltSaxonEndpointBuilderFactory {


    /**
     * Builder for endpoint for the XSLT Saxon component.
     */
    public interface XsltSaxonEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedXsltSaxonEndpointBuilder advanced() {
            return (AdvancedXsltSaxonEndpointBuilder) this;
        }
        /**
         * Whether to allow using StAX as the javax.xml.transform.Source. You
         * can enable this if the XSLT library supports StAX such as the Saxon
         * library (camel-saxon). The Xalan library (default in JVM) does not
         * support StAXSource.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default XsltSaxonEndpointBuilder allowStAX(boolean allowStAX) {
            doSetProperty("allowStAX", allowStAX);
            return this;
        }
        /**
         * Whether to allow using StAX as the javax.xml.transform.Source. You
         * can enable this if the XSLT library supports StAX such as the Saxon
         * library (camel-saxon). The Xalan library (default in JVM) does not
         * support StAXSource.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default XsltSaxonEndpointBuilder allowStAX(String allowStAX) {
            doSetProperty("allowStAX", allowStAX);
            return this;
        }
        /**
         * Cache for the resource content (the stylesheet file) when it is
         * loaded. If set to false Camel will reload the stylesheet file on each
         * message processing. This is good for development. A cached stylesheet
         * can be forced to reload at runtime via JMX using the
         * clearCachedStylesheet operation.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default XsltSaxonEndpointBuilder contentCache(boolean contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Cache for the resource content (the stylesheet file) when it is
         * loaded. If set to false Camel will reload the stylesheet file on each
         * message processing. This is good for development. A cached stylesheet
         * can be forced to reload at runtime via JMX using the
         * clearCachedStylesheet operation.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default XsltSaxonEndpointBuilder contentCache(String contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * If you have output=file then this option dictates whether or not the
         * output file should be deleted when the Exchange is done processing.
         * For example suppose the output file is a temporary file, then it can
         * be a good idea to delete it after use.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default XsltSaxonEndpointBuilder deleteOutputFile(
                boolean deleteOutputFile) {
            doSetProperty("deleteOutputFile", deleteOutputFile);
            return this;
        }
        /**
         * If you have output=file then this option dictates whether or not the
         * output file should be deleted when the Exchange is done processing.
         * For example suppose the output file is a temporary file, then it can
         * be a good idea to delete it after use.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default XsltSaxonEndpointBuilder deleteOutputFile(
                String deleteOutputFile) {
            doSetProperty("deleteOutputFile", deleteOutputFile);
            return this;
        }
        /**
         * Whether or not to throw an exception if the input body is null.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default XsltSaxonEndpointBuilder failOnNullBody(boolean failOnNullBody) {
            doSetProperty("failOnNullBody", failOnNullBody);
            return this;
        }
        /**
         * Whether or not to throw an exception if the input body is null.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default XsltSaxonEndpointBuilder failOnNullBody(String failOnNullBody) {
            doSetProperty("failOnNullBody", failOnNullBody);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default XsltSaxonEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default XsltSaxonEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Option to specify which output type to use. Possible values are:
         * string, bytes, DOM, file. The first three options are all in memory
         * based, where as file is streamed directly to a java.io.File. For file
         * you must specify the filename in the IN header with the key
         * Exchange.XSLT_FILE_NAME which is also CamelXsltFileName. Also any
         * paths leading to the filename must be created beforehand, otherwise
         * an exception is thrown at runtime.
         * 
         * The option is a:
         * <code>org.apache.camel.component.xslt.XsltOutput</code> type.
         * 
         * Default: string
         * Group: producer
         */
        default XsltSaxonEndpointBuilder output(XsltOutput output) {
            doSetProperty("output", output);
            return this;
        }
        /**
         * Option to specify which output type to use. Possible values are:
         * string, bytes, DOM, file. The first three options are all in memory
         * based, where as file is streamed directly to a java.io.File. For file
         * you must specify the filename in the IN header with the key
         * Exchange.XSLT_FILE_NAME which is also CamelXsltFileName. Also any
         * paths leading to the filename must be created beforehand, otherwise
         * an exception is thrown at runtime.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.xslt.XsltOutput</code> type.
         * 
         * Default: string
         * Group: producer
         */
        default XsltSaxonEndpointBuilder output(String output) {
            doSetProperty("output", output);
            return this;
        }
        /**
         * The number of javax.xml.transform.Transformer object that are cached
         * for reuse to avoid calls to Template.newTransformer().
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default XsltSaxonEndpointBuilder transformerCacheSize(
                int transformerCacheSize) {
            doSetProperty("transformerCacheSize", transformerCacheSize);
            return this;
        }
        /**
         * The number of javax.xml.transform.Transformer object that are cached
         * for reuse to avoid calls to Template.newTransformer().
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default XsltSaxonEndpointBuilder transformerCacheSize(
                String transformerCacheSize) {
            doSetProperty("transformerCacheSize", transformerCacheSize);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the XSLT Saxon component.
     */
    public interface AdvancedXsltSaxonEndpointBuilder
            extends
                EndpointProducerBuilder {
        default XsltSaxonEndpointBuilder basic() {
            return (XsltSaxonEndpointBuilder) this;
        }
        /**
         * To use a custom Saxon configuration.
         * 
         * The option is a: <code>net.sf.saxon.Configuration</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder saxonConfiguration(
                Object saxonConfiguration) {
            doSetProperty("saxonConfiguration", saxonConfiguration);
            return this;
        }
        /**
         * To use a custom Saxon configuration.
         * 
         * The option will be converted to a
         * <code>net.sf.saxon.Configuration</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder saxonConfiguration(
                String saxonConfiguration) {
            doSetProperty("saxonConfiguration", saxonConfiguration);
            return this;
        }
        /**
         * Allows you to use a custom
         * net.sf.saxon.lib.ExtensionFunctionDefinition. You would need to add
         * camel-saxon to the classpath. The function is looked up in the
         * registry, where you can comma to separate multiple values to lookup.
         * 
         * The option is a: <code>java.util.List&lt;java.lang.Object&gt;</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder saxonExtensionFunctions(
                List<Object> saxonExtensionFunctions) {
            doSetProperty("saxonExtensionFunctions", saxonExtensionFunctions);
            return this;
        }
        /**
         * Allows you to use a custom
         * net.sf.saxon.lib.ExtensionFunctionDefinition. You would need to add
         * camel-saxon to the classpath. The function is looked up in the
         * registry, where you can comma to separate multiple values to lookup.
         * 
         * The option will be converted to a
         * <code>java.util.List&lt;java.lang.Object&gt;</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder saxonExtensionFunctions(
                String saxonExtensionFunctions) {
            doSetProperty("saxonExtensionFunctions", saxonExtensionFunctions);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use a custom org.xml.sax.EntityResolver with
         * javax.xml.transform.sax.SAXSource.
         * 
         * The option is a: <code>org.xml.sax.EntityResolver</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder entityResolver(
                Object entityResolver) {
            doSetProperty("entityResolver", entityResolver);
            return this;
        }
        /**
         * To use a custom org.xml.sax.EntityResolver with
         * javax.xml.transform.sax.SAXSource.
         * 
         * The option will be converted to a
         * <code>org.xml.sax.EntityResolver</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder entityResolver(
                String entityResolver) {
            doSetProperty("entityResolver", entityResolver);
            return this;
        }
        /**
         * Allows to configure to use a custom
         * javax.xml.transform.ErrorListener. Beware when doing this then the
         * default error listener which captures any errors or fatal errors and
         * store information on the Exchange as properties is not in use. So
         * only use this option for special use-cases.
         * 
         * The option is a: <code>javax.xml.transform.ErrorListener</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder errorListener(
                Object errorListener) {
            doSetProperty("errorListener", errorListener);
            return this;
        }
        /**
         * Allows to configure to use a custom
         * javax.xml.transform.ErrorListener. Beware when doing this then the
         * default error listener which captures any errors or fatal errors and
         * store information on the Exchange as properties is not in use. So
         * only use this option for special use-cases.
         * 
         * The option will be converted to a
         * <code>javax.xml.transform.ErrorListener</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder errorListener(
                String errorListener) {
            doSetProperty("errorListener", errorListener);
            return this;
        }
        /**
         * Allows you to use a custom
         * org.apache.camel.builder.xml.ResultHandlerFactory which is capable of
         * using custom org.apache.camel.builder.xml.ResultHandler types.
         * 
         * The option is a:
         * <code>org.apache.camel.component.xslt.ResultHandlerFactory</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder resultHandlerFactory(
                Object resultHandlerFactory) {
            doSetProperty("resultHandlerFactory", resultHandlerFactory);
            return this;
        }
        /**
         * Allows you to use a custom
         * org.apache.camel.builder.xml.ResultHandlerFactory which is capable of
         * using custom org.apache.camel.builder.xml.ResultHandler types.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.xslt.ResultHandlerFactory</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder resultHandlerFactory(
                String resultHandlerFactory) {
            doSetProperty("resultHandlerFactory", resultHandlerFactory);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * To use a custom XSLT transformer factory.
         * 
         * The option is a: <code>javax.xml.transform.TransformerFactory</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder transformerFactory(
                Object transformerFactory) {
            doSetProperty("transformerFactory", transformerFactory);
            return this;
        }
        /**
         * To use a custom XSLT transformer factory.
         * 
         * The option will be converted to a
         * <code>javax.xml.transform.TransformerFactory</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder transformerFactory(
                String transformerFactory) {
            doSetProperty("transformerFactory", transformerFactory);
            return this;
        }
        /**
         * To use a custom XSLT transformer factory, specified as a FQN class
         * name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder transformerFactoryClass(
                String transformerFactoryClass) {
            doSetProperty("transformerFactoryClass", transformerFactoryClass);
            return this;
        }
        /**
         * A configuration strategy to apply on freshly created instances of
         * TransformerFactory.
         * 
         * The option is a:
         * <code>org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder transformerFactoryConfigurationStrategy(
                Object transformerFactoryConfigurationStrategy) {
            doSetProperty("transformerFactoryConfigurationStrategy", transformerFactoryConfigurationStrategy);
            return this;
        }
        /**
         * A configuration strategy to apply on freshly created instances of
         * TransformerFactory.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder transformerFactoryConfigurationStrategy(
                String transformerFactoryConfigurationStrategy) {
            doSetProperty("transformerFactoryConfigurationStrategy", transformerFactoryConfigurationStrategy);
            return this;
        }
        /**
         * To use a custom javax.xml.transform.URIResolver.
         * 
         * The option is a: <code>javax.xml.transform.URIResolver</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder uriResolver(Object uriResolver) {
            doSetProperty("uriResolver", uriResolver);
            return this;
        }
        /**
         * To use a custom javax.xml.transform.URIResolver.
         * 
         * The option will be converted to a
         * <code>javax.xml.transform.URIResolver</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltSaxonEndpointBuilder uriResolver(String uriResolver) {
            doSetProperty("uriResolver", uriResolver);
            return this;
        }
    }

    /**
     * Proxy enum for <code>org.apache.camel.component.xslt.XsltOutput</code>
     * enum.
     */
    enum XsltOutput {
        string,
        bytes,
        DOM,
        file;
    }
    /**
     * XSLT Saxon (camel-xslt-saxon)
     * Transforms the message using a XSLT template using Saxon.
     * 
     * Category: core,transformation
     * Since: 3.0
     * Maven coordinates: org.apache.camel:camel-xslt-saxon
     * 
     * Syntax: <code>xslt-saxon:resourceUri</code>
     * 
     * Path parameter: resourceUri (required)
     * Path to the template. The following is supported by the default
     * URIResolver. You can prefix with: classpath, file, http, ref, or bean.
     * classpath, file and http loads the resource using these protocols
     * (classpath is default). ref will lookup the resource in the registry.
     * bean will call a method on a bean to be used as the resource. For bean
     * you can specify the method name after dot, eg bean:myBean.myMethod
     */
    default XsltSaxonEndpointBuilder xsltSaxon(String path) {
        class XsltSaxonEndpointBuilderImpl extends AbstractEndpointBuilder implements XsltSaxonEndpointBuilder, AdvancedXsltSaxonEndpointBuilder {
            public XsltSaxonEndpointBuilderImpl(String path) {
                super("xslt-saxon", path);
            }
        }
        return new XsltSaxonEndpointBuilderImpl(path);
    }
}