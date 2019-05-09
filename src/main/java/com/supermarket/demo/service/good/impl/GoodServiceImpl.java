package com.supermarket.demo.service.good.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.IdGenerator;
import org.springframework.util.StringUtils;

import com.supermarket.demo.dao.good.SuGoodsMapper;
import com.supermarket.demo.dao.good.SuKindMapper;
import com.supermarket.demo.model.admin.Admin;
import com.supermarket.demo.model.admin.UserHolder;
import com.supermarket.demo.model.good.SuGoods;
import com.supermarket.demo.model.good.SuKind;
import com.supermarket.demo.service.good.GoodService;
import com.supermarket.demo.util.NumberUtil;

@Service
@Transactional(readOnly = true)
public class GoodServiceImpl implements GoodService {

	@Autowired
	private SuKindMapper kindMapper;
	
	@Autowired
	private SuGoodsMapper goodsMapper;
	
	public List<SuKind> queryKind() {
		List<SuKind> kinds = kindMapper.queryKind();
		return kinds;
	}

	@Transactional(readOnly = false)
	public void saveKind(SuKind kind) {
		Admin user = UserHolder.getUser();
		Date date = new Date();
		Long id = NumberUtil.generate10Long();
		kind.setCreatedDate(date);
		kind.setIsDelete(false);
		kind.setId(id);
		kind.setCreatedBy(user.getId());
		
		kindMapper.insertSelective(kind);
	}

	@Transactional(readOnly = false)
	public void delete(Long id) {
		kindMapper.delete(id);
	}

	public List<SuGoods> queryGoods() {
		List<SuGoods> goods = goodsMapper.queryGoods();
		return goods;
	}

	
	public void saveGoods(SuGoods goods) {
		Admin user = UserHolder.getUser();
		if(StringUtils.isEmpty(goods.getRemark())) {
			goods.setRemark(empty);
		}
		
		Date date = new Date();
		Long id = NumberUtil.generate10Long();
		
		goods.setId(id);
		goods.setCreatedBy(user.getId());
		goods.setCreatedDate(date);
		goods.setIsDelete(false);
		goodsMapper.insertSelective(goods);
		
	}

	public void deleteGoods(Long id) {
		goodsMapper.delete(id);
	}

}
