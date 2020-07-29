package com.imooc.o2o.web.shopadmin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="shopadmin" , method=RequestMethod.GET)
public class ShopAdminController {
	
	@RequestMapping(value="/shopoperation")
	//spring-web.xml 中已经设置了前后缀  viewResolver
	public String shopOperation() {
		return "shop/shopoperation";
	}
	
	@RequestMapping(value="/shoplist")
	//spring-web.xml 中已经设置了前后缀  viewResolver
	public String shopList() {
		return "shop/shoplist";
	}
	
	@RequestMapping(value="/shopmanagement")
	public String shopManagement() {
		return "shop/shopmanagement";
	}
	
	@RequestMapping(value="/productcategorymanagement")
	public String productCategoryManagement() {
		return "shop/productcategorymanagement";
	}
	
	@RequestMapping(value="/productoperation")
	public String productOperation() {
		return "shop/productoperation";
	}
	
	@RequestMapping(value="/productmanagement")
	public String productManagement() {
		return "shop/productmanagement";
	}

}
