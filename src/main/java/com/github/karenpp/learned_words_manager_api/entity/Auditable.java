package com.github.karenpp.learned_words_manager_api.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
//@Setter(AccessLevel.PACKAGE)
public abstract  class Auditable {

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date createdAt;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date lastModifiedAt;
}
