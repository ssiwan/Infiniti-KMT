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

package com.tle.common;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

import com.google.common.base.Throwables;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

/**
 * @author Aaron
 */
public class NamedThreadFactory implements ThreadFactory
{
	private final Cache<String, AtomicInteger> threadNumber = CacheBuilder.newBuilder().concurrencyLevel(20).build();
	private final String name;
	private static final Builder builder = new Builder();

	public NamedThreadFactory(String name)
	{
		this.name = name;
	}

	@Override
	public Thread newThread(Runnable r)
	{
		try
		{
			final AtomicInteger ctr = threadNumber.get(name, builder);
			return new Thread(r, name + "-" + ctr.getAndIncrement());
		}
		catch( Throwable t )
		{
			throw Throwables.propagate(t);
		}
	}

	private static class Builder implements Callable<AtomicInteger>
	{
		@Override
		public AtomicInteger call() throws Exception
		{
			return new AtomicInteger(1);
		}
	}
}