package com.hw.config.readWriteDataSource;

/**
 * 枚举区分读写数据源
 * @author chengql
 *
 */
public enum DataSourceType {
	READ("read", "从库"), WRITE("write", "主库");

	/**
	 * 编码
	 */
	private String type;

	/**
	 * 描述
	 */
	private String desc;

	private DataSourceType(String type, String desc) {
		this.type = type;
		this.desc = desc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
