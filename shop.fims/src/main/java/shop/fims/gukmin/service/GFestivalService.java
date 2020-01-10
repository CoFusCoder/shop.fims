package shop.fims.gukmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.gukmin.mapper.GFestivalMapper;

@Service
public class GFestivalService {

	@Autowired
	private GFestivalMapper gfestivalMapper;
}
