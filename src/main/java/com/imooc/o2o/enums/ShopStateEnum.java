package com.imooc.o2o.enums;

public enum ShopStateEnum {
	
	CHECK(0, "checking"), 
	OFFLINE(-1, "offline"), 
	SUCCESS(1, "success"), 
	PASS(2, "pass"), 
	INNER_ERROR(-1001,"inner error"),
	NULL_SHOPID(-1002, "ShopId null"),
	NULL_SHOP(-1003, "shop null");
	
	private int state;
	private String stateInfo;

	private ShopStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}
	
	/**
	 * 依据传入的state返回相应的enum值
	 */
	public static ShopStateEnum stateOf(int state) {
		for (ShopStateEnum stateEnum : values()) {
			if (stateEnum.getState() == state) {
				return stateEnum;
			}
		}
		return null;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}
}
