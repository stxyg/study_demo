/**
 * Copyright(c) 2011-2020 by YouCredit Inc.
 * All Rights Reserved
 */
package com.cnn.testhdfs;

import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Administrator
 * @date 2020/7/4
 */
public class TestHDFS {
    private  Configuration configuration;
    private    FileSystem fileSystem;
    @BeforeEach
    public  void init() throws IOException, InterruptedException {
        //设置环境变量HADOOP_USER_NAME
        //true :加载classpath下的配置文件
        this.configuration =new Configuration(true);
//        this.fileSystem =FileSystem.get(this.configuration);
        this.fileSystem = FileSystem.get(URI.create("hdfs://mycluster"), this.configuration, "sa");
    }

    @Test
    public void testRead() throws IOException {
        Path path = new Path("/cnn/0706");
        if (!this.fileSystem.exists(path)) {
            this.fileSystem.delete(path,true);
        }
        boolean succ = this.fileSystem.mkdirs(path);
        System.out.println(succ);

    }

}
