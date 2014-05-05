/*
 * Copyright (C) 2010 The MobileSecurePay Project
 * All right reserved.
 * author: shiqun.shi@alipay.com
 * 
 *  提示：如何获取安全校验码和合作身份者id
 *  1.用您的签约支付宝账号登录支付宝网站(www.alipay.com)
 *  2.点击“商家服务”(https://b.alipay.com/order/myorder.htm)
 *  3.点击“查询合作者身份(pid)”、“查询安全校验码(key)”
 */

package cn.lovetennis.zfb;

//
// 请参考 Android平台安全支付服务(msp)应用开发接口(4.2 RSA算法签名)部分，并使用压缩包中的openssl RSA密钥生成工具，生成一套RSA公私钥。
// 这里签名时，只需要使用生成的RSA私钥。
// Note: 为安全起见，使用RSA私钥进行签名的操作过程，应该尽量放到商家服务器端去进行。
public final class Keys {

	//合作身份者id，以2088开头的16位纯数字
	public static final String DEFAULT_PARTNER = "2088112915240265";

	//收款支付宝账号
	public static final String DEFAULT_SELLER = "zli.eric@qq.com";

	//商户私钥，自助生成
	//public static final String PRIVATE ="MIICXQIBAAKBgQC78jk90FVxbCXJTd9K2aeHt3BOG7yMISF3wGjjT22ldZJ+8ZLQrXSbD7VezWw5msIIG42lnG13m1F9iiHskTTXN8VY8vROGD+xsEi+rzHlggSHGUGLVDtxvd/mxWPlN4u5+Htlslscn1fXc3XrPT6r14XT5kM7mJnAANvwdf8OkQIDAQABAoGAFc6A/b8SatqVd8nlQpYGbiTGjwmA0vF1JKPah6VLn4sIuFnnIvc9NFCaRqmnCPf/01j/ElwYB2yqA9rnHL+sValnvRAPRnA9EK8LQ53b2Bi7uxQmqBw4Di6Ez7U0uJrdF7Eaa/OfVIuvNFZPOH8Ja/Pvr/cR9S++6F74x20IqAECQQDdJmgvsKzcG9gUxRzZGwBBlScD82u4ub0YgdoWZj+gLzp8GsVeRsP6GStP54YHk7xXkQll1GSeomBXVap1ppgxAkEA2ZBQP2ox4e440AkhmLMtR08P04ed9kQVHWN+8nGq/ettXd8tQUAbZ9h10UpLaZWOw5IVjW5K3dFk2dSz9mCkYQJBAKik1kSv7VI45ZIJMtOZFJvumv8XTSlkcwBSXbZBKPoFqgrj+2jGfEKnmPDpNLtofPMmBk2iJ00VtHRFPqVTcrECQHyOMmMb2RMP31a645EYg4Ofr9/adITY1X3NyI/ko5BbiHGFo9MHcKkzM8BuWF5KUUGGEPC3hAUaLDLJo34aNgECQQDVS++oXWvZNDakDOqT3Cz52KBHa+wQCV4TwXDBO6DNB3p6AlzRBcONT63r/zi+PwjoM+hF1A0MiZeCCLmRgWNs";
	
	//public static final String PUBLIC = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB";

}
