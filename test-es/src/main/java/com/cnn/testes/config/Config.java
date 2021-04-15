/**
 * Copyright(c) 2011-2020 by YouCredit Inc.
 * All Rights Reserved
 */
package com.cnn.testes.config;

import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;

/**
 * @author Administrator
 * @date 2020/4/12
 */
@Configuration
public class Config {
    @Bean
    static RestHighLevelClient restHighLevelClient(){
        ClientConfiguration configuration = ClientConfiguration.builder().
                connectedTo("localhost:9200").build();
        return RestClients.create(configuration).rest();
    }
}
