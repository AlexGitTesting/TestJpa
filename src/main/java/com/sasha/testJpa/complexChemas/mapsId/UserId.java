package com.sasha.testJpa.complexChemas.mapsId;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author Alexandr Yefremov
 */

@Embeddable
public class UserId implements Serializable {

    protected  String userName;
    protected Long departmentId;

    public UserId() {
    }

    public UserId(String userName, Long departmentId){
        this.userName=userName;
        this.departmentId=departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserId)) return false;
        UserId userId = (UserId) o;
        return userName.equals(userId.userName) &&
                departmentId.equals(userId.departmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, departmentId);
    }
}
