package com.miu.CourseMgtSys.domain.dto;

import com.miu.CourseMgtSys.domain.entity.Address;
import com.miu.CourseMgtSys.domain.entity.Person;

import java.util.List;
import java.util.stream.Collectors;

public class PersonAdapter {
    public static PersonDTO toDTO(Person person) {
        PersonDTO dto = new PersonDTO();
        dto.setId(person.getId());
        dto.setName(person.getName());
        dto.setPhone(person.getPhone());
        dto.setEmail(person.getEmail());

        // Extract address ID from the Person entity
        if (person.getAddress() != null) {
            dto.setAddressId(person.getAddress().getId());
        }

        return dto;
    }

    public static Person toEntity(PersonDTO dto) {
        Person entity = new Person();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setPhone(dto.getPhone());
        entity.setEmail(dto.getEmail());

        // You may need to set the actual Address entity based on the provided ID
        // Assuming you have a method to retrieve it
        entity.setAddress(retrieveAddressById(dto.getAddressId()));

        return entity;
    }

    public static List<PersonDTO> toDTOList(List<Person> persons) {
        return persons.stream()
                .map(PersonAdapter::toDTO)
                .collect(Collectors.toList());
    }

    public static List<Person> toEntityList(List<PersonDTO> dtos) {
        return dtos.stream()
                .map(PersonAdapter::toEntity)
                .collect(Collectors.toList());
    }

    // Additional methods may be needed for other conversions or customization

    // Method to retrieve an Address entity by ID (simulated)
    private static Address retrieveAddressById(Long addressId) {
        // Simulated retrieval logic
        Address address = new Address();
        address.setId(addressId);
        // Set other properties as needed
        return address;
    }
}
