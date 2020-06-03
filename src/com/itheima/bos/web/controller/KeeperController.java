package com.itheima.bos.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KeeperController {
	
	@RequestMapping("/cangg_base_kclr.action")
	public String kucunAdd(){
		return "cangg/kucun_add";
	}
	/**
	 * 业务员货物单
	 * @return
	 */
	@RequestMapping("/cangg_base_ywyhwd.action")
	public String ywyhwd(){
		return "cangg/ywyhwd";
	}
	/**
	 * 库存查询
	 */
	@RequestMapping("/cangg_base_kccx.action")
	public String showKuCun(){
		return "cangg/showkucun";
	}
	/**
	 * 来货记录
	 */
	@RequestMapping("/cangg_base_lhjl.action")
	public String inputRecord(){
		return "cangg/inputrecord";
	}
	
	/**
	 * 出货记录
	 * @return
	 */
	@RequestMapping("cangg_base_chjl.action")
	public String outputRecord(){
		return "cangg/outputrecord";
	}
	
	/**
	 * 商品数据字典
	 */
	@RequestMapping("/cangg_yueshu_cplxlr.action")
	public String addProductSJZD(){
		return "cangg/productsjzd";
	}
	/**
	 * 厂商数据字典
	 */
	@RequestMapping("/cangg_yueshu_cslr.action")
	public String addFactorySJZD(){
		return "cangg/factorysjzd";
	}
	/**
	 * 排单管理
	 */
	@RequestMapping("/cangg_order_ordershow.action")
	public String showorder(){
		return "cangg/showorder";
	}
}
