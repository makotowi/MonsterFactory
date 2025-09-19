package com.dungeonsanddragons.monstercreator.demo.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeService {

    private SizeRepository sizeRepository;

    @Autowired
    public SizeService(SizeRepository sizeRepository) {
        this.sizeRepository = sizeRepository;
    }

    public Size addSize(Size size) {
        return sizeRepository.save(size);
    }

    public List<Size> showSize() {
        return sizeRepository.findAll();
    }

    public List<Size> findAllById(List<Long> size) {
        return sizeRepository.findAllById(size);
    }

    public Size findById(Long sizeId) {
        return sizeRepository.findById(sizeId).get();
    }
}
