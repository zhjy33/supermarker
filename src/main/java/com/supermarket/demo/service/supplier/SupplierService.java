package com.supermarket.demo.service.supplier;

import java.util.List;

import com.supermarket.demo.model.supplier.SuSupplier;

public interface SupplierService {

	List<SuSupplier> querySupplier();

	void saveSupplier(SuSupplier goods);

	void deleteSupplier(Long id);

}
