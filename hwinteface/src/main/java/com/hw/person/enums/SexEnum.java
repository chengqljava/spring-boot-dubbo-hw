package com.hw.person.enums;

/**
 * @author chengql
 * 性别
 *
 */
public enum SexEnum {
	MALE(1,"男"),FEMALE(2,"女");
	 /**状态码*/
    private int    code;

    /**状态描述*/
    private String desc;
    
    /**
     * 构造函数
     * 
     * @param code 状态
     * @param desc 状态描述
     */
    private SexEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    /**
     * 根据状态码获取状态枚举
     * 
     * @param code        状态码
     * @return DicDataStatus 状态枚举
     */
    public static SexEnum getStatusByCode(int code) {
    	SexEnum[] values = SexEnum.values();
        for (SexEnum status : values) {
            if (status.getCode() == code) {
                return status;
            }
        }
        return null;
    }

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}



}
