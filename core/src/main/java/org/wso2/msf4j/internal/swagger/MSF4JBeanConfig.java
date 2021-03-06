/*
 *  Copyright (c) 2005-2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.wso2.msf4j.internal.swagger;

import io.swagger.jaxrs.config.BeanConfig;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Swagger BeanConfig for MS4J. We don't need to do a package scan because we know the services in advance, hence
 * we have overridden the classes method.
 */
public class MSF4JBeanConfig extends BeanConfig {
    private Set<Class<?>> classes = new HashSet<>();

    @Override
    public Set<Class<?>> classes() {
        return Collections.unmodifiableSet(classes);
    }

    public void addServiceClass(Class<?> clazz) {
        classes.add(clazz);
    }
}
