package jp.co.mforce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.mforce.resource.GetUserInfoResource;
import jp.co.mforce.service.GetUserInfoService;

@RestController
public class GetUserInfoController {

	@Autowired
	GetUserInfoService service;

    @GetMapping("/userInfo")
    public Object getUserInfo(
    		final GetUserInfoResource request,
			final BindingResult bindingResult) {

		return service.createUserInfo(
				request,
				bindingResult);
    }
}