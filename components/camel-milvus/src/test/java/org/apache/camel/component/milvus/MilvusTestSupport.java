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
package org.apache.camel.component.milvus;

import java.net.URL;

import org.apache.camel.CamelContext;
import org.apache.camel.test.infra.milvus.services.MilvusService;
import org.apache.camel.test.infra.milvus.services.MilvusServiceFactory;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.RegisterExtension;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MilvusTestSupport extends CamelTestSupport {
    @RegisterExtension
    static MilvusService MILVUS = MilvusServiceFactory.createSingletonService();

    @Override
    protected CamelContext createCamelContext() throws Exception {
        CamelContext context = super.createCamelContext();

        URL url = new URL(MILVUS.getMilvusEndpointUrl());
        MilvusComponent component = context.getComponent(Milvus.SCHEME, MilvusComponent.class);
        component.getConfiguration().setHost(url.getHost());
        component.getConfiguration().setPort(url.getPort());

        return context;
    }
}
