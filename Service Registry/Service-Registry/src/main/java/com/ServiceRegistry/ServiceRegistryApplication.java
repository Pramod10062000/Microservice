package com.ServiceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

}
//imer already cancelled.
//at java.base/java.util.Timer.sched(Timer.java:409) ~[na:na]
//at java.base/java.util.Timer.schedule(Timer.java:260) ~[na:na]
//at com.netflix.eureka.registry.AbstractInstanceRegistry.postInit(AbstractInstanceRegistry.java:1223) ~[eureka-core-2.0.2.jar:2.0.2]
//at com.netflix.eureka.registry.PeerAwareInstanceRegistryImpl.openForTraffic(PeerAwareInstanceRegistryImpl.java:260) ~[eureka-core-2.0.2.jar:2.0.2]
//at org.springframework.cloud.netflix.eureka.server.InstanceRegistry.openForTraffic(InstanceRegistry.java:76) ~[spring-cloud-netflix-eureka-server-4.1.1.jar:4.1.1]
//at org.springframework.cloud.netflix.eureka.server.EurekaServerBootstrap.initEurekaServerContext(EurekaServerBootstrap.java:112) ~[spring-cloud-netflix-eureka-server-4.1.1.jar:4.1.1]
//at org.springframework.cloud.netflix.eureka.server.EurekaServerBootstrap.contextInitialized(EurekaServerBootstrap.java:70) ~[spring-cloud-netflix-eureka-server-4.1.1.jar:4.1.1]
//at org.springframework.cloud.netflix.eureka.server.EurekaServerInitializerConfiguration.lambda$start$0(EurekaServerInitializerConfiguration.java:67) ~[spring-cloud-netflix-eureka-server-4.1.1.jar:4.1.1]
//at java.base/java.lang.Thread.run(Thread.java:833) ~[na:na]
//
//[2m2024-04-12T10:50:11.549+05:30[0;39m [31mERROR[0;39m [35m31456[0;39m [2m---[0;39m [2m[Service-Registry] [       Thread-9][0;39m [2m[0;39m[36me.s.EurekaServerInitializerConfiguration[0;39m [2m:[0;39m Could not initialize Eureka servlet context
//
////java.lang.RuntimeException: Cannot bootstrap eureka server :