package com.commerce.backend.service;

import com.commerce.backend.dao.TelevitionRepository;
import com.commerce.backend.mapper.TelevisionMapper;
import com.commerce.backend.model.entity.Television;
import com.commerce.backend.model.response.product.TelevisionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TelevisionServiceImpl implements TelevisionService {
    @Autowired
    private TelevitionRepository televitionRepository;
    @Autowired
    private TelevisionMapper televisionMapper;

    @Override
    public List<TelevisionResponse> getAlls() {
        List<TelevisionResponse> list=new ArrayList<>();
       televitionRepository.findAll().forEach(tele->{
           list.add(televisionMapper.mapToDto(tele));
       });
       return list;
    }
}
