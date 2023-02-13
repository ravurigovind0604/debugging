package com.debugPractice.debugging.service;

import com.debugPractice.debugging.model.DebugModel;
import com.debugPractice.debugging.repo.DebugModelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DebugService {

    @Autowired
    private DebugModelRepository debugModelRepository;


    public DebugModel saveEmpDetails(DebugModel d)
    {
        return debugModelRepository.save(d);
    }

    public Optional<DebugModel> showEmpDetailsByName(String d)
    {
        return debugModelRepository.findByEmpName(d);
    }
    public List<DebugModel> getAllEmpDetails()
    {
        return debugModelRepository.findAll();
    }
}
