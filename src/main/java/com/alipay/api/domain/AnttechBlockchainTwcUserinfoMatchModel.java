package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息匹配
 *
 * @author auto create
 * @since 1.0, 2020-08-10 11:07:47
 */
public class AnttechBlockchainTwcUserinfoMatchModel extends AlipayObject {

	private static final long serialVersionUID = 3853192831999647763L;

	/**
	 * 移动号码hash后的字符串
	 */
	@ApiField("call_no_hash")
	private String callNoHash;

	/**
	 * 注册使用的用户名
	 */
	@ApiField("unify_no")
	private String unifyNo;

	/**
	 * 名字证件号对应的sha256的hash值
	 */
	@ApiField("unify_no_hash")
	private String unifyNoHash;

	public String getCallNoHash() {
		return this.callNoHash;
	}
	public void setCallNoHash(String callNoHash) {
		this.callNoHash = callNoHash;
	}

	public String getUnifyNo() {
		return this.unifyNo;
	}
	public void setUnifyNo(String unifyNo) {
		this.unifyNo = unifyNo;
	}

	public String getUnifyNoHash() {
		return this.unifyNoHash;
	}
	public void setUnifyNoHash(String unifyNoHash) {
		this.unifyNoHash = unifyNoHash;
	}

}
