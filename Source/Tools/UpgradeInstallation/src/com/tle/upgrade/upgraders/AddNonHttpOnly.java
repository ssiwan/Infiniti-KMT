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

package com.tle.upgrade.upgraders;

import java.io.File;

import com.tle.upgrade.UpgradeResult;

/**
 * Obsolete
 * 
 * @author Aaron
 */
@SuppressWarnings("nls")
@Deprecated
public class AddNonHttpOnly extends AbstractUpgrader
{
	public static final String ID = "AddNonHttpOnly";

	@Override
	public String getId()
	{
		return ID;
	}

	@Override
	public boolean isBackwardsCompatible()
	{
		return true;
	}

	@Override
	public void upgrade(UpgradeResult result, File tleInstallDir) throws Exception
	{
		// File tomcatConfFolder = new File(new File(tleInstallDir, "tomcat"),
		// "conf");
		// new LineFileModifier(new File(tomcatConfFolder, "context.xml"),
		// result)
		// {
		// @Override
		// protected String processLine(String line)
		// {
		// if( line.trim().startsWith("<Context") &&
		// !line.contains("useHttpOnly=\"false\"") )
		// {
		// return "<Context useHttpOnly=\"false\">";
		// }
		// return line;
		// }
		// }.update();
		obsoleteError();
	}
}