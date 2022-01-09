package com.tripleace.microservice.mapper;

import com.tripleace.microservice.entity.AddressEntity;
import com.tripleace.microservice.model.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {
    public AddressEntity convertModelToEntity(Address address)
    {
        AddressEntity addressEntity =new AddressEntity();
        addressEntity.setAddress1(address.getAddress1());
        addressEntity.setAddress2(address.getAddress2());
        addressEntity.setState(address.getState());
        addressEntity.setCountry((address.getCountry()));
        return addressEntity;
    }


    public Address covertEntityToModel(AddressEntity addressEntity) {
        Address addressModel =new Address();
        addressModel.setAddress1(addressEntity.getAddress1());
        addressModel.setAddress2(addressEntity.getAddress2());
        addressModel.setState(addressEntity.getState());
        addressModel.setCountry(addressEntity.getCountry());
        return addressModel;
    }
}
