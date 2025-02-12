package com.project.Accounting.acc.currentAsset.service;

import com.project.Accounting.acc.currentAsset.repository.CurAssetRepository;
import com.project.Accounting.acc.entity.menu.curAsset.CurAsset;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class CurAssetServiceImpl implements CurAssetService {
    @Autowired
    private final CurAssetRepository curAssetRepository;

    @Override
    public List<CurAsset> findAll() {
        List<CurAsset> list = curAssetRepository.findAll();
        return list;
    }

    @Override
    public List<CurAsset> getCurAssetByAssetName(String assetName) {
        List<CurAsset> result = curAssetRepository.findCurAssetByAssetName(assetName);
        return result;
    }

    @Override
    public void saveAsset(CurAsset asset){
        curAssetRepository.save(asset);
    }
}
