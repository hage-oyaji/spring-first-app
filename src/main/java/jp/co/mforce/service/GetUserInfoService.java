package jp.co.mforce.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jp.co.mforce.resource.GetUserInfoResource;
import jp.co.mforce.resource.GetUserInfoResponseResource;

@Service
public class GetUserInfoService {

	public Object createUserInfo(
			final GetUserInfoResource request,
			final BindingResult bindingResult) throws JsonProcessingException {

		GetUserInfoResponseResource	getUserInfoResponseResource = new GetUserInfoResponseResource();
		getUserInfoResponseResource.setUserName(request.getUserName());
		getUserInfoResponseResource.setMailAddress(request.getMailAddress());
		getUserInfoResponseResource.setAge(20);
		getUserInfoResponseResource.setSex("man");

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(getUserInfoResponseResource);

		return (Object)json;
	}

}
