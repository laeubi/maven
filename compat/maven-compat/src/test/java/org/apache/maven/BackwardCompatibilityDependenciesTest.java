/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.maven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Test to verify that backward compatibility dependencies from Maven 3.x are available.
 * See issue #11299 for context.
 */
class BackwardCompatibilityDependenciesTest {

    /**
     * Verify that javax.inject is available at compile time.
     */
    @Test
    void testJavaxInjectAvailable() {
        // This test verifies that javax.inject.Inject annotation is available
        Class<?> injectClass = javax.inject.Inject.class;
        assertNotNull(injectClass, "javax.inject.Inject should be available");
    }

    /**
     * Verify that Guice is available at compile time.
     */
    @Test
    void testGuiceAvailable() {
        // This test verifies that com.google.inject.Injector is available
        Class<?> injectorClass = com.google.inject.Injector.class;
        assertNotNull(injectorClass, "com.google.inject.Injector should be available");
    }

    /**
     * Verify that aopalliance is available at compile time.
     */
    @Test
    void testAopallianceAvailable() {
        // This test verifies that org.aopalliance.intercept.MethodInterceptor is available
        Class<?> methodInterceptorClass = org.aopalliance.intercept.MethodInterceptor.class;
        assertNotNull(methodInterceptorClass, "org.aopalliance.intercept.MethodInterceptor should be available");
    }
}
