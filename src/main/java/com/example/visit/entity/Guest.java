package com.example.visit.entity;

import com.example.visit.dto.GuestDto;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String writer;
    @Column
    private String content;
    @Column
    private LocalDateTime writeDate;

    private static ModelMapper mapper=new ModelMapper();

    public GuestDto of(){
        return mapper.map(this,GuestDto.class);
    }
}
