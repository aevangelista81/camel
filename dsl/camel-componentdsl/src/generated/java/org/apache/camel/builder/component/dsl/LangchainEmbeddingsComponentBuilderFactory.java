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
package org.apache.camel.builder.component.dsl;

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.langchain.embeddings.LangchainEmbeddingsComponent;

/**
 * Perform operations on the Qdrant Vector Database.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface LangchainEmbeddingsComponentBuilderFactory {

    /**
     * Langchain4j Embeddings (camel-langchain-embeddings)
     * Perform operations on the Qdrant Vector Database.
     * 
     * Category: ai
     * Since: 4.5
     * Maven coordinates: org.apache.camel:camel-langchain-embeddings
     * 
     * @return the dsl builder
     */
    static LangchainEmbeddingsComponentBuilder langchainEmbeddings() {
        return new LangchainEmbeddingsComponentBuilderImpl();
    }

    /**
     * Builder for the Langchain4j Embeddings component.
     */
    interface LangchainEmbeddingsComponentBuilder
            extends
                ComponentBuilder<LangchainEmbeddingsComponent> {
        /**
         * The configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.langchain.embeddings.LangchainEmbeddingsConfiguration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default LangchainEmbeddingsComponentBuilder configuration(
                org.apache.camel.component.langchain.embeddings.LangchainEmbeddingsConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * The EmbeddingModel engine to use.
         * 
         * The option is a:
         * &lt;code&gt;dev.langchain4j.model.embedding.EmbeddingModel&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param embeddingModel the value to set
         * @return the dsl builder
         */
        default LangchainEmbeddingsComponentBuilder embeddingModel(
                dev.langchain4j.model.embedding.EmbeddingModel embeddingModel) {
            doSetProperty("embeddingModel", embeddingModel);
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
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default LangchainEmbeddingsComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default LangchainEmbeddingsComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    }

    class LangchainEmbeddingsComponentBuilderImpl
            extends
                AbstractComponentBuilder<LangchainEmbeddingsComponent>
            implements
                LangchainEmbeddingsComponentBuilder {
        @Override
        protected LangchainEmbeddingsComponent buildConcreteComponent() {
            return new LangchainEmbeddingsComponent();
        }
        private org.apache.camel.component.langchain.embeddings.LangchainEmbeddingsConfiguration getOrCreateConfiguration(
                org.apache.camel.component.langchain.embeddings.LangchainEmbeddingsComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.langchain.embeddings.LangchainEmbeddingsConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((LangchainEmbeddingsComponent) component).setConfiguration((org.apache.camel.component.langchain.embeddings.LangchainEmbeddingsConfiguration) value); return true;
            case "embeddingModel": getOrCreateConfiguration((LangchainEmbeddingsComponent) component).setEmbeddingModel((dev.langchain4j.model.embedding.EmbeddingModel) value); return true;
            case "lazyStartProducer": ((LangchainEmbeddingsComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((LangchainEmbeddingsComponent) component).setAutowiredEnabled((boolean) value); return true;
            default: return false;
            }
        }
    }
}