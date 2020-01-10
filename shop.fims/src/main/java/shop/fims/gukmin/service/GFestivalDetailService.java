package shop.fims.gukmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.gukmin.mapper.GFestivalDetailMapper;

@Service
public class GFestivalDetailService {

	@Autowired
	private GFestivalDetailMapper gfestivalDetailMapper;
}
