package com.gl.CompleteUT.controller;

import com.gl.CompleteUT.model.CloudVendor;
import com.gl.CompleteUT.response.ResponseHandler;
import com.gl.CompleteUT.service.CloudVendorService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    // Read Specific Cloud Vendor Details from DB
    @GetMapping("/{vendorId}")
    @ApiOperation(value ="Cloud vendor id", notes="Provide cloud vendor details",
            response = ResponseEntity.class)
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
        return ResponseHandler.responseBuilder("Requested Vendor Details are given here",
                HttpStatus.OK, cloudVendorService.getCloudVendor(vendorId));
    }

    // Read All Cloud Vendor Details from DB
    @GetMapping
    public List<CloudVendor> getAllCloudVendorDetails()
    {
        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping()
    public ResponseEntity<String> createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        String result=cloudVendorService.createCloudVendor(cloudVendor);
        //return "Cloud Vendor Created Successfully";
        return ResponseEntity.ok(result);
    }

    @PutMapping()
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("/{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Successfully";
    }
}
