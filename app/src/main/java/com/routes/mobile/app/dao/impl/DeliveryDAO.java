package com.routes.mobile.app.dao.impl;

import com.orm.query.Select;
import com.routes.mobile.app.dao.IDeliveryDAO;
import com.routes.mobile.app.model.DeliveryRoute;

import java.util.List;

/**
 * Created by Edgar Román on 27/05/17.
 */

public class DeliveryDAO implements IDeliveryDAO {



    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public List<DeliveryRoute> getAll() throws Exception {
        return Select.from(DeliveryRoute.class).list();
    }
}
