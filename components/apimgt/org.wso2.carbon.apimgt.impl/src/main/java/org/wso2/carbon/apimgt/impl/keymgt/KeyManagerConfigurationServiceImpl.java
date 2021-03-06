/*
 *  Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.apimgt.impl.keymgt;

import org.wso2.carbon.apimgt.api.APIManagementException;
import org.wso2.carbon.apimgt.api.model.KeyManagerConfiguration;
import org.wso2.carbon.apimgt.impl.factory.KeyManagerHolder;

public class KeyManagerConfigurationServiceImpl implements KeyManagerConfigurationService {

    @Override
    public void addKeyManagerConfiguration(String organization, String name, String type,
                                           KeyManagerConfiguration keyManagerConfiguration)
            throws APIManagementException {

        String internKey = this.getClass().getName().concat(organization).concat(name);
        synchronized (internKey.intern()) {
            KeyManagerHolder.addKeyManagerConfiguration(organization, name, type, keyManagerConfiguration);
        }

    }

    @Override
    public void updateKeyManagerConfiguration(String organization, String name, String type,
                                              KeyManagerConfiguration keyManagerConfiguration)
            throws APIManagementException {

        String internKey = this.getClass().getName().concat(organization).concat(name);
        synchronized (internKey.intern()) {
            KeyManagerHolder.updateKeyManagerConfiguration(organization, name, type, keyManagerConfiguration);
        }
    }

    @Override
    public void removeKeyManagerConfiguration(String tenantDomain, String name) {

        String internKey = this.getClass().getName().concat(tenantDomain).concat(name);
        synchronized (internKey.intern()) {
            KeyManagerHolder.removeKeyManagerConfiguration(tenantDomain, name);
        }
    }
}
