package com.example.community.entity;
import java.util.List;
public interface TreeEntity<E> {
    Integer getTreeId();
    Integer getTreeParentId();
    default boolean isTreeEnabled(){
        return true;
    }
    void setTreeChildren(List<E> children);
}
