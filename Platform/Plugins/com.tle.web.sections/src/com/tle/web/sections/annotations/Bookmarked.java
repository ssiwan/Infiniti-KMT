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

package com.tle.web.sections.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.tle.web.sections.events.BookmarkEvent;
import com.tle.web.sections.events.ParametersEvent;
import com.tle.web.sections.registry.handler.BookmarkRegistrationHandler;

/**
 * Annotation to mark a {@code Model} field/property as participating in the
 * {@link BookmarkEvent} and {@link ParametersEvent} processing.
 * <p>
 * Various flags determine when the property is to be included in a particular
 * {@code BookmarkEvent}.
 * <p>
 * The value of a property is restored when a {@link ParametersEvent} is
 * processed by the listener generated by the
 * {@link BookmarkRegistrationHandler}.
 * 
 * @author jmaginnis
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Bookmarked
{
	/**
	 * This flag determines whether or not to add to the bookmark if the
	 * {@link BookmarkEvent#isRendering()} flag is set. If
	 * {@link BookmarkEvent#isRendering()} is set, the property will only be
	 * added to the bookmark if the rendered flag is false <b>or</b> the
	 * {@code Section} that contains this {@code Model} hasn't been rendered.
	 * <p>
	 * Essentially you set this flag if you want to do your own rendering of the
	 * {@code <input>} tag, rather than allowing the system to just create a
	 * hidden {@code <input>} tag.
	 * 
	 * @return The rendered flag
	 */
	boolean rendered() default false;

	/**
	 * This flag is used to mark this property as being only used in the POST
	 * event handling phase of PRG. It will not be included in any bookmark
	 * unless the {@link BookmarkEvent#isRendering()} is set.
	 * 
	 * @return The stateful flag
	 */
	boolean stateful() default true;

	/**
	 * This flag controls whether or not to add bookmark values for "default"
	 * values.
	 * <p>
	 * Default values for primitive types ({@code 0, false}) will not be
	 * included in a bookmark unless this flag is set.
	 * <p>
	 * You would only set this to true if the default value for you property
	 * isn't a 0 or false.
	 * 
	 * @return The nodefault flag
	 */
	boolean nodefault() default false;

	/**
	 * This flag marks whether or not to treat a blank {@code String} as a null.
	 * <p>
	 * If this flag is set, the value will not be included in the bookmark if
	 * the string is blank.
	 * 
	 * @return The ignoreEmpty flag
	 */
	boolean ignoreEmpty() default false;

	/**
	 * Contexts which the bookmark event can filter by.
	 * 
	 * @return The contexts
	 */
	String[] contexts() default {};

	/**
	 * Selective bookmarking based on context.
	 * 
	 * @return A list of context's for which this property will be included
	 */
	String[] onlyForContext() default {};

	/**
	 * Selective bookmarking based on context.
	 * 
	 * @return A list of context's for which this property will be excluded
	 */
	String[] ignoreForContext() default {};

	/**
	 * The name of the property stored in the {@code BookmarkEvent}.
	 * <p>
	 * The name is always prefixed with the ID of the {@code Section} that this
	 * {@code Model} is for, followed by a '.' character. If no name is given,
	 * it will default to the name of the property.
	 * 
	 * @return The name to use in the {@code BookmarkEvent}
	 */
	String name() default "";

	String parameter() default "";

	boolean supported() default false;

	/**
	 * The "legacy" name of the property stored in the {@code BookmarkEvent}.
	 * <p>
	 * The legacy name is also checked, along with the standard {@link #name()},
	 * when decoding a {@code ParametersEvent}.
	 * 
	 * @return The "legacy" name to check in the {@code ParametersEvent}.
	 */
	String legacyName() default "";
}
