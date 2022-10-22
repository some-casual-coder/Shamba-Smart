package com.shamba.smart;

import com.shamba.smart.entity.Crop;
import com.shamba.smart.service.CropRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class Controller {

    @Autowired
    private CropRepo cropRepo;

    @GetMapping("/generateSuitableCrops")
    public List<Crop> generateList(@RequestParam("ph") double ph,@RequestParam("humidity") int humidity, @RequestParam("temp") double temp, @RequestParam("rainfall") String rainfall ){
        return cropRepo.findSuitableCrops(ph, humidity, temp, rainfall);
    }
}
