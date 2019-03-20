package com.hw.config.readWriteDataSource;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author King
 *
 */
@Aspect
@Component
public class DataSourceAop {
	static Logger log = LoggerFactory.getLogger(DataSourceAop.class);
	@Before("execution(* com.hw.mapper.*.select*(..)) || execution(* com.hw.mapper.*.count*(..))")
	public void setReadDataSourceType() {
		DataSourceContextHolder.read();
		log.info("dataSource切换到：Read");
	}

	@Before("execution(* com.hw.mapper.*.insert*(..)) || execution(* com.hw.mapper.*.update*(..)) || execution(* com.hw.mapper.*.delete*(..))")
	public void setWriteDataSourceType() {
		DataSourceContextHolder.write();
		log.info("dataSource切换到：write");
	}
}
