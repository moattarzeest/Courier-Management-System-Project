module ManagementSysCourier {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.sql;
	requires javafx.web;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml, javafx.base;
}
