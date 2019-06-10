package com.briup.apps.ej.service.Impl;

import com.briup.apps.ej.bean.Address;
import com.briup.apps.ej.bean.AddressExample;
import com.briup.apps.ej.dao.AddressMapper;
import com.briup.apps.ej.service.IAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddressServiceImpl implements IAddressService {
@Resource
    private AddressMapper addressMapper;

    @Override
    public List<Address> findAll()
    {
        AddressExample example=new AddressExample();
        return addressMapper.selectByExample(example);
    }

    @Override
    public Address selectById(long id){

        return addressMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteById(long id) throws Exception{
        Address address=addressMapper.selectByPrimaryKey(id);

        if(address==null){
            throw new Exception("no user");
        }
        else {
            addressMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public List<Address> query(Address address) {
        AddressExample example=new AddressExample();
        if(address.getProvince()!=null){
            example.createCriteria().andAddressLike("%"+address.getProvince()+"%");
        }
        if(address.getTelephone()!=null){
            example.createCriteria().andAddressLike("%"+address.getTelephone()+"%");
        }
        if(address.getCity()!=null){
            example.createCriteria().andAddressLike("%"+address.getCity()+"%");
        }if(address.getAddress()!=null){
            example.createCriteria().andAddressLike("%"+address.getAddress()+"%");
        }
        if(address.getArea()!=null){
            example.createCriteria().andAddressLike("%"+address.getArea()+"%");
        }
        if(address.getCustomerId()!=null){
            example.createCriteria().andAddressLike("%"+address.getCustomerId()+"%");
        }
        return addressMapper.selectByExample(example);
    }

    @Override
    public void saveOrUpdate(Address address) throws Exception {
        if(address.getId()==null){
            addressMapper.insert(address);
        }
        else{
            addressMapper.updateByPrimaryKey(address);
        }
    }
}
