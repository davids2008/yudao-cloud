package cn.iocoder.yudao.module.infra.framework.mongo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

/**
 * MongoDB 配置
 */
@Configuration
@EnableConfigurationProperties(MongoProperties.class)
public class MongoDbConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public MongoClient mongoClient(MongoProperties properties) {
        return MongoClients.create(properties.getUri());
    }
}

