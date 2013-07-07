/*
 * The MIT License (MIT)
 * 
 * Copyright (c) 2013 Jeff Nelson, Cinchapi Software Collective
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.cinchapi.concourse.server.engine;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

import org.cinchapi.common.annotate.PackagePrivate;
import org.cinchapi.common.annotate.UtilityClass;

import org.cinchapi.concourse.thrift.Operator;
import org.cinchapi.concourse.thrift.TObject;

/**
 * A collection of Callables and other tools for {@link BufferingService} objects.
 * 
 * @author jnelson
 */
@UtilityClass
@PackagePrivate
final class BufferingServices {

	/**
	 * Invokes the {@link Readable#audit(long)} method on {@code store}.
	 * 
	 * @param store
	 * @param record
	 * @return the method result
	 */
	public static Callable<Map<Long, String>> invokeAuditCallable(
			final Readable store, final long record) {
		return new Callable<Map<Long, String>>() {

			@Override
			public Map<Long, String> call() throws Exception {
				return store.audit(record);
			}

		};

	}

	/**
	 * Invokes the {@link Readable#describe(long)} method on {@code store}.
	 * 
	 * @param store
	 * @param record
	 * @return the method result
	 */
	public static Callable<Set<String>> invokeDescribeCallable(final Readable store,
			final long record) {
		return new Callable<Set<String>>() {

			@Override
			public Set<String> call() throws Exception {
				return store.describe(record);
			}

		};
	}

	/**
	 * Invokes the {@link Readable#describe(long, long)} method on
	 * {@code store}.
	 * 
	 * @param store
	 * @param record
	 * @param timestamp
	 * @return the method result
	 */
	public static Callable<Set<String>> invokeDescribeCallable(final Readable store,
			final long record, final long timestamp) {
		return new Callable<Set<String>>() {

			@Override
			public Set<String> call() throws Exception {
				return store.describe(record, timestamp);
			}

		};
	}

	/**
	 * Invokes the {@link Readable#audit(String, long)} method on {@code store}.
	 * 
	 * @param store
	 * @param key
	 * @param record
	 * @return the method result
	 */
	public static Callable<Map<Long, String>> invokeAuditCallable(
			final Readable store, final String key, final long record) {
		return new Callable<Map<Long, String>>() {

			@Override
			public Map<Long, String> call() throws Exception {
				return store.audit(key, record);
			}

		};

	}

	/**
	 * Invokes the {@link Readable#fetch(String, long)} method on {@code store}.
	 * 
	 * @param store
	 * @param key
	 * @param record
	 * @return the method result
	 */
	public static Callable<Set<TObject>> invokeFetchCallable(
			final Readable store, final String key, final long record) {
		return new Callable<Set<TObject>>() {

			@Override
			public Set<TObject> call() throws Exception {
				return store.fetch(key, record);
			}

		};
	}

	/**
	 * Invokes the {@link Readable#fetch(String, long, long)} method on
	 * {@code store}.
	 * 
	 * @param store
	 * @param key
	 * @param record
	 * @param timestamp
	 * @return the method result
	 */
	public static Callable<Set<TObject>> invokeFetchCallable(
			final Readable store, final String key, final long record,
			final long timestamp) {
		return new Callable<Set<TObject>>() {

			@Override
			public Set<TObject> call() throws Exception {
				return store.fetch(key, record, timestamp);
			}

		};
	}

	/**
	 * Invokes the {@link Readable#find(String, Operator, TObject...)} method on
	 * {@code store}.
	 * 
	 * @param store
	 * @param key
	 * @param operator
	 * @param values
	 * @return the method result
	 */
	public static Callable<Set<Long>> invokeFindCallable(final Readable store,
			final String key, final Operator operator, final TObject... values) {
		return new Callable<Set<Long>>() {

			@Override
			public Set<Long> call() throws Exception {
				return store.find(key, operator, values);
			} 

		};

	}

	/**
	 * Invokes the {@link Readable#find(long, String, Operator, TObject...)}
	 * method on {@code store}.
	 * 
	 * @param store
	 * @param timestamp
	 * @param key
	 * @param operator
	 * @param values
	 * @return the method result
	 */
	public static Callable<Set<Long>> invokeFindCallable(final Readable store,
			final long timestamp, final String key,
			final Operator operator, final TObject... values) {
		return new Callable<Set<Long>>() {

			@Override
			public Set<Long> call() throws Exception {
				return store.find(timestamp, key, operator, values);
			}

		};

	}

	/**
	 * Invokes the {@link Readable#ping(long)} method on {@code store}.
	 * 
	 * @param store
	 * @param record
	 * @return the method result
	 */
	public static Callable<Boolean> invokePingCallable(final Readable store,
			final long record) {
		return new Callable<Boolean>() {

			@Override
			public Boolean call() throws Exception {
				return store.ping(record);
			}

		};
	}

	/**
	 * Invokes the {@link Readable#search(String, String)} method on
	 * {@code store}.
	 * 
	 * @param store
	 * @param key
	 * @param query
	 * @return the method result
	 */
	public static Callable<Set<Long>> invokeSearchCallable(
			final Readable store, final String key, final String query) {
		return new Callable<Set<Long>>() {

			@Override
			public Set<Long> call() throws Exception {
				return store.search(key, query);
			}

		};
	}

	/**
	 * Invokes the {@link Readable#verify(String, TObject, long)} method on
	 * {@code store}.
	 * 
	 * @param store
	 * @param key
	 * @param value
	 * @param record
	 * @return the method result
	 */
	public static Callable<Boolean> invokeVerifyCallable(final Readable store,
			final String key, final TObject value, final long record) {
		return new Callable<Boolean>() {

			@Override
			public Boolean call() throws Exception {
				return store.verify(key, value, record);
			}

		};
	}

	/**
	 * Invokes the {@link Readable#verify(String, TObject, long, long)}
	 * method on {@code store}.
	 * 
	 * @param store
	 * @param key
	 * @param value
	 * @param record
	 * @param timestamp
	 * @return the method result
	 */
	public static Callable<Boolean> invokeVerifyCallable(final Readable store,
			final String key, final TObject value, final long record,
			final long timestamp) {
		return new Callable<Boolean>() {

			@Override
			public Boolean call() throws Exception {
				return store.verify(key, value, record, timestamp);
			}

		};
	}

}
