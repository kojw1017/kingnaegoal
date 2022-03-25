package com.example.mappertut.reporistory;

import com.example.mappertut.model.Member;
import org.apache.ibatis.annoatatinos.Mapper;

import java.util.List;

@Mapper
public interface mapper {
    Member getMember(int id);

    List<Member> getMemberList();

    int createMember(Member member);
    int updateMember(Member member);
    int deleteMember(int id);
    
}
