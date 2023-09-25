package com.miu.CourseMgtSys.domain.dto;

import com.miu.CourseMgtSys.domain.entity.Address;

import java.util.ArrayList;
import java.util.List;

public class AddressAdaptor {
    public static Address getAddressFromAddressDTO(AddressDTO addressDTO) {
        Address address = new Address();
        address.setCity(addressDTO.getCity());
        address.setZip(addressDTO.getZip());
        address.setId(addressDTO.getId());
        address.setStreet(addressDTO.getStreet());
        return address;
    }

    public static AddressDTO getAddressDTOFromAddress(Address address) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setCity(address.getCity());
        addressDTO.setStreet(address.getStreet());
        addressDTO.setId(address.getId());
        addressDTO.setZip(address.getZip());
        return addressDTO;
    }

    public static List<AddressDTO> getAddressDTOsFromAddress(List<Address> addresses) {
        List<AddressDTO> addressDTOS = new ArrayList<AddressDTO>();
        for (Address address : addresses) {
            addressDTOS.add(getAddressDTOFromAddress(address));
        }
        return addressDTOS;
    }
}
