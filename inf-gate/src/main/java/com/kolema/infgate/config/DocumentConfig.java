package com.kolema.infgate.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ware zhang
 * @date 2018/07/27
 */
@Component
@Primary
public class DocumentConfig implements SwaggerResourcesProvider {

    @Autowired
    org.springframework.cloud.client.discovery.DiscoveryClient discoveryClient;

    @Override
    public List<SwaggerResource> get() {

        List<SwaggerResource> resources = new ArrayList<>();

        resources.add(swaggerResource("UPC-REST", "/api/upc-rest/v2/api-docs", "1.0.0"));
        resources.add(swaggerResource("COUPON-MS", "/api/coupon/v2/api-docs", "1.0.0"));
        resources.add(swaggerResource("KOUNT-MS", "/api/risk/v2/api-docs", "1.0.0"));
        resources.add(swaggerResource("PAYPAL-MS", "/api/paypal/v2/api-docs", "1.0.0"));

        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }

}
