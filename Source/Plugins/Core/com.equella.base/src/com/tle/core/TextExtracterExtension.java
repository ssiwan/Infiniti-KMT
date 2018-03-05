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

package com.tle.core;

import java.io.IOException;
import java.io.InputStream;

import com.tle.beans.mime.MimeEntry;

/**
 * @author aholland
 */
public interface TextExtracterExtension
{
	void extractText(String mimeType, InputStream input, StringBuilder outputText, int maxSize) throws IOException;

	void setEnabledForMimeEntry(MimeEntry mimeType, boolean enabled);

	boolean isEnabledForMimeEntry(MimeEntry mimeEntry);

	boolean isMimeTypeSupported(String mimeType);

	String getNameKey();
}