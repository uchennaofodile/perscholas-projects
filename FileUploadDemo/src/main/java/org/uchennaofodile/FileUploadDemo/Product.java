package org.uchennaofodile.FileUploadDemo;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Product implements Serializable
{
    static final long serialVersionUID = 74458L;
    
    @Nonnull
    @Size (min=1, max=10)
    String name;
    String description ;
    List<MultipartFile> images;
}


