package com.supanadit.restsuite.system.hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class HibernateUtil {
    private static StandardServiceRegistry registry;

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                analyse.AnalyseLog.analyseLog( "getSessionFactory", "getSessionFactoryBuilder");
                analyse.AnalyseLog.analyseLog( "getSessionFactory", "getSessionFactoryBuilder");
                analyse.AnalyseLog.analyseLog( "getSessionFactory", "getMetadataBuilder");
                analyse.AnalyseLog.analyseLog( "getSessionFactory", "getMetadataBuilder");
                analyse.AnalyseLog.analyseLog( "getSessionFactory", "StandardServiceRegistryBuilder");
                analyse.AnalyseLog.analyseLog( "getSessionFactory", "StandardServiceRegistryBuilder");
                // Create registry
                registry = new StandardServiceRegistryBuilder().configure().build();
                // Create MetadataSources
                MetadataSources sources = new MetadataSources(registry);
                // Create Metadata
                Metadata metadata = sources.getMetadataBuilder().build();
                // Create SessionFactory
                sessionFactory = metadata.getSessionFactoryBuilder().build();
            } catch (Exception e) {
                analyse.AnalyseLog.analyseLog( "getSessionFactory", "printStackTrace");
                e.printStackTrace();
                if (registry != null) {
                    analyse.AnalyseLog.analyseLog( "getSessionFactory", "destroy");
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }
        }
        return sessionFactory;
    }

    public static void shutdown() {
        if (registry != null) {
            analyse.AnalyseLog.analyseLog( "shutdown", "destroy");
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}