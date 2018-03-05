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

package com.dytech.installer;

import com.dytech.devlib.PropBagEx;
import com.dytech.gui.ExceptionDialog;

public class Installer
{
	public Installer(PropBagEx script, PropBagEx commands) throws InstallerException
	{
		Wizard w = new Wizard(script, commands);
		w.start();
		PropBagEx results = w.getOutput();

		try
		{
			Interpreter i = new Interpreter(commands, results, new ProgressWindow());
			i.execute();
		}
		catch( InstallerException ex )
		{

			ExceptionDialog dialog = new ExceptionDialog("Error During Installation",
				"An error has occurred performing the installation.  Please try to installing the application again.",
				"v1.0", ex);
			dialog.setTitle("Error During Installation");
			dialog.setVisible(true);
		}
	}

}