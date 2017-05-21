package com.routes.mobile.app.dao.impl;

import com.orm.query.Select;
import com.routes.mobile.app.dao.IExcepcionsDAO;
import com.routes.mobile.app.model.Exceptions;

import java.util.List;

/**
 * Created by Edgar Román on 20/05/17.
 */

public class ExceptionsDAO implements IExcepcionsDAO {
    @Override
    public List<Exceptions> getAllEx() throws Exception {
        return Select.from(Exceptions.class).list();
    }
}
