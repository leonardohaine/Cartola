package br.com.control.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.control.dao.MaterialDAO;
import br.com.control.model.Materiais;


@Service("MaterialService")
@Transactional(readOnly = true)
public class MaterialService {

	@Autowired
	MaterialDAO materialDAO;

	@Transactional(readOnly = false)
	public void saveMaterial(Materiais material) {
		getMaterialDAO().saveMaterial(material);
	}
	
	@Transactional(readOnly = false)
	public String getSequenceMaterial(){
		return getMaterialDAO().getSequenceMaterial();
	}
	
	@Transactional(readOnly = false)
    public void deleteMaterial(Materiais material) {
		getMaterialDAO().deleteMaterial(material);
    }
	
	@Transactional(readOnly = false)
    public void updateMaterial(Materiais material) {
		getMaterialDAO().updateMaterial(material);
    }
	

	public Materiais getMaterialById(String id) {
        return getMaterialDAO().getMaterialById(id);
    }
		
	
	/**
	 * @return the MaterialDAO
	 */
	public MaterialDAO getMaterialDAO() {
		return materialDAO;
	}

	/**
	 * @param MaterialDAO the MaterialDAO to set
	 */
	public void setSafx04DAO(MaterialDAO materialDAO) {
		this.materialDAO = materialDAO;
	}
	
	public List<Materiais> getMaterial() {
        return getMaterialDAO().getMaterial();
    }
	
	public List<Materiais> exportMaterial(Date dataInicial, Date dataFinal) {
        return getMaterialDAO().exportMaterial(dataInicial, dataFinal);
    }
		
}
