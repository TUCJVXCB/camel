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

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Google BigQuery data warehouse for analytics.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GoogleBigQueryEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Google BigQuery component.
     */
    public interface GoogleBigQueryEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedGoogleBigQueryEndpointBuilder advanced() {
            return (AdvancedGoogleBigQueryEndpointBuilder) this;
        }
        /**
         * ConnectionFactory to obtain connection to Bigquery Service. If non
         * provided the default will be used.
         * 
         * The option is a:
         * <code>org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory</code> type.
         * 
         * Group: producer
         */
        default GoogleBigQueryEndpointBuilder connectionFactory(
                Object connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * ConnectionFactory to obtain connection to Bigquery Service. If non
         * provided the default will be used.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory</code> type.
         * 
         * Group: producer
         */
        default GoogleBigQueryEndpointBuilder connectionFactory(
                String connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
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
        default GoogleBigQueryEndpointBuilder lazyStartProducer(
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
        default GoogleBigQueryEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Field name to use as insert id.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default GoogleBigQueryEndpointBuilder useAsInsertId(String useAsInsertId) {
            doSetProperty("useAsInsertId", useAsInsertId);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Google BigQuery component.
     */
    public interface AdvancedGoogleBigQueryEndpointBuilder
            extends
                EndpointProducerBuilder {
        default GoogleBigQueryEndpointBuilder basic() {
            return (GoogleBigQueryEndpointBuilder) this;
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
        default AdvancedGoogleBigQueryEndpointBuilder basicPropertyBinding(
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
        default AdvancedGoogleBigQueryEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
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
        default AdvancedGoogleBigQueryEndpointBuilder synchronous(
                boolean synchronous) {
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
        default AdvancedGoogleBigQueryEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Google BigQuery (camel-google-bigquery)
     * Google BigQuery data warehouse for analytics.
     * 
     * Category: cloud,messaging
     * Since: 2.20
     * Maven coordinates: org.apache.camel:camel-google-bigquery
     * 
     * Syntax: <code>google-bigquery:projectId:datasetId:tableId</code>
     * 
     * Path parameter: projectId (required)
     * Google Cloud Project Id
     * 
     * Path parameter: datasetId (required)
     * BigQuery Dataset Id
     * 
     * Path parameter: tableId
     * BigQuery table id
     */
    default GoogleBigQueryEndpointBuilder googleBigquery(String path) {
        class GoogleBigQueryEndpointBuilderImpl extends AbstractEndpointBuilder implements GoogleBigQueryEndpointBuilder, AdvancedGoogleBigQueryEndpointBuilder {
            public GoogleBigQueryEndpointBuilderImpl(String path) {
                super("google-bigquery", path);
            }
        }
        return new GoogleBigQueryEndpointBuilderImpl(path);
    }
}