package jp.co.mforce.resource;

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
	private String userName;

	/** メールアドレス */
	private String mailAddress;

}
