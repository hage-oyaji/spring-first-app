package jp.co.mforce.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jp.co.mforce.resource.GetUserInfoResource;

@Service
public class GetUserInfoService {

	public Object createUserInfo(
			final GetUserInfoResource request,
			final BindingResult bindingResult) throws JsonProcessingException {

		GetUserInfoResource	getUserInfoResource = new GetUserInfoResource();
		getUserInfoResource.setUserName(request.getUserName());
		getUserInfoResource.setMailAddress(request.getMailAddress());

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(getUserInfoResource);

		return (Object)json;
	}

}
