package com.job52.controller;

import com.job52.model.Collection;
import com.job52.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/collection")
public class CollectionController {
    @Autowired
    private CollectionService collectionService;

    /**
     * 查找用户的所有收藏列表
     * @param model
     * @return 用户的收藏列表
     * @throws Exception 异常信息
     */
    @RequestMapping("/findAllCollection")
   public String findAllCollection(Model model) throws Exception{
        List<Collection> collectionList = collectionService.findAllCollection();
        model.addAttribute("collectionList",collectionList);
        return null;
   }

    /**
     * 删除收藏信息
     * @param model
     * @return
     * @throws Exception 异常信息
     */
    @RequestMapping("/deleteCollection")
    public String deleteCollection(Model model) throws Exception{
        String[] ids = null;
        collectionService.deleteCollection(ids);
        return null;
    }
}
