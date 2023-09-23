package jp.co.mforce.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import jp.co.mforce.resource.GetUserInfoResource;

@Service
public class GetUserInfoService {

	public Object createUserInfo(
			final GetUserInfoResource request,
			final BindingResult bindingResult) {

		GetUserInfoResource	getUserInfoResource = new GetUserInfoResource();
		getUserInfoResource.setUserName(request.getUserName());
		getUserInfoResource.setMailAddress(request.getMailAddress());

		return getUserInfoResource;
	}

}
