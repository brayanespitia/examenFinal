package com.visitas.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.visitas.model.dao.IRolDao;
import com.visitas.model.dao.ITipoDao;
import com.visitas.model.entities.Rol;
import com.visitas.model.entities.Tipo;


@Service
public class TipoServiceImp<T> implements IGenericService2<T> {
	
	@Autowired
	private ITipoDao tipoDao;
		
	@Transactional(readOnly = true)
	@Override
	public T findOne(Integer id) {		
		// TODO Auto-generated method stub
		return (T) tipoDao.findById(id).orElse(null);
	}

	@Transactional(readOnly = true)
	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return (List<T>) tipoDao.findAll();
	}

	@Transactional
	@Override
	public void save(T entity) {
		// TODO Auto-generated method stub		
		tipoDao.save((Tipo)entity);		
	}
	
	@Transactional
	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		tipoDao.delete((Tipo) entity);
		
	}

	@Transactional
	@Override
	public void deleteById(Integer entityId) {
		// TODO Auto-generated method stub
		tipoDao.deleteById(entityId);
	}

	

}
