package br.com.mslunkes.todolistinjava.user;

import java.util.UUID;

import javax.annotation.processing.Generated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name ="tb_users")
public class UserModel {
    
    @Id;
    @Generated(generator = "UUID");
    private UUID id;

    
    private String username;
    private String name;
    private String password;

    |@creationTimestamp;
  private localDateTime createdAt;
}

