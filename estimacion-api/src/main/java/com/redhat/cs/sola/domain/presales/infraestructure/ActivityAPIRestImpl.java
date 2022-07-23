package com.redhat.cs.sola.domain.presales.infraestructure;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.redhat.cs.sola.domain.presales.model.Activity;

import io.smallrye.mutiny.Uni;

@Path("/activity")
@Produces(MediaType.APPLICATION_JSON)
public class ActivityAPIRestImpl {

    Set<Activity> activities = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));
    
    @PostConstruct
    private void init(){
        for (int i = 0; i < 10; i++) {
            activities.add(new Activity(
                "change-me-"+i,
                "change-me-"+i,
                "change-me-"+i, 
                "change-me-"+i, 
                "change-me-"+i));
        }
    }

    @GET
    public Uni<Set<Activity>> getAllActivities() {
        return Uni.createFrom().item(activities);
    }

    @PUT
    public Activity createActivity(Activity activity) {
        return activity;
    }

    @POST
    public Activity editActivity(Activity activity) {
        return activity;
    }

    @DELETE
    public Activity deleteActivity(Activity activity) {
        return activity;
    }
}