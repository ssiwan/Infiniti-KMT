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

package com.tle.web.sections.equella.freemarker;

import java.util.Map;

import com.tle.annotation.NonNullByDefault;
import com.tle.web.freemarker.methods.AbstractRenderDirective;
import com.tle.web.sections.render.SectionRenderable;
import com.tle.web.sections.standard.RendererFactory;

import freemarker.template.TemplateModel;

@NonNullByDefault
public class RenderDirective extends AbstractRenderDirective
{
	private final RendererFactory factory;

	public RenderDirective(RendererFactory factory)
	{
		this.factory = factory;
	}

	@Override
	protected SectionRenderable getRenderable(Object wrapped, Map<String, TemplateModel> params)
	{
		return ChooseRenderer.getSectionRenderable(getSectionWriter(), wrapped, getParam("type", //$NON-NLS-1$
			params), factory);
	}
}
