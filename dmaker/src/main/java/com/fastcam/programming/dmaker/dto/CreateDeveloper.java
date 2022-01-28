package com.fastcam.programming.dmaker.dto;

import com.fastcam.programming.dmaker.type.DeveloperLevel;
import com.fastcam.programming.dmaker.type.DeveloperSkillTpye;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateDeveloper {

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @ToString
    public static class Request {
        @NotNull
        private DeveloperLevel developerLevel;
        @NotNull
        private DeveloperSkillTpye developerSkillTpye;
        @NotNull
        @Min(0)
        @Max(20)
        private Integer experienceYear;

        @NotNull
        @Size(min = 3, max = 50, message = "memeberId size must 3~50")
        private String memberId;
        @NotNull
        @Size(min = 3, max = 20, message = "memeberId size must 3~20")
        private String name;

        @Min(18)
        private Integer age;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Response {
        private DeveloperLevel developerLevel;
        private DeveloperSkillTpye developerSkillTpye;
        private Integer experienceYear;
        private String memberId;

    }
}
