package com.dao;

import com.entity.ShangkeqiandaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangkeqiandaoVO;
import com.entity.view.ShangkeqiandaoView;


/**
 * 上课签到
 * 
 * @author 
 * @email 
 * @date 2021-03-11 22:14:28
 */
public interface ShangkeqiandaoDao extends BaseMapper<ShangkeqiandaoEntity> {
	
	List<ShangkeqiandaoVO> selectListVO(@Param("ew") Wrapper<ShangkeqiandaoEntity> wrapper);
	
	ShangkeqiandaoVO selectVO(@Param("ew") Wrapper<ShangkeqiandaoEntity> wrapper);
	
	List<ShangkeqiandaoView> selectListView(@Param("ew") Wrapper<ShangkeqiandaoEntity> wrapper);

	List<ShangkeqiandaoView> selectListView(Pagination page,@Param("ew") Wrapper<ShangkeqiandaoEntity> wrapper);
	
	ShangkeqiandaoView selectView(@Param("ew") Wrapper<ShangkeqiandaoEntity> wrapper);
	
}
