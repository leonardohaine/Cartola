package br.com.control.dao;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.control.model.Materiais;

@Repository
public class MaterialDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	private void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public String getSequenceMaterial(){
		String psqlAutoincrementQuery = "SELECT NEXTVAL('seq_material') as id";

		BigInteger psqlAutoincrement =  (BigInteger) getSessionFactory().getCurrentSession().createSQLQuery(psqlAutoincrementQuery)
		                                                      .addScalar("id")
		                                                      .uniqueResult();
		//safx2013.setCodProduto((String) psqlAutoincrement.toString());
		
		System.out.println("ID MATERIAL: " + psqlAutoincrement);
		
		return (String) psqlAutoincrement.toString();
	}
	

	public void saveMaterial(Materiais material) {
		if(material.getCodMaterial() == null || material.getCodMaterial().equals("")){
			String psqlAutoincrementQuery = "SELECT NEXTVAL('seq_material') as id";

			BigInteger psqlAutoincrement =  (BigInteger) getSessionFactory().getCurrentSession().createSQLQuery(psqlAutoincrementQuery)
			                                                      .addScalar("id")
			                                                      .uniqueResult();
			material.setCodMaterial((String) psqlAutoincrement.toString());
			
			System.out.println("ID MATERIAL: " + psqlAutoincrement);
			
		}
		getSessionFactory().getCurrentSession().saveOrUpdate(material);
	}
		
	public void deleteMaterial(Materiais material) {
        getSessionFactory().getCurrentSession().delete(material);
    }
		
	public void updateMaterial(Materiais material) {
        getSessionFactory().getCurrentSession().update(material);
    }
		
	
	public Materiais getMaterialById(String id) {
		Materiais material = (Materiais)  getSessionFactory().getCurrentSession().get(Materiais.class, id);
                                            //.createQuery("from safx04  where id=?")
                                            //.setParameter(0, id).list();
		return material;
        //return (Safx04)list.get(0);
	}
		
	public List<Materiais> getMaterial() {
        List list = getSessionFactory().getCurrentSession().createQuery("from Materiais").list();
        return list;
    }
	
	public List<Materiais> exportMaterial(Date dataInicial, Date dataFinal) {
//      List list = getSessionFactory().getCurrentSession().createQuery("from  Safx04").list();
		
		Criteria crit = getSessionFactory().getCurrentSession().createCriteria(Materiais.class);
				crit.add(Restrictions.between("dataMatrial", dataInicial, dataFinal));
				
      return crit.list();
	}
		
	
}
