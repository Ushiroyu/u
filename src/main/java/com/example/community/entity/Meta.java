package com.example.community.entity;
import lombok.Data;
import java.io.Serializable;
@Data
public class Meta implements Serializable {
    private static final long serialVersionUID = 4481526064896844012L;
    private Boolean keepAlive;
    private Boolean requireAuth;
}
