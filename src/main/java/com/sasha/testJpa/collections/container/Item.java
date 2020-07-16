package com.sasha.testJpa.collections.container;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.Type;
import org.springframework.core.Constants;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ElementCollection
    @CollectionTable(name = "Container_images")
    @Column(name = "image_name")
//    @CollectionId(columns = @Column(name = "image_id"), type = @Type(type = "long"), generator =)
    private Collection<String> images = new ArrayList<String>();

    public Item() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<String> getImages() {
        return images;
    }

    public void setImages(Collection<String> images) {
        this.images = images;
    }
}
