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
}
