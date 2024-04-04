/*
 * Copyright © 2015 Integrated Knowledge Management (support@ikm.dev)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.ikm.komet.amplify.om;

import dev.ikm.tinkar.common.id.PublicId;
import dev.ikm.tinkar.entity.ConceptEntity;
import dev.ikm.tinkar.terms.ConceptFacade;

public record DescrName(PublicId parentConcept, String nameText, ConceptFacade nameType, ConceptEntity caseSignificance, ConceptEntity status, ConceptEntity module, ConceptEntity language) {
    public DescrName (PublicId parentConcept) {
        this(parentConcept, null, null, null, null, null, null);
    }
    public DescrName (String nameText, ConceptFacade nameType, ConceptEntity caseSignificance, ConceptEntity status, ConceptEntity module, ConceptEntity language) {
        this(null, nameText, nameType, caseSignificance, status, module, language);
    }
}
