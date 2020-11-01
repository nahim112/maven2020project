package com.ap.qa.util;

import java.util.ArrayList;
import java.util.List;
import com.ap.datamodel.ProductData;


public class DataBuilder {

public List<ProductData>PrepareProductData(){
	List<ProductData>productsData1= new ArrayList<ProductData>();
	Read_XLS read = new Read_XLS("product.xlsx","src/main/resources/testdata/");
	Object[][] objs = new Object[read.retrieveNoOfRows("Sheet1")-1][read.retrieveNoOfCols("Sheet1")];
	objs= read.retrieveTestData1("Sheet1"); 
	for(Object[] obj: objs) {
	ProductData productData2=  new ProductData();
	productData2.setProductName(obj[0].toString());
	productData2.setQuantity(obj[1].toString());
	productData2.setsize(obj[2].toString());
	productData2.setcolor(obj[3].toString());
	productsData1.add(productData2);
	}
	return productsData1;
	}}
