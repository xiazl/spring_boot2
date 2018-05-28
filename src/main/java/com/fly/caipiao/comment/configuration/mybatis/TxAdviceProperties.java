package com.fly.caipiao.comment.configuration.mybatis;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Properties;

/**
 * 事务处理配置项
 */
@ConfigurationProperties(prefix = "aop.transaction")
public class TxAdviceProperties {

    private String advisorPointCut;

    private Properties attributes;

    /**
     * Creates a new instance of TxAdviceProperties
     */
    public TxAdviceProperties() {
        super();
    }

    /**
     * @return property value of advisorPointCut
     */
    public String getAdvisorPointCut() {
        return advisorPointCut;
    }

    /**
     * @param advisorPointCut value to be assigned to property advisorPointCut
     */
    public void setAdvisorPointCut(String advisorPointCut) {
        this.advisorPointCut = advisorPointCut;
    }

    /**
     * @return property value of attributes
     */
    public Properties getAttributes() {
        return attributes;
    }

    /**
     * @param attributes value to be assigned to property attributes
     */
    public void setAttributes(Properties attributes) {
        this.attributes = attributes;
    }
}
