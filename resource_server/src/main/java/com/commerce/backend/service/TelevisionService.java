package com.commerce.backend.service;

import com.commerce.backend.model.entity.Television;
import com.commerce.backend.model.response.product.TelevisionResponse;

import java.util.List;

public interface TelevisionService {

    List<TelevisionResponse> getAlls();

}
