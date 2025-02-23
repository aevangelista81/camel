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
package org.apache.camel.component.micrometer.eventnotifier;

import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

class MicrometerExchangeEventNotifierNamingStrategyTest {

    @Test
    void testDefaultFormatName() {
        MicrometerExchangeEventNotifierNamingStrategy defaultStrategy = MicrometerExchangeEventNotifierNamingStrategy.DEFAULT;

        String result = defaultStrategy.formatName("some.metric.name");

        assertThat(result).isEqualTo("some.metric.name");
    }

    @Test
    void testLegacyFormatName() {
        MicrometerExchangeEventNotifierNamingStrategy legacyStrategy = MicrometerExchangeEventNotifierNamingStrategy.LEGACY;

        String result = legacyStrategy.formatName("some.metric.name");

        assertThat(result).isEqualTo("SomeMetricName");
    }

    @Test
    void getDefaultInflightExchangesName() {
        Exchange exchange = mock(Exchange.class);
        Endpoint endpoint = mock(Endpoint.class);
        MicrometerExchangeEventNotifierNamingStrategy defaultStrategy = MicrometerExchangeEventNotifierNamingStrategy.DEFAULT;
        String result = defaultStrategy.getInflightExchangesName(exchange, endpoint);

        assertThat(result).isEqualTo("camel.exchanges.inflight");
    }

    @Test
    void getLegacyInflightExchangesName() {
        Exchange exchange = mock(Exchange.class);
        Endpoint endpoint = mock(Endpoint.class);
        MicrometerExchangeEventNotifierNamingStrategy defaultStrategy = MicrometerExchangeEventNotifierNamingStrategy.LEGACY;
        String result = defaultStrategy.getInflightExchangesName(exchange, endpoint);

        assertThat(result).isEqualTo("CamelExchangesInflight");
    }

}
