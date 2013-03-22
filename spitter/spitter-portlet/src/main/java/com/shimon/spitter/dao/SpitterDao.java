package com.shimon.spitter.dao;

import com.shimon.spitter.dto.Spitter;

/**
 * @author Peter Siman <peter.siman@ibacz.eu>
 */
public interface SpitterDao {

    public void addSpitter(Spitter spitter);

    public Spitter getSpitterById(long id);

    public void saveSpitter(Spitter spitter);
}
