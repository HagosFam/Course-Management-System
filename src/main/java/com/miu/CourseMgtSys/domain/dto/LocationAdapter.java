package com.miu.CourseMgtSys.domain.dto;

import com.miu.CourseMgtSys.domain.entity.Address;
import com.miu.CourseMgtSys.domain.entity.Location;

import java.util.List;
import java.util.stream.Collectors;

public class LocationAdapter {
    public static LocationDTO toDTO(Location location) {
        LocationDTO dto = new LocationDTO();
        dto.setId(location.getId());

        // Extract address ID from the Location entity
        if (location.getAddress() != null) {
            dto.setAddressId(location.getAddress().getId());
        }

        return dto;
    }

    public static Location toEntity(LocationDTO dto) {
        Location entity = new Location();
        entity.setId(dto.getId());

        // You may need to set the actual Address entity based on the provided ID
        // Assuming you have a method to retrieve it
        entity.setAddress(retrieveAddressById(dto.getAddressId()));

        return entity;
    }

    public static List<LocationDTO> toDTOList(List<Location> locations) {
        return locations.stream()
                .map(LocationAdapter::toDTO)
                .collect(Collectors.toList());
    }

    public static List<Location> toEntityList(List<LocationDTO> dtos) {
        return dtos.stream()
                .map(LocationAdapter::toEntity)
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
