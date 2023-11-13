package com.zebodexx.workshopmongo.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zebodexx.workshopmongo.domain.Post;
import com.zebodexx.workshopmongo.repository.PostRepository;
import com.zebodexx.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found !!"));
	}

	public List<Post> findbyTitle(String text) {
		return repo.findByTitleContainingIgnoreCase(text);
	}

	public List<Post> searchTitle(String text) {
		return repo.searchTitle(text);
	}

	public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
		maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
		return repo.fullSearch(text, minDate, maxDate);
	}
}
