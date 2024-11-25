package com.gl.CompleteUT.repository;

import com.gl.CompleteUT.model.CloudVendor;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CloudVendorRepository extends MongoRepository<CloudVendor, String> {
    List<CloudVendor> findByVendorName(String vendorName);
}
