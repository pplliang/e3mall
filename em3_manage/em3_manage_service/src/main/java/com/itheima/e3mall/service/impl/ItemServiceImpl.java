package com.itheima.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.e3mall.mapper.TbItemMapper;
import com.itheima.e3mall.pojo.TbItem;
import com.itheima.e3mall.service.ItemService;
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private TbItemMapper tbItemMapper;

	@Override
	public TbItem getItemById( long id) {
		// TODO Auto-generated method stub
		TbItem item = tbItemMapper.selectByPrimaryKey(id);
		return item;
	}

}
