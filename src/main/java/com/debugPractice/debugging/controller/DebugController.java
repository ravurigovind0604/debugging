package com.debugPractice.debugging.controller;



import com.debugPractice.debugging.model.DebugModel;
import com.debugPractice.debugging.service.DebugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "*")
public class DebugController {
    @Autowired
    private DebugService debugServiceClass;

    @RequestMapping(value="/saveEmployeeDetails",method= RequestMethod.POST)
    DebugModel saveEmpDetails(@RequestBody DebugModel d)
    {
        return debugServiceClass.saveEmpDetails(d);
    }


    @RequestMapping(value="/showEmpdetails/",method= RequestMethod.GET)
    Optional<DebugModel> showEmpDetailsByName(@RequestParam("empName") String d,@RequestParam(value = "r",required = false) String f)
    {
        return debugServiceClass.showEmpDetailsByName(d);
    }
    @RequestMapping(value="/getAllEmpDetails",method= RequestMethod.GET)
    List<DebugModel> getAllEmpDetails()
    {
        return debugServiceClass.getAllEmpDetails();
    }

}
