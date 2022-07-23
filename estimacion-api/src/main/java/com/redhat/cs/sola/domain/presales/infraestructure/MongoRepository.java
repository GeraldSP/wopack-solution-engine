package com.redhat.cs.sola.domain.presales.infraestructure;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import com.mongodb.client.MongoClient;
import com.redhat.cs.sola.domain.presales.application.Repository;

@ManagedBean
@RequestScoped
public class MongoRepository implements Repository {
    
    @Inject MongoClient mongoClient;

    public void create(Object o ){
        // mongoClient.create
    }
    public void delete(Object o ){
        
    }
    public void find(Object o ){
        
    }
    public void update(Object o ){
        
    }

}
