package com.github.unijobs.api.services;

import com.github.unijobs.api.model.Category;
import com.github.unijobs.api.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public Category update (Category category) {
        return categoryRepository.save(category);
    }

    public Optional<Category> findOne(Long id) {
        return categoryRepository.findById(id);
    }

    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }
}
