package jp.co.mforce.resource;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetUserInfoResource {

	/** ユーザ名 */
	@NotEmpty(message = "userNameは必須項目")
	private String userName;

	/** メールアドレス */
	@NotEmpty(message = "mailAddressは必須項目")
	private String mailAddress;

}
