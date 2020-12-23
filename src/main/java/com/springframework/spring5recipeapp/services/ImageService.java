package com.springframework.spring5recipeapp.services;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {
    public void saveImageFile(Long id, MultipartFile file);
}
