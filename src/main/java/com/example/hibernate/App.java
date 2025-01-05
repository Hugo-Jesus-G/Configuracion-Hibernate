package com.example.hibernate;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Hibernate;
import org.hibernate.jpa.HibernatePersistenceProvider;

import com.example.config.hibernate.ConfiguracionHibernate;
import com.example.entities.Alumno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
    	//para el archivo persistence.xml
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("prueba");
		
    	
    	
    	Map<String,String > properties=new HashMap<>();
    	
    	
    	properties.put("hibernate.show_sql", "true");
    	properties.put("hibernate.format_sql", "true");
    	
    	
        try ( 
        		
        	
        		
        		//para la clase de configuracionde 
EntityManagerFactory emf=new HibernatePersistenceProvider().createContainerEntityManagerFactory(new ConfiguracionHibernate(), properties);
        		
        		
        		){
            EntityManager em = emf.createEntityManager();
            System.out.println("Conexión establecida correctamente.");
            
            //inicializa transaccion
            em.getTransaction().begin();
            
            
            //insertar
//            Alumno alu=new Alumno();
//            
//            alu.setNombre("juan");
//            em.persist(alu);
            
            //buscar
            //select
           Alumno alu= em.find(Alumno.class, 1);
           Alumno alu2= em.find(Alumno.class, 1);

            
            System.out.println(alu==alu2);
            
            
            
            
            //modificar el objeto provoca un update 
            alu.setNombre("hugo2");
            
            
            
            
            
            //confirma transaccion
            em.getTransaction().commit();

            

           
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
}
