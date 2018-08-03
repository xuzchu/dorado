/*
 * Copyright 2017 The OpenDSP Project
 *
 * The OpenDSP Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package mobi.f2time.dorado.rest.util;

import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;

/**
 * 
 * @author wangwp
 */
public class LogUtils {
	public static final InternalLogger LOG = InternalLoggerFactory.getInstance("Dorado");

	public static void info(String msg) {
		LOG.info(msg);
	}

	public static void info(String format, Object... args) {
		LOG.info(format, args);
	}

	public static void debug(String msg) {
		LOG.debug(msg);
	}

	public static void debug(String format, Object... args) {
		LOG.debug(format, args);
	}

	public static void error(String msg, Throwable cause) {
		LOG.error(msg, cause);
	}

	public static void error(String format, Object... args) {
		LOG.error(format, args);
	}

	public static void warn(String msg) {
		LOG.warn(msg);
	}

	public static void warn(String format, Object... args) {
		LOG.warn(format, args);
	}
}
