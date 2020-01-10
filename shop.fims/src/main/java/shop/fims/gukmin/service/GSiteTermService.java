package shop.fims.gukmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.gukmin.mapper.GSiteTermMapper;

@Service
public class GSiteTermService {

	@Autowired
	private GSiteTermMapper gsiteTermMapper;
}
