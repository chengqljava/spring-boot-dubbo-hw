package com.hw.service.person.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.person.dto.PersonDTO;
import com.hw.person.interfaces.PersonSericeInterface;
@Service
public class PersonSericeImpl implements  PersonSericeInterface {

	@Override
	@Transactional
	public void save(PersonDTO personDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PersonDTO> list(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
