package com.CIMS.UseCases;

import java.util.List;

import com.CIMS.DAO.CriminalDAO;
import com.CIMS.DAO.CriminalDAOImplementation;
import com.CIMS.Exception.CriminalException;
import com.CIMS.bean.Criminal;

public class GetallCriminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CriminalDAO criminalDao = new CriminalDAOImplementation();
		try {
			List<Criminal> criminals = criminalDao.getAllCriminals();
			System.out.println(criminals);
		} catch (CriminalException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
