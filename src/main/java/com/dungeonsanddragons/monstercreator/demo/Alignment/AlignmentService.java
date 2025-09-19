package com.dungeonsanddragons.monstercreator.demo.Alignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlignmentService {
    private AlignmentRepository alignmentRepository;

    @Autowired
    public AlignmentService(AlignmentRepository alignmentRepository){
        this.alignmentRepository = alignmentRepository;
    }


    public Alignment addAlignment(Alignment alignment) {
        return alignmentRepository.save(alignment);
    }

    public List<Alignment> showAlignment() {
        return alignmentRepository.findAll();
    }

    public List<Alignment> findAllById(List<Long> alignment) {
        return alignmentRepository.findAllById(alignment);
    }

    public Alignment findById(Long alignmentId) {
        return alignmentRepository.findById(alignmentId).get();
    }
}
