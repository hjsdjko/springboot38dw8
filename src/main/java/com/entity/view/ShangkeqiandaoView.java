package com.entity.view;

import com.entity.ShangkeqiandaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 上课签到
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-11 22:14:28
 */
@TableName("shangkeqiandao")
public class ShangkeqiandaoView  extends ShangkeqiandaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangkeqiandaoView(){
	}
 
 	public ShangkeqiandaoView(ShangkeqiandaoEntity shangkeqiandaoEntity){
 	try {
			BeanUtils.copyProperties(this, shangkeqiandaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
