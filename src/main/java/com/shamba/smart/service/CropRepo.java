package com.shamba.smart.service;

import com.shamba.smart.entity.Crop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CropRepo extends JpaRepository<Long, Crop> {
    @Query(
            value = "select * from crop c where c.ph between :ph-1 and :ph+1 " +
                    "and where c.temp between :temp+2 and :temp-2 " +
                    "and c.humidity between :humidity-10 and :humidity+10 " +
                    "and c.rainfall=:rainfall order by time_to_harvest desc",
            nativeQuery = true
    )
    List<Crop> findSuitableCrops(@Param("ph") double ph,@Param("humidity") int humidity,@Param("temp") double temp,@Param("rainfall") String rainfall);
}
