/*
 * Copyright 2017 Apereo
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

package com.tle.web.sections.equella.impl;

import com.tle.web.sections.SectionId;
import com.tle.web.sections.SectionInfo;
import com.tle.web.sections.SectionResult;
import com.tle.web.sections.annotations.TreeLookup;
import com.tle.web.sections.equella.AbstractRootModalSessionSection;
import com.tle.web.sections.equella.AbstractRootModalSessionSection.RootModalSessionModel;
import com.tle.web.sections.equella.ModalSession;
import com.tle.web.sections.events.RenderEventContext;

/**
 * @author aholland
 */
public class RootModalSessionSection extends AbstractRootModalSessionSection<RootModalSessionModel>
{
	@TreeLookup
	private ModalErrorSection errorSection;

	@Override
	public String getDefaultPropertyName()
	{
		return "_md"; //$NON-NLS-1$
	}

	@Override
	protected SectionId getErrorSection()
	{
		return errorSection;
	}

	@Override
	protected SectionResult getFinalRenderable(RenderEventContext context, RootModalSessionModel model)
	{
		return model.getParts().getNamedResult(context, "body"); //$NON-NLS-1$
	}

	@Override
	protected void setupModelForRender(SectionInfo info, RootModalSessionModel model)
	{
		// nothing
	}

	@Override
	protected Object getSessionKey()
	{
		return ModalSession.class;
	}
}
