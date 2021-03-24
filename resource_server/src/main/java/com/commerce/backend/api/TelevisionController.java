package com.commerce.backend.api;

import com.commerce.backend.model.response.product.TelevisionResponse;
import com.commerce.backend.service.TelevisionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TelevisionController extends PublicApiController{
    private final TelevisionService televisionService;

    @GetMapping("/televisions")
    public List<TelevisionResponse> getAll(){
        return televisionService.getAlls();
    }

}
