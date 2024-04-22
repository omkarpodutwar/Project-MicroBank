package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter @Setter @ToString
public class BaseEntity {

    @CreatedDate //Annotation to auto fill created coulmn
    @Column(updatable = false) //cannot update date time, auto updation at creation only
    private LocalDateTime createdAt;

    @CreatedBy //now spring does not have any clue that who is creating the database and updating
    //theref we create another class named: audit.AuditAwareImpl
    @Column(updatable = false)
    private String createdBy;

    @LastModifiedDate
    @Column(insertable = false) // should be null at table creation for first time
    private LocalDateTime updatedAt;

    @LastModifiedBy
    @Column(insertable = false)
    private String updatedBy;
}
