/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wikimore.mlog;

/**
 * Wrapper exception when initializing Log
 * 
 * @author ted created on 2013-5-17
 * @since 1.0
 */
public class LogInitException extends RuntimeException {

	/**  */
	private static final long serialVersionUID = -2231595628576980218L;

	public LogInitException() {
		super();
	}

	public LogInitException(String message, Throwable cause) {
		super(message, cause);
	}

	public LogInitException(String message) {
		super(message);
	}

	public LogInitException(Throwable cause) {
		super(cause);
	}

}
