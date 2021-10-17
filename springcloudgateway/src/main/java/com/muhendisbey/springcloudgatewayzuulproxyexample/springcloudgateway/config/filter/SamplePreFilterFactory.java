package com.muhendisbey.springcloudgatewayzuulproxyexample.springcloudgateway.config.filter;

import com.muhendisbey.springcloudgatewayzuulproxyexample.springcloudgateway.lib.PreFilter;
import org.springframework.context.annotation.Bean;

public class SamplePreFilterFactory
{
    @Bean
    PreFilter SamplePreFilter()
    {
        return new PreFilter( (exchange, chain) -> System.out.println("PRE: ex" + exchange + "ch" + chain)
        );
    }
}
