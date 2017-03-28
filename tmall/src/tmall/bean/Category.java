/**
* 模仿天猫整站j2ee 教程 为how2j.cn 版权所有
* 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关
* 供购买者学习，请勿私自传播，否则自行承担相关法律责任
*/	

package tmall.bean;

import java.util.List;


//分类表实体类，存放分类信息，如女装，平板电视，沙发等
public class Category {

//6666
	private String name;//分类名称
	private int id;//分类id
	List<Product> products;//产品表实体类集合
	List<List<Product>> productsByRow;//产品表实体类集合

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//重写toString方法
	@Override
	public String toString() {
		return "Category [name=" + name + "]";
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<List<Product>> getProductsByRow() {
		return productsByRow;
	}

	public void setProductsByRow(List<List<Product>> productsByRow) {
		this.productsByRow = productsByRow;
	}

}

/**
* 模仿天猫整站j2ee 教程 为how2j.cn 版权所有
* 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关
* 供购买者学习，请勿私自传播，否则自行承担相关法律责任
*/	
