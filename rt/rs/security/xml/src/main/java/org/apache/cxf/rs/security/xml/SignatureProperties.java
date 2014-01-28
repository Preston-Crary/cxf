/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.cxf.rs.security.xml;

public class SignatureProperties {
    private String signatureAlgo;
    private String signatureDigestAlgo;
    private String signatureC14Method;
    private String signatureC14Transform;
    private String signatureKeyIdType;
    
    public void setSignatureAlgo(String signatureAlgo) {
        this.signatureAlgo = signatureAlgo;
    }
    public String getSignatureAlgo() {
        return signatureAlgo;
    }
    public void setSignatureDigestAlgo(String signatureDigestAlgo) {
        this.signatureDigestAlgo = signatureDigestAlgo;
    }
    public String getSignatureDigestAlgo() {
        return signatureDigestAlgo;
    }
    public void setSignatureC14Method(String signatureC14Method) {
        this.signatureC14Method = signatureC14Method;
    }
    public String getSignatureC14Method() {
        return signatureC14Method;
    }
    public void setSignatureC14Transform(String signatureC14Transform) {
        this.signatureC14Transform = signatureC14Transform;
    }
    public String getSignatureC14Transform() {
        return signatureC14Transform;
    }
    public String getSignatureKeyIdType() {
        return signatureKeyIdType;
    }
    public void setSignatureKeyIdType(String signatureKeyIdType) {
        this.signatureKeyIdType = signatureKeyIdType;
    }
    
}
