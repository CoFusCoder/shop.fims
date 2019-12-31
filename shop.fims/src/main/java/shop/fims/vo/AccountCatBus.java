package shop.fims.vo;

public class AccountCatBus {
	
	private String catBusAccCd;	//거래처 업종 분류코드
	private String catBusAccBus;	//거래처업종분류
	
	public String getCatBusAccCd() {
		return catBusAccCd;
	}
	public void setCatBusAccCd(String catBusAccCd) {
		this.catBusAccCd = catBusAccCd;
	}
	public String getCatBusAccBus() {
		return catBusAccBus;
	}
	public void setCatBusAccBus(String catBusAccBus) {
		this.catBusAccBus = catBusAccBus;
	}
	@Override
	public String toString() {
		return "AccountCatBus [catBusAccCd=" + catBusAccCd + ", catBusAccBus=" + catBusAccBus + "]";
	}

	
}
