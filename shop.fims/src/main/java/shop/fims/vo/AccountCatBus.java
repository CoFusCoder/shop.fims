package shop.fims.vo;

public class AccountCatBus {
	
	private String catbus_acc_cd;	//거래처 업종 분류코드
	private String catbus_acc_bus;	//거래처업종분류
	
	public String getCatbus_acc_cd() {
		return catbus_acc_cd;
	}
	public void setCatbus_acc_cd(String catbus_acc_cd) {
		this.catbus_acc_cd = catbus_acc_cd;
	}
	public String getCatbus_acc_bus() {
		return catbus_acc_bus;
	}
	public void setCatbus_acc_bus(String catbus_acc_bus) {
		this.catbus_acc_bus = catbus_acc_bus;
	}
	@Override
	public String toString() {
		return "AccountCatBus [catbus_acc_cd=" + catbus_acc_cd + ", catbus_acc_bus=" + catbus_acc_bus + "]";
	}
}
