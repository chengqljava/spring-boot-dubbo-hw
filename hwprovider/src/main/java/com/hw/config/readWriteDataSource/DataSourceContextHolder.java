package com.hw.config.readWriteDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 本地全局变量，切换数据源
 * @author chengql
 *
 */

public class DataSourceContextHolder {
	static Logger log = LoggerFactory.getLogger(DataSourceContextHolder.class);

	private static final ThreadLocal<String> local = new ThreadLocal<String>();

	public static ThreadLocal<String> getLocal() {
		return local;
	}

	/**
	 * 读可能是多个库
	 */
	public static void read() {
		local.set(DataSourceType.READ.getType());
	}

	/**
	 * 写只有一个库
	 */
	public static void write() {
		log.debug("writewritewrite");
		local.set(DataSourceType.WRITE.getType());
	}

	public static String getJdbcType() {
		return local.get();
	}
}
