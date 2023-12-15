package com.cola.example.dto.clientobject;

import lombok.Data;

/**
 * AbstractMetricCO
 *
 * @author Frank Zhang
 * @date 2019-03-04 11:32 AM
 */
@Data
public abstract class AbstractMetricCO {
    /**
     * The ownerId of this Metric Item
     */
    private String ownerId;
}
