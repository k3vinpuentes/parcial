package co.edu.unbosque.parcial.service;

import java.util.List;


public interface CRUDOperation<T> {
	
	public int crear(T dato);
	
	public int eliminarPorId(Long id);
		
	public List<T> getAll();
	
	public int actualizarPorId(Long id, T nuevoDato);
	
	public boolean exist(Long id);

}
