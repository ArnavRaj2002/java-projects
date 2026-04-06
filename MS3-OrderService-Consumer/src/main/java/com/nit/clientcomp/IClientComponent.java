package com.nit.clientcomp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("MS3-ProductService")
public interface IClientComponent {
	@GetMapping("/product/display")
public String productDetailsFetch();
}
