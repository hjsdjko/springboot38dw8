package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangkeqiandaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangkeqiandaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangkeqiandaoView;


/**
 * 上课签到
 *
 * @author 
 * @email 
 * @date 2021-03-11 22:14:28
 */
public interface ShangkeqiandaoService extends IService<ShangkeqiandaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangkeqiandaoVO> selectListVO(Wrapper<ShangkeqiandaoEntity> wrapper);
   	
   	ShangkeqiandaoVO selectVO(@Param("ew") Wrapper<ShangkeqiandaoEntity> wrapper);
   	
   	List<ShangkeqiandaoView> selectListView(Wrapper<ShangkeqiandaoEntity> wrapper);
   	
   	ShangkeqiandaoView selectView(@Param("ew") Wrapper<ShangkeqiandaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangkeqiandaoEntity> wrapper);
   	
}

