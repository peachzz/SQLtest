package com.terry.sqldemo;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.terry.db.DBAPI;
import com.terry.model.ProductionModel;;

public class DemoTest {

	/**
	 * @param args
	 */
//	private static final String user ="sa";
//	private static final String psw ="ueekmwvdyhecg";
//	private static final String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";//net.sourceforge.jtds.jdbc.Driver
//	private static final String dbUrl= "jdbc:sqlserver://210.16.188.216;DatabaseName=CoDatabase;";
//	private static final String sqlStr="SELECT * FROM dbo.Production";
//	
//	static{
//		try {
//			Class.forName(driver);
//			Connection con = DriverManager.getConnection(dbUrl,user,psw);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	private static final String sqlStr="SELECT * FROM dbo.Production";
	private static final String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";//net.sourceforge.jtds.jdbc.Driver
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName(driver);
			Connection con = DBAPI.getConnection();
			Statement statement = con.createStatement();
			ResultSet rst =statement.executeQuery(sqlStr);
			ArrayList<ProductionModel> pList = new ArrayList();
			while (rst.next()) {
				ProductionModel productionModel = new ProductionModel();
				productionModel.setBarcode(rst.getString("Barcode"));
	            productionModel.setType(rst.getString("Type"));
	            productionModel.setName(rst.getString("Name"));
	            productionModel.setBrand(rst.getString("Brand"));
	            productionModel.setModel(rst.getString("Model"));
	            productionModel.setSpecs(rst.getString("Specs"));
	            productionModel.setQuality(rst.getString("Quality"));
	            productionModel.setUnit(rst.getString("Unit"));
	            productionModel.setCost(rst.getString("Cost"));
	            productionModel.setTax(rst.getString("Tax"));
	            productionModel.setChannelQuotation(rst.getString("ChannelQuotation"));
	            productionModel.setTerminalQuotation(rst.getString("TerminalQuotation"));
	            productionModel.setSupplier(rst.getString("Supplier"));
	            productionModel.setRemark(rst.getString("Remark"));
	            productionModel.setUpdateRecord(rst.getString("UpdateRecord"));
	            productionModel.setAddDate(rst.getString("AddDate"));
	            productionModel.setAddStaff(rst.getString("AddStaff"));
	            productionModel.setProductionImage(rst.getString("ProductionImage"));
	            productionModel.setStock(rst.getBigDecimal("Stock"));
	            productionModel.setTopLimit(rst.getString("TopLimit"));
	            productionModel.setLowerLimit(rst.getString("LowerLimit"));
	            productionModel.setTargetCustomer(rst.getString("TargetCustomer"));
	            productionModel.setParameter(rst.getString("Parameter"));
	            productionModel.setTechnicsImage(rst.getString("TechnicsImage"));
	            productionModel.setStorageLocation(rst.getString("StorageLocation"));
	            productionModel.setNumber(rst.getString("Number"));
	            pList.add(productionModel);
				System.out.println(productionModel);
			}
			System.out.println("连接成功！");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
