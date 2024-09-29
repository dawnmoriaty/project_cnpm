package com.example.project.controller;

import com.example.project.service.CloudinaryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Controller
@AllArgsConstructor
public class CloudinaryController {

    private final CloudinaryService cloudinaryService;


    @GetMapping("/upload")
    public String showUploadForm() {
        return "upload"; // Tên file template (ví dụ: upload.html hoặc upload.jsp)
    }

    @PostMapping("/upload")
    public String uploadImage(@RequestParam("file") MultipartFile file, Model model) {
        try {
            Map<String, Object> uploadResult = cloudinaryService.uploadImage(file);
            model.addAttribute("imageUrl", uploadResult.get("url")); // Lấy URL ảnh đã upload
        } catch (IOException e) {
            model.addAttribute("error", "Upload failed: " + e.getMessage());
        }
        return "upload"; // Trả về template để hiển thị kết quả
    }
}