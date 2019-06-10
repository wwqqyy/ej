package com.briup.apps.ej.web.controller;


import com.briup.apps.ej.bean.Address;
import com.briup.apps.ej.service.IAddressService;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private IAddressService addressService;
    @ApiOperation("find all info")
    @GetMapping("findAll")
    public Message findAll(){
        List<Address> list=addressService.findAll();
        return MessageUtil.success("success",list);
    }

    @ApiOperation("select info by id")
    @GetMapping("selectById")
    public Message findById(@ApiParam(value="primarykey",required = true) @RequestParam(value = "id") long id){
        Address address=addressService.selectById(id);
        return MessageUtil.success("success",address);
    }

    @ApiOperation("save or update info")
    @GetMapping("saveOrUpdate")
    public Message saveOrUpdate (Address address){
        try{
            addressService.saveOrUpdate(address);
            return MessageUtil.success("success");}
        catch (Exception e){
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }

    @ApiOperation("instinct select")
    @GetMapping("query")
    public Message query(Address address){
        List<Address> list=addressService.query(address);

        return MessageUtil.success("success",list);
    }

    @ApiOperation("delete info by id")
    @GetMapping("deleteById")
    public Message deleteById(@ApiParam(value="primarykey",required = true) @RequestParam(value = "id") long id){
        try{
            addressService.deleteById(id);
            return MessageUtil.success("success");
        }
        catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }
}
