package com.routes.mobile.app.dao;

import com.routes.mobile.app.model.DeliveryRoute;

import java.util.List;

/**
 * Created by eroman on 27/05/17.
 */

public interface IDeliveryDAO {

    List<DeliveryRoute> getAll() throws Exception;

}
