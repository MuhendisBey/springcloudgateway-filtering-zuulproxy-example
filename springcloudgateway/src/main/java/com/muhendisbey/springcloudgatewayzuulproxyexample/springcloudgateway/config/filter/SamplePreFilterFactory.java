package com.muhendisbey.springcloudgatewayzuulproxyexample.springcloudgateway.config.filter;

import com.muhendisbey.springcloudgatewayzuulproxyexample.springcloudgateway.lib.PreFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SamplePreFilterFactory
{
    @Bean
    PreFilter SamplePreFilter()
    {
        return new PreFilter( (exchange, chain) -> System.out.println("SamplePreFilter: ex" + exchange + "ch" + chain)
        );
    }

    @Bean /*Note: Onur: This bean overrides above bean */
    PreFilter ExamplePreFilter()
    {
        return new PreFilter( (exchange, chain) -> System.out.println("ExamplePreFilter: ex" + exchange + "ch" + chain)
        );
    }
}
