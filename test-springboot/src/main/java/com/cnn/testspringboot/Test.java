/**
 * Copyright(c) 2011-2021 by YouCredit Inc. All Rights Reserved
 */
package com.cnn.testspringboot;

import com.br.account.utils.HttpClientUtil;
import lombok.extern.slf4j.Slf4j;
import okhttp3.FormBody;
import okhttp3.RequestBody;

/**
 * @author Administrator
 * @date 2021/4/15
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        HttpClientUtil httpClientUtil = new HttpClientUtil();
        RequestBody requestBody = new FormBody.Builder().add("async", "0").build();
        try {
            httpClientUtil.postFormdata("http://333", requestBody);

        } catch (Exception e) {
            log.error("eee=", e);
        }
    }
}
