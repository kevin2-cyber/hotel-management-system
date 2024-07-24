package com.kimikevin.nomad_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "useractivitylog")
public class UserActivityLog {
    @Id
    private Long logId;
    @Column
    private String userId;
    @Column
    private String actionType;
    @Column
    private String tableName;
    @Column
    private Long recordId;
    @Column
    private Date actionDate = new Date(System.currentTimeMillis());
}
