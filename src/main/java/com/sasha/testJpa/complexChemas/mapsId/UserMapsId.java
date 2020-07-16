package com.sasha.testJpa.complexChemas.mapsId;

import javax.persistence.*;

/**
 * аннотация MapsId("departmentId) вытянула айдишник из UserMapsId#department и вставила его в  UserMapsId#UserId#id
 *  в соответствующее поле тому что указано в скобках аннотациию Это поле из скобок аннотации "departmentId"
 *
 *  тоесть происходит совмесное пользование колонкой с айдишником двумя сущностями. У UserMapsId айдишник состоит из двух столбов
 *  UserId#name & UserId#departmentId.  UserId#name- назначаю я, а UserId#departmentId- значение вытягивается из UserMapsId#department
 *  с помощью MapsId("departmentId), одновременно это же значение(стольбец) является и FK для ссылки на сущность Department department.
 *
 * @author Alexandr Yefremov
 */
@Entity
@Table(name="user_maps_id")
public class UserMapsId {

    @EmbeddedId
    protected UserId id;

    @ManyToOne
    @MapsId("departmentId")
    protected Department department;

    public UserMapsId() {
    }
    public UserMapsId(UserId id){
        this.id=id;
    }

    public UserId getId() {
        return id;
    }



    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
