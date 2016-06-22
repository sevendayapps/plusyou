package com.microl.plusyou.bootstrap;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.springframework.context.annotation.Bean;

public class HibernateBootstrap {
	
	private ServiceRegistry buildServiceRegistry() {
		StandardServiceRegistryBuilder registryBuilder = 
												new StandardServiceRegistryBuilder();
		
		registryBuilder.configure();
		
		ServiceRegistry serviceRegistry = registryBuilder.build();
		return serviceRegistry;
	}
	
	private MetadataSources buildMetasource() {
		ServiceRegistry serviceRegistry = buildServiceRegistry();
		MetadataSources sources = new MetadataSources(serviceRegistry);
		sources.addPackage("com.microl.plusyou.entity");
		return sources;
	}
	
	private Metadata buildMeta() {
		MetadataSources sources = buildMetasource();
		
		MetadataBuilder metaBuilder = sources.getMetadataBuilder();
		metaBuilder.applyImplicitNamingStrategy(
			    ImplicitNamingStrategyJpaCompliantImpl.INSTANCE );
		Metadata metadata = metaBuilder.build();
		
		return metadata;
	}
		
	
	@Bean
	public SessionFactory buildSessionFactory() {
		SessionFactory sessionFactory = null;
		Metadata metadata = buildMeta();
		
		return metadata.buildSessionFactory();
	}
}
