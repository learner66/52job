package com.job52.service.impl;

import com.job52.model.Collection;
import com.job52.service.CollectionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionServiceImpl implements CollectionService {
    public List<Collection> findAllCollection() throws Exception {
        return null;
    }

    public boolean deleteCollection(String[] ids) throws Exception {
        return false;
    }
}
