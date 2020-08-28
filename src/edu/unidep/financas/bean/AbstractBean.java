package edu.unidep.financas.bean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.unidep.financas.model.BaseEntity;

public abstract class AbstractBean<T extends BaseEntity> {

	@PersistenceContext(unitName = "Financas")
	private EntityManager entity;
	
	public abstract Class<T> getClasse();
	
	public T inserir(T obj)throws Exception {
		entity.persist(obj);
		entity.flush();
		return obj;
	}
	
	public T alterar(T obj) throws Exception {
		T old = entity.find(getClasse(), obj.getId());
		obj = entity.merge(obj);
		entity.flush();
		return obj;
	}
	
	public T salvar(T obj) throws Exception {
		if (obj.getId() == null) {
			return inserir(obj);
		}else {
			return alterar(obj);
		}
	}
}
