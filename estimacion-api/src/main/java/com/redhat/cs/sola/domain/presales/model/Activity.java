package com.redhat.cs.sola.domain.presales.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Activity {
    
    @Getter @Setter
    private String id;
    @Getter @Setter
    private String description;
    @Getter @Setter
    private String title;
    @Getter @Setter
    private String autor;
    @Getter @Setter
    private String fechaCreacion;

}

