package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.default.extension.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-10 20:12:08
 */
public class AlipayOpenPublicDefaultExtensionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1298158989283744424L;

	/** 
	 * 一套扩展区的key，创建一套扩展区成功后，支付宝会将该字段返回，后续对扩展区进行删除等操作都会用到这个值。
	 */
	@ApiField("extension_key")
	private String extensionKey;

	public void setExtensionKey(String extensionKey) {
		this.extensionKey = extensionKey;
	}
	public String getExtensionKey( ) {
		return this.extensionKey;
	}

}
