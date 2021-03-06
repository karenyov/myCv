package com.project.myCv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.myCv.model.Language;
import com.project.myCv.repository.LanguageRepository;

/**
 * @author Karen 27 de fev de 2018
 */
@Service("languageService")
public class LanguageServiceImpl implements LanguageService {

	@Autowired
	private LanguageRepository languageRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.project.myCv.service.LanguageService#findAll(org.springframework.data
	 * .domain.Pageable)
	 */
	@Override
	public Page<Language> findAll(Pageable pageable) {
		return languageRepository.findAll(pageable);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.project.myCv.service.LanguageService#findOne(java.lang.Long)
	 */
	@Override
	public Language findOne(Long id) {
		// TODO Auto-generated method stub
		return languageRepository.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.project.myCv.service.LanguageService#save(com.project.myCv.model.
	 * Language)
	 */
	@Override
	public Language save(Language language) {
		// TODO Auto-generated method stub
		language.setActive(true);
		return languageRepository.save(language);
	}

	/* (non-Javadoc)
	 * @see com.project.myCv.service.LanguageService#findByDescription(java.lang.String, org.springframework.data.domain.Pageable)
	 */
	@Override
	public Page<Language> findByDescriptionContaining(String search, Pageable pageable) {
		// TODO Auto-generated method stub
		return languageRepository.findByDescriptionContaining(search, pageable);
	}

	/* (non-Javadoc)
	 * @see com.project.myCv.service.LanguageService#findByActive(java.lang.Boolean)
	 */
	@Override
	public List<Language> findByActive(Boolean active) {
		return languageRepository.findByActive(active);
	}

}
