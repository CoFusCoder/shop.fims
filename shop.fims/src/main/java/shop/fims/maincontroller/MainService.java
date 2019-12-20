package shop.fims.maincontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Main;

@Service
public class MainService {
	@Autowired MainMapper mainMapper;
	
	public Main selectFestByFestcd(String fest_cd) {
		return mainMapper.selectFestByFestcd(fest_cd);
	}
	

}
