package com.hw.person.interfaces;

import java.util.List;

import com.hw.person.dto.PersonDTO;

/**
 * 个人信息
 * @author chengql
 *
 */
public interface PersonSericeInterface {
	/**保存
	 * @param personDTO
	 * 保存信息
	 */
	void save(PersonDTO personDTO);
	/**
	 * @param name
	 * @return
	 * 通过姓名查找列表
	 */
	List<PersonDTO> list(String name);
	/**
	 * @param id
	 * 删除
	 */
	void delete(String id);

}
