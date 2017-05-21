package com.routes.mobile.app.dao;

import com.routes.mobile.app.model.Exceptions;

import java.util.List;

/**
 * Created by Edgar Román on 20/05/17.
 */

public interface IExcepcionsDAO {

    List<Exceptions> getAllEx() throws Exception;

}
