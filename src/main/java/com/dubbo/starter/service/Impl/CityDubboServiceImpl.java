package com.dubbo.starter.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.starter.pojo.City;
import com.dubbo.starter.service.CityDubboService;

@Service
public class CityDubboServiceImpl implements CityDubboService {

	@Override
	public City findCityByName(String cityName) {
		return new City(1L,2L,"广州","是我的故乡");
	}

}
