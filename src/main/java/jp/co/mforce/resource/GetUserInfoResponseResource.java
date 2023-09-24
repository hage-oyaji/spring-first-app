package jp.co.mforce.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetUserInfoResponseResource {

	/** ユーザ名 */
	private String userName;

	/** メールアドレス */
	private String mailAddress;

	/** 年齢 */
	private int age;

	/** 性別 */
	private String sex;

}
