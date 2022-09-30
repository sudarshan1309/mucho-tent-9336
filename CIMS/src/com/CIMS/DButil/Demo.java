package com.CIMS.DButil;

import java.sql.Connection;

public class Demo {
public static void main(String[] args) {
	Connection conn=DButil.ProvideConnection();
	
	System.out.println(conn);
}
}
