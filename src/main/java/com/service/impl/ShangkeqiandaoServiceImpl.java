package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShangkeqiandaoDao;
import com.entity.ShangkeqiandaoEntity;
import com.service.ShangkeqiandaoService;
import com.entity.vo.ShangkeqiandaoVO;
import com.entity.view.ShangkeqiandaoView;

@Service("shangkeqiandaoService")
public class ShangkeqiandaoServiceImpl extends ServiceImpl<ShangkeqiandaoDao, ShangkeqiandaoEntity> implements ShangkeqiandaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangkeqiandaoEntity> page = this.selectPage(
                new Query<ShangkeqiandaoEntity>(params).getPage(),
                new EntityWrapper<ShangkeqiandaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangkeqiandaoEntity> wrapper) {
		  Page<ShangkeqiandaoView> page =new Query<ShangkeqiandaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangkeqiandaoVO> selectListVO(Wrapper<ShangkeqiandaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangkeqiandaoVO selectVO(Wrapper<ShangkeqiandaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangkeqiandaoView> selectListView(Wrapper<ShangkeqiandaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangkeqiandaoView selectView(Wrapper<ShangkeqiandaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
