package com.example.demo.service.Impl;

import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public String getProduct(String id) {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        if("123".equals(id)){
            return "Tim thay thanh cong";
        }
        throw new ProductNotFoundException("Khong tim thay san pham");
    }
}
