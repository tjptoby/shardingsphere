/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.dbtest.cases.assertion.dcl;

import lombok.Getter;
import org.apache.shardingsphere.dbtest.cases.assertion.root.IntegrateTestCase;

import javax.xml.bind.annotation.XmlElement;
import java.util.LinkedList;
import java.util.List;

/**
 * JAXB definition of DCL integrate test case.
 *
 * @author panjuan
 */
@Getter
public class DCLIntegrateTestCase extends IntegrateTestCase {
    
    @XmlElement(name = "assertion")
    private List<DCLIntegrateTestCaseAssertion> integrateTestCaseAssertions = new LinkedList<>();
}