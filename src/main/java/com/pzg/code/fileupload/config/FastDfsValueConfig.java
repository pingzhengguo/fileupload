package com.pzg.code.fileupload.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName :  FastDfsValueConfig
 * @Author : PZG
 * @Date : 2019-10-25   下午 04:59
 * @Description :
 */
@Component
@Configuration
@EnableAutoConfiguration
@PropertySource("classpath:config/config_fastdfs.properties")
@ConfigurationProperties(prefix = "fastdfs")
public class FastDfsValueConfig {

    /**
     * fastDfs的下载地址头
     */
    @Value("${fastdfs.address}")
    private String fastdfsAddress;


    private String abc;

    public String getFastdfsAddress() {
        return fastdfsAddress;
    }

    public void setFastdfsAddress(String fastdfsAddress) {
        this.fastdfsAddress = fastdfsAddress;
    }

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }
}
