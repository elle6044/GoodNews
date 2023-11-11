package com.ssafy.goodnews.member.dto.response.member;

import com.ssafy.goodnews.member.domain.Member;
import lombok.Builder;
import lombok.Getter;

@Getter
public class MemberInfoResponseDto {

    private String memberId;
    private String phoneNumber;
    private String name;
    private String birthDate;
    private String gender;
    private String bloodType;
    private String addInfo;
    private int state;
    private Double lat;
    private Double lon;
    private String familyId;

    @Builder
    public MemberInfoResponseDto(Member member,String familyId) {
        this.memberId = member.getId();
        this.phoneNumber = member.getPhoneNumber();
        this.name = member.getName();
        this.birthDate = member.getBirthdate();
        this.gender = member.getGender();
        this.bloodType = member.getBloodtype();
        this.addInfo = member.getAddinfo();
        this.state = member.getState();
        this.lat = member.getLat();
        this.lon = member.getLon();
        this.familyId = familyId;
    }
}
