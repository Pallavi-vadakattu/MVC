package com.mvi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mvi.bean.CatelogList;
import com.mvi.service.CatelogService;

@RestController
public class CatelogResource {

	@Autowired
	private CatelogService catelogService;
	@GetMapping(value="/catelogs/{id}")
	public CatelogList getDetbyId(@PathVariable String id)
	{
		return catelogService.getCatelogbyId(id);
		
	}
}
