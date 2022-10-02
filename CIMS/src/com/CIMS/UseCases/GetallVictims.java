package com.CIMS.UseCases;

import java.util.List;  
import com.CIMS.DAO.VictimDAO;
import com.CIMS.DAO.VictimDAOImplementation;
import com.CIMS.DTO.VictimsOfCrimeDTO;
import com.CIMS.Exception.VictimException;


public class GetallVictims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		VictimDAO victimDao = new VictimDAOImplementation();
		try {
			List<VictimsOfCrimeDTO> victims =  victimDao.getVictimsOfCrime(2);
			System.out.println(victims);
		} catch (VictimException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
