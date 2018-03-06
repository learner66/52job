package com.job52.dao;

import com.job52.model.Candidate;
import com.job52.model.CandidateKey;

public interface CandidateMapper {
    int deleteByPrimaryKey(CandidateKey key);

    int insert(Candidate record);

    int insertSelective(Candidate record);

    Candidate selectByPrimaryKey(CandidateKey key);

    int updateByPrimaryKeySelective(Candidate record);

    int updateByPrimaryKey(Candidate record);
}