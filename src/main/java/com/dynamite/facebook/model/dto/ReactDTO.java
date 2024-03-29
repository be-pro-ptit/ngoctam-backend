package com.dynamite.facebook.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReactDTO {
    Long UserId;
    Long PostId;
    Integer ReactType;
}
