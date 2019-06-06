package com.tx.mySpringBoot;


public class IndexController extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MarketingStatisticPartnerStarter.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(MarketingStatisticPartnerStarter.class, args);
    }
}
