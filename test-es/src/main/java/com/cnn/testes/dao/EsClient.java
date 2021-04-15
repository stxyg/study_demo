/**
 * Copyright(c) 2011-2020 by YouCredit Inc.
 * All Rights Reserved
 */
package com.cnn.testes.dao;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Administrator
 * @date 2020/4/12
 */
public class EsClient {
    @Autowired
    private RestHighLevelClient restHighLevelClient;
    public void get(){
    }
}
