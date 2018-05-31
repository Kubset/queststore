package com.codecool.queststore.repositories;

import com.codecool.queststore.mappers.CodecoolClassMapper;
import com.codecool.queststore.model.entities.CodecoolClass;

import java.sql.SQLException;

public class CodecoolClassRepository extends AbstractRepository<CodecoolClass> {
    public CodecoolClassRepository() throws PersistenceLayerException {
        super.mapper = new CodecoolClassMapper();
    }

    @Override
    void addEntity(CodecoolClass entity) throws SQLException {

    }

    @Override
    void updateEntity(CodecoolClass entity) throws SQLException {

    }

    @Override
    void deleteEntity(CodecoolClass entity) throws SQLException {

    }
}