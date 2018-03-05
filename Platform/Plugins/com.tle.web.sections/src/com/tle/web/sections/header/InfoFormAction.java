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

package com.tle.web.sections.header;

import java.util.Map;

import com.tle.web.sections.SectionInfo;
import com.tle.web.sections.events.EventAuthoriser;
import com.tle.web.sections.generic.InfoBookmark;

public class InfoFormAction implements FormAction
{
	private InfoBookmark bookmark;
	private Map<String, String[]> hiddenState;

	public InfoFormAction(InfoBookmark bookmark)
	{
		this.bookmark = bookmark;
	}

	@Override
	public String getFormAction()
	{
		return bookmark.getPath();
	}

	@Override
	public Map<String, String[]> getHiddenState()
	{
		if( hiddenState == null )
		{
			hiddenState = bookmark.getBookmarkParams();
			SectionInfo info = bookmark.getInfo();
			EventAuthoriser authoriser = info.getAttributeForClass(EventAuthoriser.class);
			if( authoriser != null )
			{
				authoriser.addToBookmark(info, hiddenState);
			}
		}
		return hiddenState;
	}

}
