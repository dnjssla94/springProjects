package com.fastcam.programming.dmaker.type;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DeveloperSkillTpye {
    BACK_END("백엔드 개발자"),
    FRONT_ND("프론트엔드 개발자"),
    FULL_END("풀스텍 개발자");

    private final String description;

}
