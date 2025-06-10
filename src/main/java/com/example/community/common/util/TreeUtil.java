package com.example.community.common.util;
import com.example.community.entity.TreeEntity;
import java.util.ArrayList;
import java.util.List;
public class TreeUtil{
    public static <E extends TreeEntity<E>> List<E> getTreeList(Integer topId, List<E> entityList) {
        List<E> resultList=new ArrayList<>();
        Integer parentId;
        for (E entity : entityList) {
            if(entity.isTreeEnabled()){
                parentId=entity.getTreeParentId();
                if(parentId==null||topId.equals(parentId)){
                    resultList.add(entity);
                }
            }
        }
        for (E entity : resultList) {
            entity.setTreeChildren(getSubList(entity.getTreeId(),entityList));
        }
        return resultList;
    }
    private  static  <E extends TreeEntity<E>>  List<E> getSubList(Integer id, List<E> entityList) {
        List<E> childList=new ArrayList<>();
        Integer parentId;
        for (E entity : entityList) {
            parentId=entity.getTreeParentId();
            if(id.equals(parentId)){
                childList.add(entity);
            }
        }
        for (E entity : childList) {
            entity.setTreeChildren(getSubList(entity.getTreeId(), entityList));
        }
        if(childList.size()==0){
            return null;
        }
        return childList;
    }
}